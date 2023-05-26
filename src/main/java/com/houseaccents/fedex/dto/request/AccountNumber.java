package com.houseaccents.fedex.dto.request;


public class AccountNumber {
    private String value;

    public AccountNumber(String value) {
        this.value = value;
    }
    // Getter Methods 

    public String getValue() {
     return value;
    }

    // Setter Methods 

    public void setValue(String value) {
     this.value = value;
    }
   }