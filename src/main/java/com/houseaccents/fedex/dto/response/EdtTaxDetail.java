package com.houseaccents.fedex.dto.response;

public class EdtTaxDetail {
    private String edtTaxType;
    private double amount;
    private double taxableValue;
    private String name;
    private String description;
    private String formula;
    private String effectiveDate;
    public String getEdtTaxType() {
        return edtTaxType;
    }
    public void setEdtTaxType(String edtTaxType) {
        this.edtTaxType = edtTaxType;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getTaxableValue() {
        return taxableValue;
    }
    public void setTaxableValue(double taxableValue) {
        this.taxableValue = taxableValue;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getFormula() {
        return formula;
    }
    public void setFormula(String formula) {
        this.formula = formula;
    }
    public String getEffectiveDate() {
        return effectiveDate;
    }
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
    
}
