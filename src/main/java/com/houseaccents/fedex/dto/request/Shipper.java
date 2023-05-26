package com.houseaccents.fedex.dto.request;

public class Shipper {
    Address AddressObject;


    // Getter Methods 

    public Address getAddress() {
     return AddressObject;
    }

    // Setter Methods 

    public void setAddress(Address addressObject) {
     this.AddressObject = addressObject;
    }
}
