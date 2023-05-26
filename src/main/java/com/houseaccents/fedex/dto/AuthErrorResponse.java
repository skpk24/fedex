package com.houseaccents.fedex.dto;

public class AuthErrorResponse extends FedexResponse {
    private Error errors;

    public Error getErrors() {
        return errors;
    }

    public void setErrors(Error errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "AuthErrorResponse [errors=" + errors + "]";
    }
}
