package com.houseaccents.fedex.dto.request;

public class Quantity {
    private String quantityType;
    private double amount;
    private String units;
    public String getQuantityType() {
        return quantityType;
    }
    public void setQuantityType(String quantityType) {
        this.quantityType = quantityType;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getUnits() {
        return units;
    }
    public void setUnits(String units) {
        this.units = units;
    }
    
}   
