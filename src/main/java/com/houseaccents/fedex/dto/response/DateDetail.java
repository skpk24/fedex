package com.houseaccents.fedex.dto.response;

public class DateDetail {
    private String dayOfWeek;
    private String dayFormat;
    public String getDayOfWeek() {
        return dayOfWeek;
    }
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    public String getDayFormat() {
        return dayFormat;
    }
    public void setDayFormat(String dayFormat) {
        this.dayFormat = dayFormat;
    }
}
