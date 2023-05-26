package com.houseaccents.fedex.dto;

public class AuthResponse {
    
    private Boolean isSuccess = Boolean.FALSE;
    private AuthErrorResponse error;
    private AuthSuccessResponse success;
    
    public Boolean getIsSuccess() {
        return isSuccess;
    }
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    public AuthErrorResponse getError() {
        return error;
    }
    public void setError(AuthErrorResponse error) {
        this.error = error;
    }
    public AuthSuccessResponse getSuccess() {
        return success;
    }
    public void setSuccess(AuthSuccessResponse success) {
        this.success = success;
    }
    
    
    @Override
    public String toString() {
        return "AuthResponse [isSuccess=" + isSuccess + ", error=" + error + ", success=" + success + "]";
    }
    
    
}
