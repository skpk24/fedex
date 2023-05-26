package com.houseaccents.fedex.dto.request;

import java.util.ArrayList;

public class RequestedShipment {
    private String pickupType;
    Recipient recipientObject;
    private ArrayList<RequestedPackageLineItems> requestedPackageLineItems;
    Shipper shipperObject;
    private String serviceType;
    EmailNotificationDetail emailNotificationDetailObject;
    private String preferredCurrency;
    private ArrayList <String> rateRequestType;
    private String shipDateStamp;
    private boolean documentShipment;
    VariableHandlingChargeDetail variableHandlingChargeDetailObject;
    private String packagingType;
    private double totalPackageCount;
    private double totalWeight;
    ShipmentSpecialServices shipmentSpecialServicesObject;
    CustomsClearanceDetail customsClearanceDetailObject;
    private boolean groupShipment;
    ServiceTypeDetail serviceTypeDetailObject;
    SmartPostInfoDetail smartPostInfoDetailObject;
    ExpressFreightDetail expressFreightDetailObject;
    private boolean groundShipment;


    // Getter Methods 

    public String getPickupType() {
     return pickupType;
    }

    public Recipient getRecipient() {
     return recipientObject;
    }

    public Shipper getShipper() {
     return shipperObject;
    }

    public String getServiceType() {
     return serviceType;
    }

    public EmailNotificationDetail getEmailNotificationDetail() {
     return emailNotificationDetailObject;
    }

    public String getPreferredCurrency() {
     return preferredCurrency;
    }

    public String getShipDateStamp() {
     return shipDateStamp;
    }

    public boolean getDocumentShipment() {
     return documentShipment;
    }

    public VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
     return variableHandlingChargeDetailObject;
    }

    public String getPackagingType() {
     return packagingType;
    }

    public double getTotalPackageCount() {
     return totalPackageCount;
    }

    public double getTotalWeight() {
     return totalWeight;
    }

    public ShipmentSpecialServices getShipmentSpecialServices() {
     return shipmentSpecialServicesObject;
    }

    public CustomsClearanceDetail getCustomsClearanceDetail() {
     return customsClearanceDetailObject;
    }

    public boolean getGroupShipment() {
     return groupShipment;
    }

    public ServiceTypeDetail getServiceTypeDetail() {
     return serviceTypeDetailObject;
    }

    public SmartPostInfoDetail getSmartPostInfoDetail() {
     return smartPostInfoDetailObject;
    }

    public ExpressFreightDetail getExpressFreightDetail() {
     return expressFreightDetailObject;
    }

    public boolean getGroundShipment() {
     return groundShipment;
    }

    // Setter Methods 

    public void setPickupType(String pickupType) {
     this.pickupType = pickupType;
    }

    public void setRecipient(Recipient recipientObject) {
     this.recipientObject = recipientObject;
    }

    public void setShipper(Shipper shipperObject) {
     this.shipperObject = shipperObject;
    }

    public void setServiceType(String serviceType) {
     this.serviceType = serviceType;
    }

    public void setEmailNotificationDetail(EmailNotificationDetail emailNotificationDetailObject) {
     this.emailNotificationDetailObject = emailNotificationDetailObject;
    }

    public void setPreferredCurrency(String preferredCurrency) {
     this.preferredCurrency = preferredCurrency;
    }

    public void setShipDateStamp(String shipDateStamp) {
     this.shipDateStamp = shipDateStamp;
    }

    public void setDocumentShipment(boolean documentShipment) {
     this.documentShipment = documentShipment;
    }

    public void setVariableHandlingChargeDetail(VariableHandlingChargeDetail variableHandlingChargeDetailObject) {
     this.variableHandlingChargeDetailObject = variableHandlingChargeDetailObject;
    }

    public void setPackagingType(String packagingType) {
     this.packagingType = packagingType;
    }

    public void setTotalPackageCount(double totalPackageCount) {
     this.totalPackageCount = totalPackageCount;
    }

    public void setTotalWeight(double totalWeight) {
     this.totalWeight = totalWeight;
    }

    public void setShipmentSpecialServices(ShipmentSpecialServices shipmentSpecialServicesObject) {
     this.shipmentSpecialServicesObject = shipmentSpecialServicesObject;
    }

    public void setCustomsClearanceDetail(CustomsClearanceDetail customsClearanceDetailObject) {
     this.customsClearanceDetailObject = customsClearanceDetailObject;
    }

    public void setGroupShipment(boolean groupShipment) {
     this.groupShipment = groupShipment;
    }

    public void setServiceTypeDetail(ServiceTypeDetail serviceTypeDetailObject) {
     this.serviceTypeDetailObject = serviceTypeDetailObject;
    }

    public void setSmartPostInfoDetail(SmartPostInfoDetail smartPostInfoDetailObject) {
     this.smartPostInfoDetailObject = smartPostInfoDetailObject;
    }

    public void setExpressFreightDetail(ExpressFreightDetail expressFreightDetailObject) {
     this.expressFreightDetailObject = expressFreightDetailObject;
    }

    public void setGroundShipment(boolean groundShipment) {
     this.groundShipment = groundShipment;
    }

    public ArrayList <String> getRateRequestType() {
        return rateRequestType;
    }

    public void setRateRequestType(ArrayList <String> rateRequestType) {
        this.rateRequestType = rateRequestType;
    }

    public ArrayList<RequestedPackageLineItems> getRequestedPackageLineItems() {
        return requestedPackageLineItems;
    }

    public void setRequestedPackageLineItems(ArrayList<RequestedPackageLineItems> requestedPackageLineItems) {
        this.requestedPackageLineItems = requestedPackageLineItems;
    }

    
}
