package com.houseaccents.fedex.dto.request;

public class ExpressFreightDetail {
    private String bookingConfirmationNumber;
    private float shippersLoadAndCount;


    // Getter Methods 

    public String getBookingConfirmationNumber() {
     return bookingConfirmationNumber;
    }

    public float getShippersLoadAndCount() {
     return shippersLoadAndCount;
    }

    // Setter Methods 

    public void setBookingConfirmationNumber(String bookingConfirmationNumber) {
     this.bookingConfirmationNumber = bookingConfirmationNumber;
    }

    public void setShippersLoadAndCount(float shippersLoadAndCount) {
     this.shippersLoadAndCount = shippersLoadAndCount;
    }
}
