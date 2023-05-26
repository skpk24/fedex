package com.houseaccents.fedex.dto.request;

public class SMSDetail {
    private String phoneNumber;
    private String phoneNumberCountryCode;
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumberCountryCode() {
        return phoneNumberCountryCode;
    }
    public void setPhoneNumberCountryCode(String phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode;
    }
}
