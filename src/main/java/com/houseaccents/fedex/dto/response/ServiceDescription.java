package com.houseaccents.fedex.dto.response;

import java.util.ArrayList;

public class ServiceDescription{
    private String serviceId;
    private String serviceType;
    private String code;
    private ArrayList<Name> names;
    private String serviceCategory;
    private String description;
    private String astraDescription;
    
    public String getServiceId() {
        return serviceId;
    }
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
    public String getServiceType() {
        return serviceType;
    }
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public ArrayList<Name> getNames() {
        return names;
    }
    public void setNames(ArrayList<Name> names) {
        this.names = names;
    }
    public String getServiceCategory() {
        return serviceCategory;
    }
    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAstraDescription() {
        return astraDescription;
    }
    public void setAstraDescription(String astraDescription) {
        this.astraDescription = astraDescription;
    }
}
