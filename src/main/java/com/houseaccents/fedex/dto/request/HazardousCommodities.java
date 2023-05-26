package com.houseaccents.fedex.dto.request;

public class HazardousCommodities {
    private Quantity quantity;
    private InnerReceptacles innerReceptacles;
    private Options options;
    private Description description;
    public Quantity getQuantity() {
        return quantity;
    }
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }
    public InnerReceptacles getInnerReceptacles() {
        return innerReceptacles;
    }
    public void setInnerReceptacles(InnerReceptacles innerReceptacles) {
        this.innerReceptacles = innerReceptacles;
    }
    public Options getOptions() {
        return options;
    }
    public void setOptions(Options options) {
        this.options = options;
    }
    public Description getDescription() {
        return description;
    }
    public void setDescription(Description description) {
        this.description = description;
    }
    
    
}
