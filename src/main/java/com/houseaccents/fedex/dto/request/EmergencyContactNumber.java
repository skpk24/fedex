package com.houseaccents.fedex.dto.request;

public class EmergencyContactNumber {
    private String areaCode;
    private String extension;
    private String countryCode;
    private String personalIdentificationNumber;
    private String localNumber;
    
    public String getAreaCode() {
        return areaCode;
    }
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getPersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }
    public void setPersonalIdentificationNumber(String personalIdentificationNumber) {
        this.personalIdentificationNumber = personalIdentificationNumber;
    }
    public String getLocalNumber() {
        return localNumber;
    }
    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }
}
