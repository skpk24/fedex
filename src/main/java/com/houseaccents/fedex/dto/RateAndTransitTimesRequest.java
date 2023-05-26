package com.houseaccents.fedex.dto;

import java.util.ArrayList;

import com.houseaccents.fedex.dto.request.AccountNumber;
import com.houseaccents.fedex.dto.request.RateRequestControlParameters;
import com.houseaccents.fedex.dto.request.RequestedShipment;

public class RateAndTransitTimesRequest {
    private AccountNumber accountNumberObject;
    private RequestedShipment requestedShipmentObject;
    private RateRequestControlParameters RateRequestControlParametersObject;
    private ArrayList<String> carrierCodes;


    // Getter Methods 
    public AccountNumber getAccountNumber() {
     return accountNumberObject;
    }

    public RequestedShipment getRequestedShipment() {
     return requestedShipmentObject;
    }

    public RateRequestControlParameters getRateRequestControlParameters() {
     return RateRequestControlParametersObject;
    }

    // Setter Methods 

    public void setAccountNumber(AccountNumber accountNumberObject) {
     this.accountNumberObject = accountNumberObject;
    }

    public void setRequestedShipment(RequestedShipment requestedShipmentObject) {
     this.requestedShipmentObject = requestedShipmentObject;
    }

    public void setRateRequestControlParameters(RateRequestControlParameters rateRequestControlParametersObject) {
     this.RateRequestControlParametersObject = rateRequestControlParametersObject;
    }

    public ArrayList<String> getCarrierCodes() {
        return carrierCodes;
    }

    public void setCarrierCodes(ArrayList<String> carrierCodes) {
        this.carrierCodes = carrierCodes;
    }
}

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
   
   