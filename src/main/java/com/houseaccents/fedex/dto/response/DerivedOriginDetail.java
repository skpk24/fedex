package com.houseaccents.fedex.dto.response;

public class DerivedOriginDetail {
    private String countryCode;
    private String stateOrProvinceCode;
    private String postalCode;
    private String serviceArea;
    private String locationId;
    private int locationNumber;
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }
    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getServiceArea() {
        return serviceArea;
    }
    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }
    public String getLocationId() {
        return locationId;
    }
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
    public int getLocationNumber() {
        return locationNumber;
    }
    public void setLocationNumber(int locationNumber) {
        this.locationNumber = locationNumber;
    }
}
