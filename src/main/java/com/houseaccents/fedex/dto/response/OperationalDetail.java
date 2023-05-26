package com.houseaccents.fedex.dto.response;

public class OperationalDetail{
    private String originLocationIds[];
    private String commitDays[];
    private boolean ineligibleForMoneyBackGuarantee;
    private String astraDescription;
    private String airportId;
    private String serviceCode;
    private String scac;
    private String originServiceAreas[];
    private String deliveryDay;
    private int originLocationNumbers[];
    private String destinationPostalCode;
    private String commitDate;
    private String deliveryDate;
    private String deliveryEligibilities[];
    private String MaximumTransitTime;
    private String astraPlannedServiceLevel;
    private String destinationLocationIds[];
    private String destinationLocationStateOrProvinceCodes[];
    private String transitTime;
    private String packagingCode;
    private int destinationLocationNumbers[];
    private String publishedDeliveryTime;
    private String countryCodes[];
    private String stateOrProvinceCodes[];
    private String ursaPrefixCode;
    private String ursaSuffixCode;
    private String destinationServiceAreas[];
    private String originPostalCodes[];
    private String customTransitTime;
    
    public boolean isIneligibleForMoneyBackGuarantee() {
        return ineligibleForMoneyBackGuarantee;
    }
    public void setIneligibleForMoneyBackGuarantee(boolean ineligibleForMoneyBackGuarantee) {
        this.ineligibleForMoneyBackGuarantee = ineligibleForMoneyBackGuarantee;
    }
    public String getAstraDescription() {
        return astraDescription;
    }
    public void setAstraDescription(String astraDescription) {
        this.astraDescription = astraDescription;
    }
    public String getAirportId() {
        return airportId;
    }
    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }
    public String getServiceCode() {
        return serviceCode;
    }
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
    public String[] getOriginLocationIds() {
        return originLocationIds;
    }
    public void setOriginLocationIds(String[] originLocationIds) {
        this.originLocationIds = originLocationIds;
    }
    public String[] getCommitDays() {
        return commitDays;
    }
    public void setCommitDays(String[] commitDays) {
        this.commitDays = commitDays;
    }
    public String getScac() {
        return scac;
    }
    public void setScac(String scac) {
        this.scac = scac;
    }
    public String[] getOriginServiceAreas() {
        return originServiceAreas;
    }
    public void setOriginServiceAreas(String[] originServiceAreas) {
        this.originServiceAreas = originServiceAreas;
    }
    public String getDeliveryDay() {
        return deliveryDay;
    }
    public void setDeliveryDay(String deliveryDay) {
        this.deliveryDay = deliveryDay;
    }
    public int[] getOriginLocationNumbers() {
        return originLocationNumbers;
    }
    public void setOriginLocationNumbers(int[] originLocationNumbers) {
        this.originLocationNumbers = originLocationNumbers;
    }
    public String getDestinationPostalCode() {
        return destinationPostalCode;
    }
    public void setDestinationPostalCode(String destinationPostalCode) {
        this.destinationPostalCode = destinationPostalCode;
    }
    public String getCommitDate() {
        return commitDate;
    }
    public void setCommitDate(String commitDate) {
        this.commitDate = commitDate;
    }
    public String getDeliveryDate() {
        return deliveryDate;
    }
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public String[] getDeliveryEligibilities() {
        return deliveryEligibilities;
    }
    public void setDeliveryEligibilities(String[] deliveryEligibilities) {
        this.deliveryEligibilities = deliveryEligibilities;
    }
    public String getMaximumTransitTime() {
        return MaximumTransitTime;
    }
    public void setMaximumTransitTime(String maximumTransitTime) {
        MaximumTransitTime = maximumTransitTime;
    }
    public String getAstraPlannedServiceLevel() {
        return astraPlannedServiceLevel;
    }
    public void setAstraPlannedServiceLevel(String astraPlannedServiceLevel) {
        this.astraPlannedServiceLevel = astraPlannedServiceLevel;
    }
    public String[] getDestinationLocationIds() {
        return destinationLocationIds;
    }
    public void setDestinationLocationIds(String[] destinationLocationIds) {
        this.destinationLocationIds = destinationLocationIds;
    }
    public String[] getDestinationLocationStateOrProvinceCodes() {
        return destinationLocationStateOrProvinceCodes;
    }
    public void setDestinationLocationStateOrProvinceCodes(String[] destinationLocationStateOrProvinceCodes) {
        this.destinationLocationStateOrProvinceCodes = destinationLocationStateOrProvinceCodes;
    }
    public String getTransitTime() {
        return transitTime;
    }
    public void setTransitTime(String transitTime) {
        this.transitTime = transitTime;
    }
    public String getPackagingCode() {
        return packagingCode;
    }
    public void setPackagingCode(String packagingCode) {
        this.packagingCode = packagingCode;
    }
    public int[] getDestinationLocationNumbers() {
        return destinationLocationNumbers;
    }
    public void setDestinationLocationNumbers(int[] destinationLocationNumbers) {
        this.destinationLocationNumbers = destinationLocationNumbers;
    }
    public String getPublishedDeliveryTime() {
        return publishedDeliveryTime;
    }
    public void setPublishedDeliveryTime(String publishedDeliveryTime) {
        this.publishedDeliveryTime = publishedDeliveryTime;
    }
    public String[] getCountryCodes() {
        return countryCodes;
    }
    public void setCountryCodes(String[] countryCodes) {
        this.countryCodes = countryCodes;
    }
    public String[] getStateOrProvinceCodes() {
        return stateOrProvinceCodes;
    }
    public void setStateOrProvinceCodes(String[] stateOrProvinceCodes) {
        this.stateOrProvinceCodes = stateOrProvinceCodes;
    }
    public String getUrsaPrefixCode() {
        return ursaPrefixCode;
    }
    public void setUrsaPrefixCode(String ursaPrefixCode) {
        this.ursaPrefixCode = ursaPrefixCode;
    }
    public String getUrsaSuffixCode() {
        return ursaSuffixCode;
    }
    public void setUrsaSuffixCode(String ursaSuffixCode) {
        this.ursaSuffixCode = ursaSuffixCode;
    }
    public String[] getDestinationServiceAreas() {
        return destinationServiceAreas;
    }
    public void setDestinationServiceAreas(String[] destinationServiceAreas) {
        this.destinationServiceAreas = destinationServiceAreas;
    }
    public String[] getOriginPostalCodes() {
        return originPostalCodes;
    }
    public void setOriginPostalCodes(String[] originPostalCodes) {
        this.originPostalCodes = originPostalCodes;
    }
    public String getCustomTransitTime() {
        return customTransitTime;
    }
    public void setCustomTransitTime(String customTransitTime) {
        this.customTransitTime = customTransitTime;
    }
}