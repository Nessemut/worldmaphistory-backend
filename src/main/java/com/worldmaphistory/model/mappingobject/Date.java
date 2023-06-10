package com.worldmaphistory.model.mappingobject;

import lombok.Data;

@Data
public class Date {

    private Integer year;
    private Integer month;
    private Integer day;
    private Boolean confirmed = true;

    public Date(Integer year) {
        this(year, null, null);
    }

    public Date(Integer year, Integer month) {
        this(year, month, null);
    }

    public Date(Integer year, Integer month, Integer day) {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    public Boolean before(Date date) {
        if (this.getYear() < date.getYear()) return true;
        if (this.getYear() > date.getYear()) return false;

        if (this.getMonth() == null || date.getMonth() == null) return false;

        if (this.getMonth() < date.getMonth()) return true;
        if (this.getMonth() > date.getMonth()) return false;

        if (this.getDay() == null || date.getDay() == null) return false;

        return this.getDay() < date.getDay();
    }

    public Boolean after(Date date) {
        return !this.before(date);
    }

    @Override
    public String toString() {
        if (this.day != null) {
            return this.getYear() + "/" + this.getMonth() + "/" + this.getDay();
        }
        if (this.month != null) {
            return this.getYear() + "/" + this.getMonth();
        }
        return this.getYear().toString();
    }
}
