package com.houseaccents.fedex.dto.request;

public class Containers {
    private String offeror;
    private HazardousCommodities hazardousCommodities;
    private int numberOfContainers;
    private String containerType;
    private EmergencyContactNumber emergencyContactNumber;
    private Packaging packaging;
    private String packingType;
    private String radioactiveContainerClass;
    
    public String getOfferor() {
        return offeror;
    }
    public void setOfferor(String offeror) {
        this.offeror = offeror;
    }
    public HazardousCommodities getHazardousCommodities() {
        return hazardousCommodities;
    }
    public void setHazardousCommodities(HazardousCommodities hazardousCommodities) {
        this.hazardousCommodities = hazardousCommodities;
    }
    public int getNumberOfContainers() {
        return numberOfContainers;
    }
    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
    public String getContainerType() {
        return containerType;
    }
    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }
    public EmergencyContactNumber getEmergencyContactNumber() {
        return emergencyContactNumber;
    }
    public void setEmergencyContactNumber(EmergencyContactNumber emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }
    public Packaging getPackaging() {
        return packaging;
    }
    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }
    public String getPackingType() {
        return packingType;
    }
    public void setPackingType(String packingType) {
        this.packingType = packingType;
    }
    public String getRadioactiveContainerClass() {
        return radioactiveContainerClass;
    }
    public void setRadioactiveContainerClass(String radioactiveContainerClass) {
        this.radioactiveContainerClass = radioactiveContainerClass;
    }
}
