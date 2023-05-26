package com.houseaccents.fedex.dto.request;

public class AlcoholDetail {    
    private String alcoholRecipientType;
    private String shipperAgreementType;
    
    public String getAlcoholRecipientType() {
        return alcoholRecipientType;
    }
    public void setAlcoholRecipientType(String alcoholRecipientType) {
        this.alcoholRecipientType = alcoholRecipientType;
    }
    public String getShipperAgreementType() {
        return shipperAgreementType;
    }
    public void setShipperAgreementType(String shipperAgreementType) {
        this.shipperAgreementType = shipperAgreementType;
    }
}
