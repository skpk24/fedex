package com.houseaccents.fedex.dto.response;

public class EdtCharge {
    private String[] alternateHarmonizedCodes;
    private EdtTaxDetail edtTaxDetail;
    private String harmonizedCode;
    public String[] getAlternateHarmonizedCodes() {
        return alternateHarmonizedCodes;
    }
    public void setAlternateHarmonizedCodes(String[] alternateHarmonizedCodes) {
        this.alternateHarmonizedCodes = alternateHarmonizedCodes;
    }
    public EdtTaxDetail getEdtTaxDetail() {
        return edtTaxDetail;
    }
    public void setEdtTaxDetail(EdtTaxDetail edtTaxDetail) {
        this.edtTaxDetail = edtTaxDetail;
    }
    public String getHarmonizedCode() {
        return harmonizedCode;
    }
    public void setHarmonizedCode(String harmonizedCode) {
        this.harmonizedCode = harmonizedCode;
    }
}
