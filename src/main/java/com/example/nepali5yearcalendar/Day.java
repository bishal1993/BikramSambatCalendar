package com.example.nepali5yearcalendar;

public class Day {

    private String tithi;

    private  String englishFirstMonth;
    private String englishSecondMonth;
    private int nepaliNumberDay;

    private int englishNumberDay;

    public Day(String tithi, String englishFirstMonth, String englishSecondMonth, int nepaliNumberDay, int englishNumberDay) {
        this.tithi = tithi;
        this.englishFirstMonth = englishFirstMonth;
        this.englishSecondMonth = englishSecondMonth;
        this.nepaliNumberDay = nepaliNumberDay;
        this.englishNumberDay = englishNumberDay;
    }


    public String getEnglishFirstMonth() {
        return englishFirstMonth;
    }

    public String getEnglishSecondMonth() {
        return englishSecondMonth;
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
}
