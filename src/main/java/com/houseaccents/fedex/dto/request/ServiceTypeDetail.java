package com.houseaccents.fedex.dto.request;

public class ServiceTypeDetail {
    private String carrierCode;
    private String description;
    private String serviceName;
    private String serviceCategory;


    // Getter Methods 

    public String getCarrierCode() {
     return carrierCode;
    }

    public String getDescription() {
     return description;
    }

    public String getServiceName() {
     return serviceName;
    }

    public String getServiceCategory() {
     return serviceCategory;
    }

    // Setter Methods 

    public void setCarrierCode(String carrierCode) {
     this.carrierCode = carrierCode;
    }

    public void setDescription(String description) {
     this.description = description;
    }

    public void setServiceName(String serviceName) {
     this.serviceName = serviceName;
    }

    public void setServiceCategory(String serviceCategory) {
     this.serviceCategory = serviceCategory;
    }
}