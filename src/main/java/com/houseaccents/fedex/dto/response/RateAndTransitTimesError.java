package com.houseaccents.fedex.dto.response;

import java.util.ArrayList;

import com.houseaccents.fedex.dto.FedexResponse;

public class RateAndTransitTimesError extends FedexResponse {
    private String customerTransactionId;
    ArrayList<Error> errors;

    public String getCustomerTransactionId() {
     return customerTransactionId;
    }

    public void setCustomerTransactionId(String customerTransactionId) {
     this.customerTransactionId = customerTransactionId;
    }
    public ArrayList<Error> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<Error> errors) {
        this.errors = errors;
    }
}