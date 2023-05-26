package com.houseaccents.fedex.dto.request;

public class PackageSpecialServices {
    private String[] specialServiceTypes;
    private String signatureOptionType;
    private AlcoholDetail alcoholDetail;
    private DangerousGoodsDetail dangerousGoodsDetail;
    private PackageCODDetail packageCODDetail;
    private int pieceCountVerificationBoxCount;
    private BatteryDetails batteryDetails;
    private DryIceWeight dryIceWeight;
    public String[] getSpecialServiceTypes() {
        return specialServiceTypes;
    }
    public void setSpecialServiceTypes(String[] specialServiceTypes) {
        this.specialServiceTypes = specialServiceTypes;
    }
    public String getSignatureOptionType() {
        return signatureOptionType;
    }
    public void setSignatureOptionType(String signatureOptionType) {
        this.signatureOptionType = signatureOptionType;
    }
    public AlcoholDetail getAlcoholDetail() {
        return alcoholDetail;
    }
    public void setAlcoholDetail(AlcoholDetail alcoholDetail) {
        this.alcoholDetail = alcoholDetail;
    }
    public DangerousGoodsDetail getDangerousGoodsDetail() {
        return dangerousGoodsDetail;
    }
    public void setDangerousGoodsDetail(DangerousGoodsDetail dangerousGoodsDetail) {
        this.dangerousGoodsDetail = dangerousGoodsDetail;
    }
    public PackageCODDetail getPackageCODDetail() {
        return packageCODDetail;
    }
    public void setPackageCODDetail(PackageCODDetail packageCODDetail) {
        this.packageCODDetail = packageCODDetail;
    }
    public int getPieceCountVerificationBoxCount() {
        return pieceCountVerificationBoxCount;
    }
    public void setPieceCountVerificationBoxCount(int pieceCountVerificationBoxCount) {
        this.pieceCountVerificationBoxCount = pieceCountVerificationBoxCount;
    }
    public BatteryDetails getBatteryDetails() {
        return batteryDetails;
    }
    public void setBatteryDetails(BatteryDetails batteryDetails) {
        this.batteryDetails = batteryDetails;
    }
    public DryIceWeight getDryIceWeight() {
        return dryIceWeight;
    }
    public void setDryIceWeight(DryIceWeight dryIceWeight) {
        this.dryIceWeight = dryIceWeight;
    }
}
