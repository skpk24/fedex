package com.houseaccents.fedex.dto.response;

import java.util.ArrayList;

public class RatedShipmentDetail{
    private String rateType;
    private String ratedWeightMethod;
    private double totalDutiesTaxesAndFees;
    private double totalDiscounts;
    private double totalDutiesAndTaxes;
    private VariableHandlingCharge variableHandlingCharges;
    private EdtCharge edtCharges[];
    private double totalAncillaryFeesAndTaxes;
    private double totalBaseCharge;
    private double totalNetCharge;
    private double totalNetFedExCharge;
    private ShipmentRateDetail shipmentRateDetail;
    private ArrayList<RatedPackage> ratedPackages;
    private String currency;
    private String quoteNumber;
    private ShipmentLegRateDetail[] shipmentLegRateDetails;
    private String freightChargeBasis;
    private TotalVariableHandlingCharge totalVariableHandlingCharges;
    private double totalVatCharge;
    private AncillaryFeesAndTaxes ancillaryFeesAndTaxes[];
    private PreferredEdtCharge preferredEdtCharges[];
    private double totalNetChargeWithDutiesAndTaxes;
    
    public String getRateType() {
        return rateType;
    }
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }
    public String getRatedWeightMethod() {
        return ratedWeightMethod;
    }
    public void setRatedWeightMethod(String ratedWeightMethod) {
        this.ratedWeightMethod = ratedWeightMethod;
    }
    public double getTotalDiscounts() {
        return totalDiscounts;
    }
    public void setTotalDiscounts(double totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }
    public double getTotalBaseCharge() {
        return totalBaseCharge;
    }
    public void setTotalBaseCharge(double totalBaseCharge) {
        this.totalBaseCharge = totalBaseCharge;
    }
    public double getTotalNetCharge() {
        return totalNetCharge;
    }
    public void setTotalNetCharge(double totalNetCharge) {
        this.totalNetCharge = totalNetCharge;
    }
    public double getTotalNetFedExCharge() {
        return totalNetFedExCharge;
    }
    public void setTotalNetFedExCharge(double totalNetFedExCharge) {
        this.totalNetFedExCharge = totalNetFedExCharge;
    }
    public ShipmentRateDetail getShipmentRateDetail() {
        return shipmentRateDetail;
    }
    public void setShipmentRateDetail(ShipmentRateDetail shipmentRateDetail) {
        this.shipmentRateDetail = shipmentRateDetail;
    }
    public ArrayList<RatedPackage> getRatedPackages() {
        return ratedPackages;
    }
    public void setRatedPackages(ArrayList<RatedPackage> ratedPackages) {
        this.ratedPackages = ratedPackages;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public double getTotalDutiesTaxesAndFees() {
        return totalDutiesTaxesAndFees;
    }
    public void setTotalDutiesTaxesAndFees(double totalDutiesTaxesAndFees) {
        this.totalDutiesTaxesAndFees = totalDutiesTaxesAndFees;
    }
    public double getTotalDutiesAndTaxes() {
        return totalDutiesAndTaxes;
    }
    public void setTotalDutiesAndTaxes(double totalDutiesAndTaxes) {
        this.totalDutiesAndTaxes = totalDutiesAndTaxes;
    }
    public VariableHandlingCharge getVariableHandlingCharges() {
        return variableHandlingCharges;
    }
    public void setVariableHandlingCharges(VariableHandlingCharge variableHandlingCharges) {
        this.variableHandlingCharges = variableHandlingCharges;
    }
    public EdtCharge[] getEdtCharges() {
        return edtCharges;
    }
    public void setEdtCharges(EdtCharge[] edtCharges) {
        this.edtCharges = edtCharges;
    }
    public double getTotalAncillaryFeesAndTaxes() {
        return totalAncillaryFeesAndTaxes;
    }
    public void setTotalAncillaryFeesAndTaxes(double totalAncillaryFeesAndTaxes) {
        this.totalAncillaryFeesAndTaxes = totalAncillaryFeesAndTaxes;
    }
    public String getQuoteNumber() {
        return quoteNumber;
    }
    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }
    public ShipmentLegRateDetail[] getShipmentLegRateDetails() {
        return shipmentLegRateDetails;
    }
    public void setShipmentLegRateDetails(ShipmentLegRateDetail[] shipmentLegRateDetails) {
        this.shipmentLegRateDetails = shipmentLegRateDetails;
    }
    public String getFreightChargeBasis() {
        return freightChargeBasis;
    }
    public void setFreightChargeBasis(String freightChargeBasis) {
        this.freightChargeBasis = freightChargeBasis;
    }
    public TotalVariableHandlingCharge getTotalVariableHandlingCharges() {
        return totalVariableHandlingCharges;
    }
    public void setTotalVariableHandlingCharges(TotalVariableHandlingCharge totalVariableHandlingCharges) {
        this.totalVariableHandlingCharges = totalVariableHandlingCharges;
    }
    public double getTotalVatCharge() {
        return totalVatCharge;
    }
    public void setTotalVatCharge(double totalVatCharge) {
        this.totalVatCharge = totalVatCharge;
    }
    public AncillaryFeesAndTaxes[] getAncillaryFeesAndTaxes() {
        return ancillaryFeesAndTaxes;
    }
    public void setAncillaryFeesAndTaxes(AncillaryFeesAndTaxes[] ancillaryFeesAndTaxes) {
        this.ancillaryFeesAndTaxes = ancillaryFeesAndTaxes;
    }
    public PreferredEdtCharge[] getPreferredEdtCharges() {
        return preferredEdtCharges;
    }
    public void setPreferredEdtCharges(PreferredEdtCharge[] preferredEdtCharges) {
        this.preferredEdtCharges = preferredEdtCharges;
    }
    public double getTotalNetChargeWithDutiesAndTaxes() {
        return totalNetChargeWithDutiesAndTaxes;
    }
    public void setTotalNetChargeWithDutiesAndTaxes(double totalNetChargeWithDutiesAndTaxes) {
        this.totalNetChargeWithDutiesAndTaxes = totalNetChargeWithDutiesAndTaxes;
    }
}
