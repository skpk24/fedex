package com.houseaccents.fedex.dto.request;

public class PackingDetails {
    private String packingInstructions;
    private boolean cargoAircraftOnly;
    
    public String getPackingInstructions() {
        return packingInstructions;
    }
    public void setPackingInstructions(String packingInstructions) {
        this.packingInstructions = packingInstructions;
    }
    public boolean isCargoAircraftOnly() {
        return cargoAircraftOnly;
    }
    public void setCargoAircraftOnly(boolean cargoAircraftOnly) {
        this.cargoAircraftOnly = cargoAircraftOnly;
    }
}
