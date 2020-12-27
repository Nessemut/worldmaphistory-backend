package io.worldmaphistory.model;


public class Date {

    private Integer year;
    private Integer month;
    private Integer day;

    private Boolean confirmed = true;

    public Date(Integer year){
        this(year, null, null);
    }

    public Date(Integer year, Integer month){
        this(year, month, null);
    }

    public Date(Integer year, Integer month, Integer day){
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Boolean before(Date date) {
        if (this.getYear() < date.getYear()) return true;
        if (this.getYear() > date.getYear()) return false;

        if (this.getMonth() == null || date.getMonth() == null) return false;

        if (this.getMonth() < date.getMonth()) return true;
        if (this.getMonth() > date.getMonth()) return false;

        if (this.getDay() == null || date.getDay() == null) return false;

        if (this.getDay() < date.getDay()) return true;
        if (this.getDay() > date.getDay()) return false;

        return false;
    }

    public Boolean after(Date date) {
        return !this.before(date);
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    @Override
    public String toString(){
        if (this.day != null) {
            return this.getYear() + "/" + this.getMonth() + "/" + this.getDay();
        }
        if (this.month != null) {
            return this.getYear() + "/" + this.getMonth();
        }
        return this.getYear().toString();
    }
}