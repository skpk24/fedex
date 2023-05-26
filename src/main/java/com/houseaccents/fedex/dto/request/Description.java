package com.houseaccents.fedex.dto.request;

public class Description {
    private int sequenceNumber;
    private String[] processingOptions;
    private String[] subsidiaryClasses;
    private String labelText;
    private String technicalName;
    private PackingDetails packingDetails;
    private String authorization;
    private boolean reportableQuantity;
    private double percentage;
    private String id;
    private String packingGroup;
    private String properShippingName;
    private String hazardClass;
    
    public int getSequenceNumber() {
        return sequenceNumber;
    }
    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    public String[] getProcessingOptions() {
        return processingOptions;
    }
    public void setProcessingOptions(String[] processingOptions) {
        this.processingOptions = processingOptions;
    }
    public String[] getSubsidiaryClasses() {
        return subsidiaryClasses;
    }
    public void setSubsidiaryClasses(String[] subsidiaryClasses) {
        this.subsidiaryClasses = subsidiaryClasses;
    }
    public String getLabelText() {
        return labelText;
    }
    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }
    public String getTechnicalName() {
        return technicalName;
    }
    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }
    public PackingDetails getPackingDetails() {
        return packingDetails;
    }
    public void setPackingDetails(PackingDetails packingDetails) {
        this.packingDetails = packingDetails;
    }
    public String getAuthorization() {
        return authorization;
    }
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
    public boolean isReportableQuantity() {
        return reportableQuantity;
    }
    public void setReportableQuantity(boolean reportableQuantity) {
        this.reportableQuantity = reportableQuantity;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPackingGroup() {
        return packingGroup;
    }
    public void setPackingGroup(String packingGroup) {
        this.packingGroup = packingGroup;
    }
    public String getProperShippingName() {
        return properShippingName;
    }
    public void setProperShippingName(String properShippingName) {
        this.properShippingName = properShippingName;
    }
    public String getHazardClass() {
        return hazardClass;
    }
    public void setHazardClass(String hazardClass) {
        this.hazardClass = hazardClass;
    }
}
