package com.houseaccents.fedex.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.lang.Boolean;
import java.math.BigDecimal;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.stream.Collectors;
import java.nio.charset.StandardCharsets;

import com.houseaccents.fedex.dto.AuthErrorResponse;
import com.houseaccents.fedex.dto.AuthResponse;
import com.houseaccents.fedex.dto.AuthSuccessResponse;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.ServiceUtil;
import com.houseaccents.fedex.services.util.FedexRequestHandler;

import com.houseaccents.fedex.services.util.FedexPropertiesUtil;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.base.util.UtilMisc;
import org.apache.ofbiz.base.util.UtilProperties;
import org.apache.ofbiz.base.util.UtilValidate;
import com.houseaccents.fedex.carriers.ShippingCarrierServices;
import com.houseaccents.fedex.dto.RateAndTransitTimesRequest;
import com.houseaccents.fedex.dto.RateAndTransitTimesResponse;
import com.houseaccents.fedex.dto.response.Output;
import com.houseaccents.fedex.dto.response.RateAndTransitTimesError;
import com.houseaccents.fedex.dto.response.RateAndTransitTimesSuccess;
import com.houseaccents.fedex.dto.response.RateReplyDetail;
import com.houseaccents.fedex.dto.response.RatedShipmentDetail;

import org.apache.ofbiz.entity.util.EntityQuery;
import org.apache.ofbiz.entity.util.EntityUtilProperties;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;

public class FedexServicesImpl implements ShippingCarrierServices {
    
    private static final String MODULE = FedexServicesImpl.class.getName();
    private static final String SHIPINGCARRIER_PROPERTIES_FILE = "shippingcarrier.properties";
    private static final String RES_ERROR = "FedexUiLabels";
    
    @Override
    public AuthResponse auth(Delegator delegator, String resource, String productStoreId, String shipmentGatewayConfigId) {
        AuthResponse authResponse = new AuthResponse();
        try {
            FedexPropertiesUtil fedPropUtil = new FedexPropertiesUtil(delegator, resource, productStoreId, shipmentGatewayConfigId);
            String grantType = fedPropUtil.getShipmentGatewayConfigValue("grantType", "shipment.fedex.connect.url");
            String clientId =fedPropUtil.getShipmentGatewayConfigValue("clientId", "shipment.fedex.auth.client_id");
            String clientSecret = fedPropUtil.getShipmentGatewayConfigValue("clientSecret", "shipment.fedex.auth.client_secret");
            String authUrl = fedPropUtil.getShipmentGatewayConfigValue("authUrl", "shipment.fedex.auth.url");
            
            HttpClient client = HttpClient.newHttpClient();
            Map<String, String> params = UtilMisc.toMap("grant_type", grantType, "client_id", clientId, "client_secret", clientSecret);
            
            String form = params.entrySet()
                    .stream()
                    .map(e -> e.getKey() + "=" + java.net.URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
                    .collect(Collectors.joining("&"));
            
            
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new java.net.URI(authUrl))
                    .headers("Content-Type", "application/x-www-form-urlencoded")
                    .POST(HttpRequest.BodyPublishers.ofString(form))
                    .build();
            HttpResponse<?> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            String tokenJSON = null;
            if(200 == response.statusCode()) {
                tokenJSON = response.body().toString();
                authResponse.setIsSuccess(Boolean.TRUE);
                setAuthResponse(tokenJSON, authResponse, Boolean.TRUE);
            }else {
                setAuthResponse(tokenJSON, authResponse, Boolean.FALSE);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        return authResponse;
    }
    
    
    public static Map<String, Object> fedexRateAndTransitTimes(DispatchContext dctx, Map<String, ? extends Object> context) {
        Delegator delegator = dctx.getDelegator();
        Map<String, Object> result = new HashMap<String, Object>();
        
        
        Debug.logInfo("\n===============================\n context  : " + context+"\n===============================\n", MODULE);
        
        String resource = (context.get("serviceConfigProps") != null)? (String) context.get("serviceConfigProps") : SHIPINGCARRIER_PROPERTIES_FILE;
        String shipmentGatewayConfigId = (String) context.get("shipmentGatewayConfigId");
        String productStoreId = (String) context.get("productStoreId");
        
        Debug.logInfo("Fedex  dctx  : " + dctx, MODULE);
        FedexServicesImpl fdx = new FedexServicesImpl();
        AuthResponse token = fdx.auth(delegator, resource, productStoreId, shipmentGatewayConfigId);
        
        FedexPropertiesUtil fedPropUtil = new FedexPropertiesUtil(delegator, resource, productStoreId, shipmentGatewayConfigId);
        
        String rateQuotesUrl = fedPropUtil.getShipmentGatewayConfigValue("rateUrl", "shipment.fedex.rates.quotes.url");
        
        String shipmentMethodTypeId = (String) context.get("shipmentMethodTypeId");
        if ("NO_SHIPPING".equals(shipmentMethodTypeId)) {
            result = ServiceUtil.returnSuccess();
            result.put("shippingEstimateAmount", null);
            return result;
        }
        
        BigDecimal shippableWeight = (BigDecimal) context.get("shippableWeight");
        if (shippableWeight.compareTo(BigDecimal.ZERO) == 0) {
            // TODO: should we return an error, or $0.00 ?
            return ServiceUtil.returnFailure(UtilProperties.getMessage(RES_ERROR,
                    "Fedex.FacilityShipmentShippableWeightMustGreaterThanZero", (Locale) context.get("locale")));
        }
        
        FedexRequestHandler requestHandler = new FedexRequestHandler(context, delegator, fedPropUtil, resource);
        RateAndTransitTimesRequest requestPayload = null;
        try {
            requestPayload = requestHandler.getRateAndTransitTimesRequest();
        }catch(Exception e) {
            return ServiceUtil.returnError(e.getLocalizedMessage());
        }
        try {
            Debug.logInfo("\n===============================\n token  : " + token+"\n===============================\n", MODULE);
            
            if(token.getIsSuccess()) {
                HttpClient client = HttpClient.newHttpClient();
                ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
                String json = ow.writeValueAsString(requestPayload);
                
                Debug.logInfo("\n===============================\n json  : " + json+"\n===============================\n", MODULE);
                String bearerStr = "Bearer "+token.getSuccess().getAccess_token();
                
                Debug.logInfo("\n===============================\n bearerStr  : " + bearerStr+"\n===============================\n", MODULE);
                String localeStr = EntityUtilProperties.getPropertyValue(resource, "shipment.fedex.rates.quotes.x-locale", delegator);
                HttpRequest httpRequest = HttpRequest.newBuilder()
                        .uri(new java.net.URI(rateQuotesUrl))
                        .headers("Content-Type", "application/json")
                        .headers("Accept", "application/json")
                        .headers("X-locale", localeStr)
                        .headers("Authorization", bearerStr)
                        .POST(HttpRequest.BodyPublishers.ofString(json))
                        .build();
                
                HttpResponse<?> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
                
                Debug.logInfo("\n===============================\n response  : " + response+"\n===============================\n", MODULE);
                Debug.logInfo("\n===============================\n response Body : " + response.body()+"\n===============================\n", MODULE);
                
                RateAndTransitTimesResponse apiResponse = getRateResponse(response.body().toString(), 200 == response.statusCode());
                    
                if(apiResponse.getIsSuccess()) {
                    Output output = apiResponse.getSucess().getOutput();
                    Debug.logInfo("\n===============================\n apiResponse.getSucess().getOutput()  : " + apiResponse.getSucess().getOutput()+"\n===============================\n", MODULE);
                    ArrayList<RateReplyDetail> rateReplies =  output.getRateReplyDetails();
                    if(UtilValidate.isNotEmpty(rateReplies)) {
                        RateReplyDetail rateReply = rateReplies.get(0);
                        List<RatedShipmentDetail> ratedShipmentDetails = rateReply.getRatedShipmentDetails();
                        if(UtilValidate.isNotEmpty(ratedShipmentDetails)) {
                            RatedShipmentDetail ratedShipmentDetail = ratedShipmentDetails.get(0);
                            
                            //Setting the cost estimates.
                            if(UtilValidate.isNotEmpty(ratedShipmentDetail)) {
                                result.put("shippingEstimateAmount", new BigDecimal(ratedShipmentDetail.getTotalNetFedExCharge()));
                            }
                        }
                    }
                }else {
                    result.put("shippingEstimateAmount", BigDecimal.ZERO);
                    Debug.logInfo("\n===============================\n apiResponse.getSucess().getOutput()  : " + apiResponse.getError().getErrors().get(0)+"\n===============================\n", MODULE);
                }
            }
            
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }

    private void setAuthResponse(String jsonStr, AuthResponse authResponse, boolean isSuccess) throws JsonMappingException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        if(isSuccess) {
            authResponse.setSuccess(objectMapper.readValue(jsonStr, AuthSuccessResponse.class));
        }else {
            authResponse.setError(objectMapper.readValue(jsonStr, AuthErrorResponse.class));
        }
    }
    
    private static RateAndTransitTimesResponse getRateResponse(String jsonStr, boolean isSuccess) throws JsonMappingException, JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        RateAndTransitTimesResponse apiResponse = new RateAndTransitTimesResponse();
        if(isSuccess) {
            apiResponse.setIsSuccess(isSuccess);
            apiResponse.setSucess(objectMapper.readValue(jsonStr, RateAndTransitTimesSuccess.class));
        }else {
            apiResponse.setError(objectMapper.readValue(jsonStr, RateAndTransitTimesError.class));
        }
        return apiResponse;
    }
}
