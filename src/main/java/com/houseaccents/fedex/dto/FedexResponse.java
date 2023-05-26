package com.houseaccents.fedex.dto;

public class FedexResponse {
    
    private String transactionId;
    
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    
    @Override
    public String toString() {
        return "FedexResponse [transactionId=" + transactionId + "]";
    }
}
