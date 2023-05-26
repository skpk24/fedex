package com.houseaccents.fedex.dto.request;

public class PrintedReference {
    private String printedReferenceType;
    private String value;
    
    public String getPrintedReferenceType() {
        return printedReferenceType;
    }
    public void setPrintedReferenceType(String printedReferenceType) {
        this.printedReferenceType = printedReferenceType;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
