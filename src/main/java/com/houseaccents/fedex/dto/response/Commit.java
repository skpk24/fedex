package com.houseaccents.fedex.dto.response;

public class Commit {
    private String daysInTransit;
    private String guaranteedType;
    private DateDetail dateDetail;
    private boolean saturdayDelivery;
    private String alternativeCommodityNames[];
    private String smartPostCommitTime;
    private TransitDay transitDays;
    private String label;
    private String commitMessageDetails;
    private String commodityName;
    private DerivedOriginDetail derivedOriginDetail; 
    private DerivedDestinationDetail derivedDestinationDetail;
    
    
    public String getDaysInTransit() {
        return daysInTransit;
    }
    public void setDaysInTransit(String daysInTransit) {
        this.daysInTransit = daysInTransit;
    }
    public String getGuaranteedType() {
        return guaranteedType;
    }
    public void setGuaranteedType(String guaranteedType) {
        this.guaranteedType = guaranteedType;
    }
    public DateDetail getDateDetail() {
        return dateDetail;
    }
    public void setDateDetail(DateDetail dateDetail) {
        this.dateDetail = dateDetail;
    }
    public boolean isSaturdayDelivery() {
        return saturdayDelivery;
    }
    public void setSaturdayDelivery(boolean saturdayDelivery) {
        this.saturdayDelivery = saturdayDelivery;
    }
    public String[] getAlternativeCommodityNames() {
        return alternativeCommodityNames;
    }
    public void setAlternativeCommodityNames(String[] alternativeCommodityNames) {
        this.alternativeCommodityNames = alternativeCommodityNames;
    }
    public String getSmartPostCommitTime() {
        return smartPostCommitTime;
    }
    public void setSmartPostCommitTime(String smartPostCommitTime) {
        this.smartPostCommitTime = smartPostCommitTime;
    }
    public TransitDay getTransitDays() {
        return transitDays;
    }
    public void setTransitDays(TransitDay transitDays) {
        this.transitDays = transitDays;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getCommitMessageDetails() {
        return commitMessageDetails;
    }
    public void setCommitMessageDetails(String commitMessageDetails) {
        this.commitMessageDetails = commitMessageDetails;
    }
    public String getCommodityName() {
        return commodityName;
    }
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }
}
