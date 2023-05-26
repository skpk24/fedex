package com.houseaccents.fedex.dto.response;

import com.houseaccents.fedex.dto.FedexResponse;

public class RateAndTransitTimesSuccess  extends FedexResponse{
    private String customerTransactionId;
    private Output output;
    
    public Output getOutput() {
        return output;
    }
    public void setOutput(Output output) {
        this.output = output;
    }
    public String getCustomerTransactionId() {
        return customerTransactionId;
    }
    public void setCustomerTransactionId(String customerTransactionId) {
        this.customerTransactionId = customerTransactionId;
    }
    
    @Override
    public String toString() {
        return "RateAndTransitTimesSuccess [ customerTransactionId="
                + customerTransactionId + ", output=" + output + "]";
    }
}
