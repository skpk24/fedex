package com.houseaccents.fedex.dto.response;

import java.util.ArrayList;

public class ShipmentRateDetail{
    private CurrencyExchangeRate currencyExchangeRate;
    private String rateZone;
    private int dimDivisor;
    private double fuelSurchargePercent;
    private double totalSurcharges;
    private double totalFreightDiscount;
    private ArrayList<Surcharge> surCharges;
    private String pricingCode;
    private TotalBillingWeight totalBillingWeight;
    private String currency;
    private String rateScale;
    private String specialRatingApplied[];
    private FreightDiscount freightDiscount[];
    private TotalDimWeight totalDimWeight;
    
    public String getRateZone() {
        return rateZone;
    }
    public void setRateZone(String rateZone) {
        this.rateZone = rateZone;
    }
    public int getDimDivisor() {
        return dimDivisor;
    }
    public void setDimDivisor(int dimDivisor) {
        this.dimDivisor = dimDivisor;
    }
    public double getFuelSurchargePercent() {
        return fuelSurchargePercent;
    }
    public void setFuelSurchargePercent(double fuelSurchargePercent) {
        this.fuelSurchargePercent = fuelSurchargePercent;
    }
    public double getTotalSurcharges() {
        return totalSurcharges;
    }
    public void setTotalSurcharges(double totalSurcharges) {
        this.totalSurcharges = totalSurcharges;
    }
    public double getTotalFreightDiscount() {
        return totalFreightDiscount;
    }
    public void setTotalFreightDiscount(double totalFreightDiscount) {
        this.totalFreightDiscount = totalFreightDiscount;
    }
    public ArrayList<Surcharge> getSurCharges() {
        return surCharges;
    }
    public void setSurCharges(ArrayList<Surcharge> surCharges) {
        this.surCharges = surCharges;
    }
    public String getPricingCode() {
        return pricingCode;
    }
    public void setPricingCode(String pricingCode) {
        this.pricingCode = pricingCode;
    }
    public TotalBillingWeight getTotalBillingWeight() {
        return totalBillingWeight;
    }
    public void setTotalBillingWeight(TotalBillingWeight totalBillingWeight) {
        this.totalBillingWeight = totalBillingWeight;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getRateScale() {
        return rateScale;
    }
    public void setRateScale(String rateScale) {
        this.rateScale = rateScale;
    }
    public CurrencyExchangeRate getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }
    public void setCurrencyExchangeRate(CurrencyExchangeRate currencyExchangeRate) {
        this.currencyExchangeRate = currencyExchangeRate;
    }
    public String[] getSpecialRatingApplied() {
        return specialRatingApplied;
    }
    public void setSpecialRatingApplied(String[] specialRatingApplied) {
        this.specialRatingApplied = specialRatingApplied;
    }
    public FreightDiscount[] getFreightDiscount() {
        return freightDiscount;
    }
    public void setFreightDiscount(FreightDiscount[] freightDiscount) {
        this.freightDiscount = freightDiscount;
    }
    public TotalDimWeight getTotalDimWeight() {
        return totalDimWeight;
    }
    public void setTotalDimWeight(TotalDimWeight totalDimWeight) {
        this.totalDimWeight = totalDimWeight;
    }
}