package com.houseaccents.fedex.dto.response;

public class DerivedDestinationDetail extends DerivedOriginDetail {
    private String airportId;

    public String getAirportId() {
        return airportId;
    }

    public void setAirportId(String airportId) {
        this.airportId = airportId;
    }
}
