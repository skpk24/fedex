package com.houseaccents.fedex.dto.request;

public class BatteryDetails {
    private String material;
    private String regulatorySubType;
    private String packing;
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getRegulatorySubType() {
        return regulatorySubType;
    }
    public void setRegulatorySubType(String regulatorySubType) {
        this.regulatorySubType = regulatorySubType;
    }
    public String getPacking() {
        return packing;
    }
    public void setPacking(String packing) {
        this.packing = packing;
    }
}
