package com.houseaccents.fedex.dto.response;

public class BillingWeight{
    private String units;
    private double value;
    
    public String getUnits() {
        return units;
    }
    public void setUnits(String units) {
        this.units = units;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
}
