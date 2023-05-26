package com.houseaccents.fedex.services.util;

import java.util.Locale;
import java.util.Map;

import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.base.util.UtilValidate;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.util.EntityQuery;
import org.apache.ofbiz.entity.util.EntityUtilProperties;

public class FedexPropertiesUtil {
    private static final String MODULE = FedexPropertiesUtil.class.getName();
    private Delegator delegator;
    private String resource;
    private String productStoreId;
    private String shipmentGatewayConfigId;
    
    
    public FedexPropertiesUtil(Delegator delegator, String properties, String productStoreId, String shipmentGatewayConfigId) {
        this.delegator = delegator;
        this.resource = properties;
        this.productStoreId = productStoreId;
        this.shipmentGatewayConfigId = shipmentGatewayConfigId;
    }
    
    public String getShipmentGatewayConfigValue(String shipmentGatewayConfigParameterName, String parameterName) {
        String returnValue = "";
        if (UtilValidate.isNotEmpty(shipmentGatewayConfigId)) {
            try {
                GenericValue fedex = EntityQuery.use(delegator).from("ShipmentGatewayFedexRate").where("shipmentGatewayConfigId",
                        shipmentGatewayConfigId,"productStoreId", productStoreId).queryOne();
                if (fedex != null) {
                    Object fedexField = fedex.get(shipmentGatewayConfigParameterName);
                    if (fedexField != null) {
                        returnValue = fedexField.toString().trim();
                    }
                }
            } catch (GenericEntityException e) {
                Debug.logError(e, MODULE);
            }
        } else {
            String value = EntityUtilProperties.getPropertyValue(resource, parameterName, delegator);
            if (value != null) {
                returnValue = value.trim();
            }
        }
        return returnValue;
    }
}
