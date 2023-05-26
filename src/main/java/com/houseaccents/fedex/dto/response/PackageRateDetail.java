package com.houseaccents.fedex.dto.response;

import java.util.ArrayList;

public class PackageRateDetail{
    private String rateType;
    private String ratedWeightMethod;
    private double baseCharge;
    private double netFreight;
    private double totalSurcharges;
    private double netFedExCharge;
    private double totalTaxes;
    private double netCharge;
    private double totalRebates;
    private BillingWeight billingWeight;
    private double totalFreightDiscounts;
    private ArrayList<Surcharge> surcharges;
    private String currency;
    
    
    public String getRateType() {
        return rateType;
    }
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }
    public String getRatedWeightMethod() {
        return ratedWeightMethod;
    }
    public void setRatedWeightMethod(String ratedWeightMethod) {
        this.ratedWeightMethod = ratedWeightMethod;
    }
    public double getBaseCharge() {
        return baseCharge;
    }
    public void setBaseCharge(double baseCharge) {
        this.baseCharge = baseCharge;
    }
    public double getNetFreight() {
        return netFreight;
    }
    public void setNetFreight(double netFreight) {
        this.netFreight = netFreight;
    }
    public double getTotalSurcharges() {
        return totalSurcharges;
    }
    public void setTotalSurcharges(double totalSurcharges) {
        this.totalSurcharges = totalSurcharges;
    }
    public double getNetFedExCharge() {
        return netFedExCharge;
    }
    public void setNetFedExCharge(double netFedExCharge) {
        this.netFedExCharge = netFedExCharge;
    }
    public double getTotalTaxes() {
        return totalTaxes;
    }
    public void setTotalTaxes(double totalTaxes) {
        this.totalTaxes = totalTaxes;
    }
    public double getNetCharge() {
        return netCharge;
    }
    public void setNetCharge(double netCharge) {
        this.netCharge = netCharge;
    }
    public double getTotalRebates() {
        return totalRebates;
    }
    public void setTotalRebates(double totalRebates) {
        this.totalRebates = totalRebates;
    }
    public BillingWeight getBillingWeight() {
        return billingWeight;
    }
    public void setBillingWeight(BillingWeight billingWeight) {
        this.billingWeight = billingWeight;
    }
    public double getTotalFreightDiscounts() {
        return totalFreightDiscounts;
    }
    public void setTotalFreightDiscounts(double totalFreightDiscounts) {
        this.totalFreightDiscounts = totalFreightDiscounts;
    }
    public ArrayList<Surcharge> getSurcharges() {
        return surcharges;
    }
    public void setSurcharges(ArrayList<Surcharge> surcharges) {
        this.surcharges = surcharges;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}