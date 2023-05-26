package com.houseaccents.fedex.services.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.base.util.UtilGenerics;
import org.apache.ofbiz.base.util.UtilMisc;
import org.apache.ofbiz.base.util.UtilProperties;
import org.apache.ofbiz.base.util.UtilValidate;
import com.houseaccents.fedex.dto.RateAndTransitTimesRequest;
import com.houseaccents.fedex.dto.request.*;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.condition.EntityCondition;
import org.apache.ofbiz.entity.util.EntityQuery;
import org.apache.ofbiz.entity.util.EntityUtil;
import org.apache.ofbiz.entity.util.EntityUtilProperties;
import com.houseaccents.fedex.exception.UnableDetermineFeildException;

import com.houseaccents.fedex.services.util.FedexPropertiesUtil;

import org.apache.ofbiz.party.contact.ContactMechWorker;
import org.apache.ofbiz.product.store.ProductStoreWorker;


public class FedexRequestHandler {
    private static final String MODULE = FedexRequestHandler.class.getName();
    private Delegator delegator;
    private Map<String, ? extends Object> context;
    private String properties;
    private Locale locale;
    private GenericValue productStore;
    private FedexPropertiesUtil fedPropUtil;
    
    public FedexRequestHandler(Map<String, ? extends Object> context, Delegator delegator, FedexPropertiesUtil fedPropUtil, String properties) {
        this.delegator = delegator;
        this.context = context;
        this.properties = properties;
        this.locale = (Locale) context.get("locale");
        this.fedPropUtil = fedPropUtil;
        this.productStore = ProductStoreWorker.getProductStore(((String) context.get("productStoreId")), delegator);
    }
    
    
    public RateAndTransitTimesRequest getRateAndTransitTimesRequest() throws Exception {
        RateAndTransitTimesRequest rateReq = new RateAndTransitTimesRequest();
        
        String accountNumber = fedPropUtil.getShipmentGatewayConfigValue("accountNumber", "shipment.fedex.account.number");
        AccountNumber accNum = new AccountNumber(accountNumber);
        
        rateReq.setAccountNumber(accNum);
        
        rateReq.setRateRequestControlParameters(getRateRequestControlParameters());
        rateReq.setRequestedShipment(getRequestedShipment());
        
        //We can update the required carrier codes based on the requirements
        rateReq.setCarrierCodes(new ArrayList<String>(Arrays.asList(FedexCarrierCodes.FDXE.toString(), FedexCarrierCodes.FDXG.toString(), FedexCarrierCodes.FXSP.toString(), FedexCarrierCodes.FXCC.toString())));
        
        return rateReq;
    }
    
    
    private RateRequestControlParameters getRateRequestControlParameters() throws Exception {
        RateRequestControlParameters rateReq = new RateRequestControlParameters();
        rateReq.setRateSortOrder(FedexRateSortOrder.SERVICENAMETRADITIONAL.name());
        rateReq.setVariableOptions(FedexVariableOptions.SATURDAY_DELIVERY.name());
        rateReq.setReturnTransitTimes(Boolean.TRUE);
        rateReq.setServicesNeededOnRateFailure(Boolean.TRUE);
        return rateReq;
    }
    
    private RequestedShipment getRequestedShipment() throws Exception {
        RequestedShipment reqstdShipment = new RequestedShipment(); 
        
        Shipper shipper = new Shipper();
        shipper.setAddress(getShipperAddress());
        
        reqstdShipment.setShipper(shipper);
        
        Recipient recipient = new Recipient();
        recipient.setAddress(getRecipientAddress());
        
        reqstdShipment.setRecipient(recipient);
        
        reqstdShipment.setServiceType(getServiceType());
        
        String pickupType = fedPropUtil.getShipmentGatewayConfigValue("pickupType", "shipment.fedex.pickup.type");
        reqstdShipment.setPickupType(pickupType);
        
        reqstdShipment.setPreferredCurrency(productStore.getString("defaultCurrencyUomId"));
        
        reqstdShipment.setRateRequestType(new ArrayList(Arrays.asList(FedexRateRequestType.ACCOUNT.toString())));
        
        
        reqstdShipment.setRequestedPackageLineItems(prepareLineItems());
        
        
        //Date can be updated
        //reqstdShipment.setShipDateStamp();
        
        //Update the document Shipment
        //reqstdShipment.setDocumentShipment(false);
        
        //Set group shipment flag
        //reqstdShipment.setGroundShipment(false);
        
        reqstdShipment.setTotalWeight(((BigDecimal)context.get("shippableWeight")).doubleValue());
        
        //Specify the ground shipment
        //reqstdShipment.setGroundShipment(false);
        
        //Specity if its groupShipment 
        //reqstdShipment.setGroupShipment(false);
        
        String packageType = fedPropUtil.getShipmentGatewayConfigValue("defaultPackagingType", "shipment.fedex.packagingType");
        reqstdShipment.setPackagingType(packageType);
        
        //Specity the total package count, not clear now. 
        //reqstdShipment.setTotalPackageCount(1);
        
        
        //Set the email notification
        reqstdShipment.setEmailNotificationDetail(getEmailNotificationDetail());
        
        return reqstdShipment;
    }
    
    private EmailNotificationDetail getEmailNotificationDetail() {
        EmailNotificationDetail emailNotDetails = new EmailNotificationDetail();
        
        String personalMessage = fedPropUtil.getShipmentGatewayConfigValue("emailMessage", "shipment.fedex.emailnotificationdetails.personalMessage");
        emailNotDetails.setPersonalMessage(personalMessage);
        
        emailNotDetails.setRecipients(getEmailRecipients());
        
        return emailNotDetails;
    }


    private ArrayList<EmailRecipient> getEmailRecipients() {
        ArrayList<EmailRecipient> recipients = new ArrayList<EmailRecipient>();
        String partyId = (String) context.get("partyId");
        
        //Resturn null if party Id doesn't exists.
        if(partyId == null) {
            return null;
        }
        
        try {
            List<GenericValue> pcms = EntityQuery.use(delegator).from("PartyAndContactMech")
            .where(EntityCondition.makeCondition(UtilMisc.toMap("partyId", partyId,"contactMechTypeId", "EMAIL_ADDRESS")))
            .orderBy("infoString").filterByDate().queryList();
            String localeStr = EntityUtilProperties.getPropertyValue(properties, "shipment.fedex.rates.quotes.x-locale", delegator);
            String notificationFmtType = fedPropUtil.getShipmentGatewayConfigValue("notificationFormatType", "shipment.fedex.notificationFormatType");
            String notificationType = fedPropUtil.getShipmentGatewayConfigValue("notificationType", "shipment.fedex.notificationType");
            if (pcms != null) {
                for (GenericValue pcm: pcms) {
                    EmailRecipient emailRecipient = new EmailRecipient();
                    emailRecipient.setEmailAddress(pcm.getString("infoString"));
                    emailRecipient.setLocale(localeStr);
                    emailRecipient.setEmailNotificationRecipientType(EmailNotificationRecipientType.RECIPIENT.name());
                    emailRecipient.setNotificationFormatType(notificationFmtType);
                    emailRecipient.setNotificationEventType(new String[]{NotificationEventType.ON_PICKUP.name(),NotificationEventType.ON_SHIPMENT.name(), NotificationEventType.ON_DELIVERY.name()});
                    emailRecipient.setNotificationType(notificationType);
                    
                    if(!"EMAIL".equalsIgnoreCase(notificationType)) {
                        
                        pcms = EntityQuery.use(delegator).from("PartyAndContactMech")
                                .where(EntityCondition.makeCondition(UtilMisc.toMap("partyId", partyId,"contactMechTypeId", "TELECOM_NUMBER")))
                                .filterByDate().queryList();
                        if(pcms != null) {
                            GenericValue pcmt = EntityUtil.getFirst(pcms);
                            if(pcmt != null) {
                                SMSDetail sms = new SMSDetail(); 
                                sms.setPhoneNumber(pcmt.getString("areaCode")+pcmt.getString("contactNumber"));
                                sms.setPhoneNumberCountryCode(pcmt.getString("countryCode"));
                                emailRecipient.setSmsDetail(sms);
                            }else {
                                Debug.logError("PartyAndContactMech Telephone not found for partyId: " +partyId , MODULE);
                            }
                        }
                        
                    }
                    recipients.add(emailRecipient);
                }
            }
        } catch (GenericEntityException e) {
            Debug.logError("PartyAndContactMech Email not found for partyId: " +partyId , MODULE);
        }
        
        return recipients;
    }


    private Address getShipperAddress() throws UnableDetermineFeildException{
        Address address = new Address();
     // get the origination ZIP
        
        String shippingContactMechId = (String) context.get("shippingContactMechId");
        
        String originationZip = null;
        String countryCode = null;
        String stateOrProvinceCode = null;
        
        GenericValue shipFromAddress = getShipFromAddress(shippingContactMechId);
        
        if (shipFromAddress != null) {
            originationZip = shipFromAddress.getString("postalCode");
            if (shipFromAddress.getString("countryGeoId") != null) {
                GenericValue geo = null;
                try {
                    geo = EntityQuery.use(delegator).from("Geo").where("geoId", shipFromAddress.getString("countryGeoId"), 
                            "geoTypeId", "COUNTRY").cache().queryFirst();
                } catch (GenericEntityException e) {
                    Debug.logError(e, MODULE);
                }
                if(geo != null) {
                    countryCode = geo.getString("geoCode");
                }
            }
            
            if (countryCode != null && "US".equals(countryCode)) {
                GenericValue stateProvinceGeo = null;
                try {
                    stateProvinceGeo = EntityQuery.use(delegator).from("Geo").where("geoId",
                            shipFromAddress.getString("stateProvinceGeoId")).cache().queryOne();
                } catch (GenericEntityException e) {
                    Debug.logError(e, MODULE);
                }
                stateOrProvinceCode = stateProvinceGeo.getString("geoCode");
            }
        }
        
        if (UtilValidate.isEmpty(originationZip)) {
            throw new UnableDetermineFeildException(UtilProperties.getMessage(properties,
                    "Fedex.FacilityShipmentUnableDetermineOriginationZip", locale));    
        }
        
        if(shipFromAddress != null) {
            address.setCity(shipFromAddress.getString("city"));
            address.setStateOrProvinceCode(stateOrProvinceCode);
            address.setResidential(Boolean.FALSE);
        }
        address.setPostalCode(originationZip);
        address.setCountryCode(countryCode);
        Debug.logInfo("\n\n address == "+address+"\n\n", MODULE);
        return address;
    }
    
    private GenericValue getShipFromAddress(String shippingContactMechId) {
        GenericValue shipFromAddress = null;
        try {
            if(shippingContactMechId != null) {
                shipFromAddress = EntityQuery.use(delegator).from("PostalAddress").where("contactMechId", shippingContactMechId).queryOne();
            }else if(productStore != null && productStore.get("inventoryFacilityId") != null) {
                GenericValue facilityContactMech = ContactMechWorker.getFacilityContactMechByPurpose(delegator, productStore
                        .getString("inventoryFacilityId"), UtilMisc.toList("SHIP_ORIG_LOCATION", "PRIMARY_LOCATION"));
                if (facilityContactMech != null) {
                    shipFromAddress = EntityQuery.use(delegator).from("PostalAddress").where("contactMechId", facilityContactMech
                            .getString("contactMechId")).queryOne();
                }
            }
        } catch (GenericEntityException e) {
            Debug.logError(e, MODULE);
        }
        return shipFromAddress;
    }
    
    private Address getRecipientAddress() throws UnableDetermineFeildException {
        Address address = new Address();
        
     // get the destination ZIP
        String destinationZip = null;
        String countryCode = null;
        String stateOrProvinceCode = null;
        String shippingContactMechId = (String) context.get("shippingContactMechId");
        GenericValue shipToAddress = null;
        if (UtilValidate.isNotEmpty(shippingContactMechId)) {
            try {
                shipToAddress = EntityQuery.use(delegator).from("PostalAddress").where("contactMechId",
                        shippingContactMechId).queryOne();
                if (shipToAddress != null) {
                    destinationZip = shipToAddress.getString("postalCode");
                    if (shipToAddress.getString("countryGeoId") != null) {
                        GenericValue geo = EntityQuery.use(delegator).from("Geo").where("geoId", shipToAddress.getString("countryGeoId"), 
                                "geoTypeId", "COUNTRY").cache().queryFirst();
                        if(geo != null) {
                            countryCode = geo.getString("geoCode");
                        }
                    }
                    
                    if (countryCode != null && "US".equals(countryCode)) {
                        GenericValue stateProvinceGeo = EntityQuery.use(delegator).from("Geo").where("geoId",
                                shipToAddress.getString("stateProvinceGeoId")).cache().queryOne();
                        stateOrProvinceCode = stateProvinceGeo.getString("geoCode");
                    }
                }
            } catch (GenericEntityException e) {
                Debug.logError(e, MODULE);
            }
        }
        if (UtilValidate.isEmpty(destinationZip)) {
            throw new UnableDetermineFeildException(UtilProperties.getMessage(properties,
                    "Fedex.FacilityShipmentUnableDetermineDestinationZip", locale));  
        }
        if(shipToAddress != null) {
            address.setCity(shipToAddress.getString("city"));
            address.setStateOrProvinceCode(stateOrProvinceCode);
        }
        address.setCity(shippingContactMechId);
        address.setPostalCode(destinationZip);
        address.setCountryCode(countryCode);
        return address;
    }
    
    private String getServiceType() throws UnableDetermineFeildException {
        String serviceType = null;
        
        try {
            GenericValue carrierShipmentMethod = EntityQuery.use(delegator).from("CarrierShipmentMethod")
                    .where("shipmentMethodTypeId", context.get("shipmentMethodTypeId"),
                           "partyId", context.get("carrierPartyId"),
                           "roleTypeId", context.get("carrierRoleTypeId"))
                    .queryOne();
            if (carrierShipmentMethod != null) {
                serviceType = carrierShipmentMethod.getString("carrierServiceCode").toUpperCase(Locale.getDefault());
            }
        } catch (GenericEntityException e) {
            Debug.logError(e, MODULE);
        }
        if (UtilValidate.isEmpty(serviceType)) {
            throw new UnableDetermineFeildException(UtilProperties.getMessage(properties,
                    "Fedex.FacilityShipmentUnableDetermineServiceCode", locale));
        }
        
        return serviceType;
    }
    
    private ArrayList<RequestedPackageLineItems> prepareLineItems() {
        List<Map<String, Object>> shippableItemInfo = UtilGenerics.cast(context.get("shippableItemInfo"));
        ArrayList<RequestedPackageLineItems> lineItems = new ArrayList<RequestedPackageLineItems>();
        
        RequestedPackageLineItems rplitem = new RequestedPackageLineItems();
        
        
        rplitem.setWeight(getWeight(shippableItemInfo));
        rplitem.setContentRecord(getContentRecord(shippableItemInfo));
        rplitem.setDeclaredValue(getDeclaredValue());
        lineItems.add(rplitem);
        
        
        return lineItems;
    }


    private DeclaredValue getDeclaredValue() {
        DeclaredValue declaredValue = new DeclaredValue();
        declaredValue.setAmount(((BigDecimal)context.get("shippableTotal")).doubleValue());
        declaredValue.setCurrency(productStore.getString("defaultCurrencyUomId"));
        return declaredValue;
    }


    private ContentRecord[] getContentRecord(List<Map<String, Object>> shippableItemInfo) {
        ContentRecord[] contentRecord = new ContentRecord[shippableItemInfo.size()];
        int i = 0; 
        for(Map<String, Object> item : shippableItemInfo) {
            ContentRecord record = new ContentRecord();
            record.setDescription((String) item.get("productId"));
            record.setItemNumber((String) item.get("productId"));
            record.setReceivedQuantity(((BigDecimal)item.get("quantity")).intValue());
            contentRecord[i++] = record;
        }
        return contentRecord;
    }


    private Weight getWeight(List<Map<String, Object>> shippableItemInfo) {
        int i = 0;
        BigDecimal totalWeight = BigDecimal.ZERO;
        String weightUomId = null;
        for(Map<String, Object> item: shippableItemInfo) {
            
            if(item != null && ((BigDecimal) item.get("quantity")).compareTo(BigDecimal.ZERO) > 0) {
                totalWeight = totalWeight.add(((BigDecimal)item.get("weight")).multiply((BigDecimal) item.get("quantity")));
            }
            weightUomId = (String) item.get("weightUomId");
        }
        Weight weight = new Weight();
        if(UtilValidate.isEmpty(weightUomId)) {
            try {
                GenericValue facililty = EntityQuery.use(delegator).from("Facility").where("facilityId", productStore.getString("inventoryFacilityId")).queryOne();
                weightUomId = facililty.getString("defaultWeightUomId");
            } catch (GenericEntityException e) {
                Debug.logError(e, MODULE);
            }
        }
        
        if("WT_lb".equalsIgnoreCase(weightUomId)){
            weight.setUnits(WeightUnits.LB.name());
        }
        if("WT_kg".equalsIgnoreCase(weightUomId)){
            weight.setUnits(WeightUnits.KG.name());
        }
        weight.setValue(totalWeight.doubleValue());
        return weight;
    }

}
