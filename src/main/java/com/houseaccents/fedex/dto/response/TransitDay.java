package com.houseaccents.fedex.dto.response;

public class TransitDay {
    private String description;
    private String minimumTransitTime;
    private String maximumTransitTime;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getMinimumTransitTime() {
        return minimumTransitTime;
    }
    public void setMinimumTransitTime(String minimumTransitTime) {
        this.minimumTransitTime = minimumTransitTime;
    }
    public String getMaximumTransitTime() {
        return maximumTransitTime;
    }
    public void setMaximumTransitTime(String maximumTransitTime) {
        this.maximumTransitTime = maximumTransitTime;
    }
    
}
