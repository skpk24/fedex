package com.houseaccents.fedex.dto.request;

import java.util.ArrayList;

public class EmailNotificationDetail {
    ArrayList <EmailRecipient> recipients;
    private String personalMessage;
    PrintedReference PrintedReferenceObject;
    
    public ArrayList<EmailRecipient> getRecipients() {
        return recipients;
    }
    public void setRecipients(ArrayList<EmailRecipient> recipients) {
        this.recipients = recipients;
    }
    public String getPersonalMessage() {
        return personalMessage;
    }
    public void setPersonalMessage(String personalMessage) {
        this.personalMessage = personalMessage;
    }
    public PrintedReference getPrintedReferenceObject() {
        return PrintedReferenceObject;
    }
    public void setPrintedReferenceObject(PrintedReference printedReferenceObject) {
        PrintedReferenceObject = printedReferenceObject;
    }
}
