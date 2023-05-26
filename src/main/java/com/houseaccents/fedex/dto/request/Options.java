package com.houseaccents.fedex.dto.request;

public class Options {
    private String labelTextOption;
    private String customerSuppliedLabelText;
    
    public String getLabelTextOption() {
        return labelTextOption;
    }
    public void setLabelTextOption(String labelTextOption) {
        this.labelTextOption = labelTextOption;
    }
    public String getCustomerSuppliedLabelText() {
        return customerSuppliedLabelText;
    }
    public void setCustomerSuppliedLabelText(String customerSuppliedLabelText) {
        this.customerSuppliedLabelText = customerSuppliedLabelText;
    }
}
