package com.houseaccents.fedex.dto.request;

public class ContentRecord {
    private String itemNumber;
    private int receivedQuantity;
    private String description;
    private String partNumber;
    
    public String getItemNumber() {
        return itemNumber;
    }
    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }
    public int getReceivedQuantity() {
        return receivedQuantity;
    }
    public void setReceivedQuantity(int receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
}
