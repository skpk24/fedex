package com.houseaccents.fedex.dto.request;

public class RequestedPackageLineItems {
    private String subPackagingType;
    private String groupPackageCount;
    private ContentRecord[] contentRecord;
    private DeclaredValue declaredValue;
    private Dimensions dimensions;
    private VariableHandlingChargeDetail variableHandlingChargeDetail;
    private PackageSpecialServices packageSpecialServices;
    private Weight weight;
    
    public String getSubPackagingType() {
        return subPackagingType;
    }
    public void setSubPackagingType(String subPackagingType) {
        this.subPackagingType = subPackagingType;
    }
    public String getGroupPackageCount() {
        return groupPackageCount;
    }
    public void setGroupPackageCount(String groupPackageCount) {
        this.groupPackageCount = groupPackageCount;
    }
    public ContentRecord[] getContentRecord() {
        return contentRecord;
    }
    public void setContentRecord(ContentRecord[] contentRecord) {
        this.contentRecord = contentRecord;
    }
    public DeclaredValue getDeclaredValue() {
        return declaredValue;
    }
    public void setDeclaredValue(DeclaredValue declaredValue) {
        this.declaredValue = declaredValue;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
    public VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
        return variableHandlingChargeDetail;
    }
    public void setVariableHandlingChargeDetail(VariableHandlingChargeDetail variableHandlingChargeDetail) {
        this.variableHandlingChargeDetail = variableHandlingChargeDetail;
    }
    public PackageSpecialServices getPackageSpecialServices() {
        return packageSpecialServices;
    }
    public void setPackageSpecialServices(PackageSpecialServices packageSpecialServices) {
        this.packageSpecialServices = packageSpecialServices;
    }
    public Weight getWeight() {
        return weight;
    }
    public void setWeight(Weight weight) {
        this.weight = weight;
    }
}
