package com.houseaccents.fedex.dto.response;

public class RatedPackage{
    private int groupNumber;
    private double effectiveNetDiscount;
    private PackageRateDetail packageRateDetail;
    
    public int getGroupNumber() {
        return groupNumber;
    }
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
    public double getEffectiveNetDiscount() {
        return effectiveNetDiscount;
    }
    public void setEffectiveNetDiscount(double effectiveNetDiscount) {
        this.effectiveNetDiscount = effectiveNetDiscount;
    }
    public PackageRateDetail getPackageRateDetail() {
        return packageRateDetail;
    }
    public void setPackageRateDetail(PackageRateDetail packageRateDetail) {
        this.packageRateDetail = packageRateDetail;
    }
}