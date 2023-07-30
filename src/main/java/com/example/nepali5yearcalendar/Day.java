package com.example.nepali5yearcalendar;

public class Day {

    private String tithi;

    private EnglishMonth englishMonth;
    private  NepaliMonth nepaliMonth;



    private int nepaliNumberDay;

    private int englishNumberDay;


    public Day() {
    }

    public Day(String tithi, EnglishMonth englishMonth, NepaliMonth nepaliMonth, int nepaliNumberDay, int englishNumberDay) {
        this.tithi = tithi;
        this.englishMonth = englishMonth;
        this.nepaliMonth = nepaliMonth;
        this.nepaliNumberDay = nepaliNumberDay;
        this.englishNumberDay = englishNumberDay;
    }

    public Day(int nepaliNumberDay, int englishNumberDay) {
        this.nepaliNumberDay = nepaliNumberDay;
        this.englishNumberDay = englishNumberDay;
    }

    public Day(int nepaliNumberDay) {
        this.nepaliNumberDay = nepaliNumberDay;
    }




    public String getTithi() {
        return tithi;
    }

    public int getNepaliNumberDay() {
        return nepaliNumberDay;
    }

    public int getEnglishNumberDay() {
        return englishNumberDay;
    }

    public void setTithi(String tithi) {
        this.tithi = tithi;
    }

    public void setNepaliNumberDay(int nepaliNumberDay) {
        this.nepaliNumberDay = nepaliNumberDay;
    }

    public void setEnglishNumberDay(int englishNumberDay) {
        this.englishNumberDay = englishNumberDay;
    }

    public void setEnglishMonth(EnglishMonth englishMonth) {
        this.englishMonth = englishMonth;
    }

    public EnglishMonth getEnglishMonth() {
        return englishMonth;
    }

    public NepaliMonth getNepaliMonth() {
        return nepaliMonth;
    }

    public void setNepaliMonth(NepaliMonth nepaliMonth) {
        this.nepaliMonth = nepaliMonth;
    }




}
