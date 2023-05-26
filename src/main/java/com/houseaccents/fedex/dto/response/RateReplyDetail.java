package com.houseaccents.fedex.dto.response;

import java.util.ArrayList;

public class RateReplyDetail{
    private String serviceType;
    private String serviceName;
    private String packagingType;
    private ArrayList<CustomerMessages> customerMessages;
    private ArrayList<RatedShipmentDetail> ratedShipmentDetails;
    private OperationalDetail operationalDetail;
    private String signatureOptionType;
    private ServiceDescription serviceDescription;
    private Commit commit;
    private String deliveryStation;
    private ServiceSubOptionDetail serviceSubOptionDetail;
    private BrokerDetail brokerDetail;
    
    public String getServiceType() {
        return serviceType;
    }
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getPackagingType() {
        return packagingType;
    }
    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }
    public ArrayList<RatedShipmentDetail> getRatedShipmentDetails() {
        return ratedShipmentDetails;
    }
    public void setRatedShipmentDetails(ArrayList<RatedShipmentDetail> ratedShipmentDetails) {
        this.ratedShipmentDetails = ratedShipmentDetails;
    }
    public OperationalDetail getOperationalDetail() {
        return operationalDetail;
    }
    public void setOperationalDetail(OperationalDetail operationalDetail) {
        this.operationalDetail = operationalDetail;
    }
    public String getSignatureOptionType() {
        return signatureOptionType;
    }
    public void setSignatureOptionType(String signatureOptionType) {
        this.signatureOptionType = signatureOptionType;
    }
    public ServiceDescription getServiceDescription() {
        return serviceDescription;
    }
    public void setServiceDescription(ServiceDescription serviceDescription) {
        this.serviceDescription = serviceDescription;
    }
    
    public Commit getCommit() {
        return commit;
    }
    public void setCommit(Commit commit) {
        this.commit = commit;
    }
    public String getDeliveryStation() {
        return deliveryStation;
    }
    public void setDeliveryStation(String deliveryStation) {
        this.deliveryStation = deliveryStation;
    }
    public ServiceSubOptionDetail getServiceSubOptionDetail() {
        return serviceSubOptionDetail;
    }
    public void setServiceSubOptionDetail(ServiceSubOptionDetail serviceSubOptionDetail) {
        this.serviceSubOptionDetail = serviceSubOptionDetail;
    }
    public ArrayList<CustomerMessages> getCustomerMessages() {
        return customerMessages;
    }
    public void setCustomerMessages(ArrayList<CustomerMessages> customerMessages) {
        this.customerMessages = customerMessages;
    }
}
