package com.houseaccents.fedex.dto.response;

import java.util.ArrayList;

public class Output{
    private ArrayList<Alert> alerts;
    private ArrayList<RateReplyDetail> rateReplyDetails;
    private String quoteDate;
    private boolean encoded;
    
    public ArrayList<Alert> getAlerts() {
        return alerts;
    }
    public void setAlerts(ArrayList<Alert> alerts) {
        this.alerts = alerts;
    }
    public ArrayList<RateReplyDetail> getRateReplyDetails() {
        return rateReplyDetails;
    }
    public void setRateReplyDetails(ArrayList<RateReplyDetail> rateReplyDetails) {
        this.rateReplyDetails = rateReplyDetails;
    }
    public String getQuoteDate() {
        return quoteDate;
    }
    public void setQuoteDate(String quoteDate) {
        this.quoteDate = quoteDate;
    }
    public boolean isEncoded() {
        return encoded;
    }
    public void setEncoded(boolean encoded) {
        this.encoded = encoded;
    }
}
