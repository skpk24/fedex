package com.houseaccents.fedex.dto.response;

import com.houseaccents.fedex.dto.request.AccountNumber;
import com.houseaccents.fedex.dto.request.Address;

public class Broker {
    private Address address;
    private AccountNumber accountNumber;
    private Object contact;
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public AccountNumber getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(AccountNumber accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Object getContact() {
        return contact;
    }
    public void setContact(Object contact) {
        this.contact = contact;
    }
}
