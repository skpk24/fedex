package com.houseaccents.fedex.dto.response;

public class BrokerAddress {
    private String streetLines[];
    private String city;
    private String stateOrProvinceCode;
    private String postalCode;
    private String countryCode;
    private boolean residential;
    private String classification;
    private String geographicCoordinates;
    private String urbanizationCode;
    private String countryName;
    public String[] getStreetLines() {
        return streetLines;
    }
    public void setStreetLines(String[] streetLines) {
        this.streetLines = streetLines;
    }
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
    public boolean isResidential() {
        return residential;
    }
    public void setResidential(boolean residential) {
        this.residential = residential;
    }
    public String getClassification() {
        return classification;
    }
    public void setClassification(String classification) {
        this.classification = classification;
    }
    public String getGeographicCoordinates() {
        return geographicCoordinates;
    }
    public void setGeographicCoordinates(String geographicCoordinates) {
        this.geographicCoordinates = geographicCoordinates;
    }
    public String getUrbanizationCode() {
        return urbanizationCode;
    }
    public void setUrbanizationCode(String urbanizationCode) {
        this.urbanizationCode = urbanizationCode;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
