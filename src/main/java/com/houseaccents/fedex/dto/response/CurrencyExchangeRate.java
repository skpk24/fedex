package com.houseaccents.fedex.dto.response;

public class CurrencyExchangeRate {
    private String fromCurrency;
    private String intoCurrency;
    private double rate;
    public String getFromCurrency() {
        return fromCurrency;
    }
    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }
    public String getIntoCurrency() {
        return intoCurrency;
    }
    public void setIntoCurrency(String intoCurrency) {
        this.intoCurrency = intoCurrency;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
}
