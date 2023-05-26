package com.houseaccents.fedex.dto.request;

public class RateRequestControlParameters {
    private boolean returnTransitTimes;
    private boolean servicesNeededOnRateFailure;
    private String variableOptions;
    private String rateSortOrder;


    // Getter Methods 

    public boolean getReturnTransitTimes() {
     return returnTransitTimes;
    }

    public boolean getServicesNeededOnRateFailure() {
     return servicesNeededOnRateFailure;
    }

    public String getVariableOptions() {
     return variableOptions;
    }

    public String getRateSortOrder() {
     return rateSortOrder;
    }

    // Setter Methods 

    public void setReturnTransitTimes(boolean returnTransitTimes) {
     this.returnTransitTimes = returnTransitTimes;
    }

    public void setServicesNeededOnRateFailure(boolean servicesNeededOnRateFailure) {
     this.servicesNeededOnRateFailure = servicesNeededOnRateFailure;
    }

    public void setVariableOptions(String variableOptions) {
     this.variableOptions = variableOptions;
    }

    public void setRateSortOrder(String rateSortOrder) {
     this.rateSortOrder = rateSortOrder;
    }
}
