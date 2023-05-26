package com.houseaccents.fedex.dto.response;

import com.houseaccents.fedex.dto.response.Discount;

public class ShipmentLegRateDetail {
    private Discount discounts[];
    private String pricingCode;
    private String legDescription;
    private Surcharge surcharges[];
    private String specialRatingApplied[];
    private Taxes taxes[];
    private String rateScale;
    private double totalNetCharge;
    private double totalBaseCharge;
    private CurrencyExchangeRate currencyExchangeRate;
    private TotalBillingWeight totalBillingWeight;
    private String currency;
    public Discount[] getDiscounts() {
        return discounts;
    }
    public void setDiscounts(Discount[] discounts) {
        this.discounts = discounts;
    }
    public String getPricingCode() {
        return pricingCode;
    }
    public void setPricingCode(String pricingCode) {
        this.pricingCode = pricingCode;
    }
    public String getLegDescription() {
        return legDescription;
    }
    public void setLegDescription(String legDescription) {
        this.legDescription = legDescription;
    }
    public Surcharge[] getSurcharges() {
        return surcharges;
    }
    public void setSurcharges(Surcharge[] surcharges) {
        this.surcharges = surcharges;
    }
    public String[] getSpecialRatingApplied() {
        return specialRatingApplied;
    }
    public void setSpecialRatingApplied(String[] specialRatingApplied) {
        this.specialRatingApplied = specialRatingApplied;
    }
    public Taxes[] getTaxes() {
        return taxes;
    }
    public void setTaxes(Taxes[] taxes) {
        this.taxes = taxes;
    }
    public String getRateScale() {
        return rateScale;
    }
    public void setRateScale(String rateScale) {
        this.rateScale = rateScale;
    }
    public double getTotalNetCharge() {
        return totalNetCharge;
    }
    public void setTotalNetCharge(double totalNetCharge) {
        this.totalNetCharge = totalNetCharge;
    }
    public double getTotalBaseCharge() {
        return totalBaseCharge;
    }
    public void setTotalBaseCharge(double totalBaseCharge) {
        this.totalBaseCharge = totalBaseCharge;
    }
    public CurrencyExchangeRate getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }
    public void setCurrencyExchangeRate(CurrencyExchangeRate currencyExchangeRate) {
        this.currencyExchangeRate = currencyExchangeRate;
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
}
