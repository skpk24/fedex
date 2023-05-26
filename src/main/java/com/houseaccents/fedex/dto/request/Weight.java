package com.houseaccents.fedex.dto.request;

public class Weight {
    private String units;
    private Double value;
    
    public String getUnits() {
        return units;
    }
    public void setUnits(String units) {
        this.units = units;
    }
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }
}
