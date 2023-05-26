package com.houseaccents.fedex.dto;

import com.houseaccents.fedex.dto.response.RateAndTransitTimesError;
import com.houseaccents.fedex.dto.response.RateAndTransitTimesSuccess;

public class RateAndTransitTimesResponse {
    private Boolean isSuccess;
    private RateAndTransitTimesSuccess sucess;
    private RateAndTransitTimesError error;
    
    public Boolean getIsSuccess() {
        return isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    public RateAndTransitTimesSuccess getSucess() {
        return sucess;
    }
    public void setSucess(RateAndTransitTimesSuccess sucess) {
        this.sucess = sucess;
    }
    public RateAndTransitTimesError getError() {
        return error;
    }
    public void setError(RateAndTransitTimesError error) {
        this.error = error;
    }
}