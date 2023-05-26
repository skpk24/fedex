package com.houseaccents.fedex.dto.request;

public class PackageCODDetail {
    private CodCollectionAmount codCollectionAmount;
    private String codCollectionType;
    
    public CodCollectionAmount getCodCollectionAmount() {
        return codCollectionAmount;
    }
    public void setCodCollectionAmount(CodCollectionAmount codCollectionAmount) {
        this.codCollectionAmount = codCollectionAmount;
    }
    public String getCodCollectionType() {
        return codCollectionType;
    }
    public void setCodCollectionType(String codCollectionType) {
        this.codCollectionType = codCollectionType;
    }
}
