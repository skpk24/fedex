package com.houseaccents.fedex.carriers;

import com.houseaccents.fedex.dto.AuthResponse;
import org.apache.ofbiz.entity.Delegator;

public interface ShippingCarrierServices {
    
    public AuthResponse auth(Delegator delegator, String resource, String productStoreId, String shipmentGatewayConfigId);
}
