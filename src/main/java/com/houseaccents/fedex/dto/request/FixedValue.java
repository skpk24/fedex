package com.houseaccents.fedex.dto.request;

public class FixedValue {
    private double amount;
    private String currency;
    
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}