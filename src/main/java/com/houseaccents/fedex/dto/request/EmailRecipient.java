package com.houseaccents.fedex.dto.request;

public class EmailRecipient {
    private String emailAddress;
    private String notificationEventType[];
    private String notificationFormatType;
    private String emailNotificationRecipientType;
    private String notificationType;
    private String locale;
    private SMSDetail smsDetail;
    
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getNotificationFormatType() {
        return notificationFormatType;
    }
    public void setNotificationFormatType(String notificationFormatType) {
        this.notificationFormatType = notificationFormatType;
    }
    public String getEmailNotificationRecipientType() {
        return emailNotificationRecipientType;
    }
    public void setEmailNotificationRecipientType(String emailNotificationRecipientType) {
        this.emailNotificationRecipientType = emailNotificationRecipientType;
    }
    public String getNotificationType() {
        return notificationType;
    }
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }
    public String getLocale() {
        return locale;
    }
    public void setLocale(String locale) {
        this.locale = locale;
    }
    public SMSDetail getSmsDetail() {
        return smsDetail;
    }
    public void setSmsDetail(SMSDetail smsDetail) {
        this.smsDetail = smsDetail;
    }
    public String[] getNotificationEventType() {
        return notificationEventType;
    }
    public void setNotificationEventType(String[] notificationEventType) {
        this.notificationEventType = notificationEventType;
    }
}
