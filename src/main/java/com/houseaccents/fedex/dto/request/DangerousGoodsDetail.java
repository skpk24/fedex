package com.houseaccents.fedex.dto.request;

public class DangerousGoodsDetail {
    private String offeror;
    private String accessibility;
    private String emergencyContactNumber;
    private String[] options;
    private Containers[] containers;
    private Packaging packaging;
    
    public String getOfferor() {
        return offeror;
    }
    public void setOfferor(String offeror) {
        this.offeror = offeror;
    }
    public String getAccessibility() {
        return accessibility;
    }
    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }
    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }
    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }
    public String[] getOptions() {
        return options;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
    public Containers[] getContainers() {
        return containers;
    }
    public void setContainers(Containers[] containers) {
        this.containers = containers;
    }
    public Packaging getPackaging() {
        return packaging;
    }
    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }
}
