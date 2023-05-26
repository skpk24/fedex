package com.houseaccents.fedex.dto.request;

public class CustomsClearanceDetail {
    Commodities CommoditiesObject;
    CommercialInvoice CommercialInvoiceObject;
    FreightOnValue FreightOnValueObject;
    DutiesPayment DutiesPaymentObject;


    // Getter Methods 

    public Commodities getCommodities() {
     return CommoditiesObject;
    }

    public CommercialInvoice getCommercialInvoice() {
     return CommercialInvoiceObject;
    }

    public FreightOnValue getFreightOnValue() {
     return FreightOnValueObject;
    }

    public DutiesPayment getDutiesPayment() {
     return DutiesPaymentObject;
    }

    // Setter Methods 

    public void setCommodities(Commodities commoditiesObject) {
     this.CommoditiesObject = commoditiesObject;
    }

    public void setCommercialInvoice(CommercialInvoice commercialInvoiceObject) {
     this.CommercialInvoiceObject = commercialInvoiceObject;
    }

    public void setFreightOnValue(FreightOnValue freightOnValueObject) {
     this.FreightOnValueObject = freightOnValueObject;
    }

    public void setDutiesPayment(DutiesPayment dutiesPaymentObject) {
     this.DutiesPaymentObject = dutiesPaymentObject;
    }
}
