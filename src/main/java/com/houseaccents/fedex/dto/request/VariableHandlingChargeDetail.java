package com.houseaccents.fedex.dto.request;

public class VariableHandlingChargeDetail {
    private String rateElementBasis;
    private String rateType;
    private double percentValue;
    private String rateLevelType;
    FixedValue FixedValueObject;


    // Getter Methods 

    public String getRateElementBasis() {
     return rateElementBasis;
    }

    public String getRateType() {
     return rateType;
    }

    public double getPercentValue() {
     return percentValue;
    }

    public String getRateLevelType() {
     return rateLevelType;
    }

    public FixedValue getFixedValue() {
     return FixedValueObject;
    }

    // Setter Methods 

    public void setRateElementBasis(String rateElementBasis) {
     this.rateElementBasis = rateElementBasis;
    }

    public void setRateType(String rateType) {
     this.rateType = rateType;
    }

    public void setPercentValue(double percentValue) {
     this.percentValue = percentValue;
    }

    public void setRateLevelType(String rateLevelType) {
     this.rateLevelType = rateLevelType;
    }

    public void setFixedValue(FixedValue fixedValueObject) {
     this.FixedValueObject = fixedValueObject;
    }
}