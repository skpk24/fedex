package com.houseaccents.fedex.dto.response;

public class VariableHandlingCharge {
    private double totalCustomerCharge;
    private double variableHandlingCharge;
    public double getTotalCustomerCharge() {
        return totalCustomerCharge;
    }
    public void setTotalCustomerCharge(double totalCustomerCharge) {
        this.totalCustomerCharge = totalCustomerCharge;
    }
    public double getVariableHandlingCharge() {
        return variableHandlingCharge;
    }
    public void setVariableHandlingCharge(double variableHandlingCharge) {
        this.variableHandlingCharge = variableHandlingCharge;
    }
}
