package com.houseaccents.fedex.dto.request;

public class SmartPostInfoDetail {
    AncillaryEndorsement AncillaryEndorsementObject;
    HubId HubIdObject;
    Indicia IndiciaObject;
    SpecialServices SpecialServicesObject;


    // Getter Methods 

    public AncillaryEndorsement getAncillaryEndorsement() {
     return AncillaryEndorsementObject;
    }

    public HubId getHubId() {
     return HubIdObject;
    }

    public Indicia getIndicia() {
     return IndiciaObject;
    }

    public SpecialServices getSpecialServices() {
     return SpecialServicesObject;
    }

    // Setter Methods 

    public void setAncillaryEndorsement(AncillaryEndorsement ancillaryEndorsementObject) {
     this.AncillaryEndorsementObject = ancillaryEndorsementObject;
    }

    public void setHubId(HubId hubIdObject) {
     this.HubIdObject = hubIdObject;
    }

    public void setIndicia(Indicia indiciaObject) {
     this.IndiciaObject = indiciaObject;
    }

    public void setSpecialServices(SpecialServices specialServicesObject) {
     this.SpecialServicesObject = specialServicesObject;
    }
}