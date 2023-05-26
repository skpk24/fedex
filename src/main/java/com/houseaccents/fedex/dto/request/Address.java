package com.houseaccents.fedex.dto.request;

public class Address {
    
    private String city;
    private String stateOrProvinceCode;
    private String postalCode;
    private String countryCode;
    private boolean residential;
    
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
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
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public boolean getResidential() {
        return residential;
    }
    public void setResidential(boolean residential) {
        this.residential = residential;
    }
    
    @Override
    public String toString() {
        return "Address [city=" + city + ", stateOrProvinceCode=" + stateOrProvinceCode + ", postalCode=" + postalCode
                + ", countryCode=" + countryCode + ", residential=" + residential + "]";
    }
}
