package com.houseaccents.fedex.dto.response;

public class BrokerDetail {
    private Broker broker;
    private String type;
    private String brokerCommitTimestamp;
    private String brokerCommitDayOfWeek;
    private String brokerLocationId;
    private BrokerAddress brokerAddress;
    private int brokerToDestinationDays;
    public Broker getBroker() {
        return broker;
    }
    public void setBroker(Broker broker) {
        this.broker = broker;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getBrokerCommitTimestamp() {
        return brokerCommitTimestamp;
    }
    public void setBrokerCommitTimestamp(String brokerCommitTimestamp) {
        this.brokerCommitTimestamp = brokerCommitTimestamp;
    }
    public String getBrokerCommitDayOfWeek() {
        return brokerCommitDayOfWeek;
    }
    public void setBrokerCommitDayOfWeek(String brokerCommitDayOfWeek) {
        this.brokerCommitDayOfWeek = brokerCommitDayOfWeek;
    }
    public String getBrokerLocationId() {
        return brokerLocationId;
    }
    public void setBrokerLocationId(String brokerLocationId) {
        this.brokerLocationId = brokerLocationId;
    }
    public BrokerAddress getBrokerAddress() {
        return brokerAddress;
    }
    public void setBrokerAddress(BrokerAddress brokerAddress) {
        this.brokerAddress = brokerAddress;
    }
    public int getBrokerToDestinationDays() {
        return brokerToDestinationDays;
    }
    public void setBrokerToDestinationDays(int brokerToDestinationDays) {
        this.brokerToDestinationDays = brokerToDestinationDays;
    }
                    
}
