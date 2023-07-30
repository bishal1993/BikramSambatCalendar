package com.example.nepali5yearcalendar;

public class NepaliCalendar {

    private  Day[] baisakh;
    private Day[] jestha;
    private Day[] asar;
    private Day[] saun;
    private Day[] bhadau;
    private Day[] asoj;
    private Day[] kartik;
    private Day[] mangsir;
    private Day[] poush;
    private Day[] magh;
    private Day[] falgun;
    private Day[] chaitra;

    public   NepaliCalendar( int year) {
        setDaysInMonth(year);
    }

    public void setDaysInMonth(final int year) {
        switch (year) {
            case 2080:
                this.baisakh = fillDaysInMonth(31);
                this.jestha = fillDaysInMonth(32);
                this.asar = fillDaysInMonth(31);
                this.saun = fillDaysInMonth(32);
                this.bhadau = fillDaysInMonth(31);
                this.asoj = fillDaysInMonth(30);
                this.kartik = fillDaysInMonth(30);
                this.mangsir =fillDaysInMonth(30);
                this.poush = fillDaysInMonth(29);
                this.magh = fillDaysInMonth(29);
                this.falgun =fillDaysInMonth(30);
                this.chaitra = fillDaysInMonth(30);
                break;
            case 2081:
                this.baisakh = fillDaysInMonth(31);
                this.jestha = fillDaysInMonth(31);
                this.asar = fillDaysInMonth(32);
                this.saun = fillDaysInMonth(32);
                this.bhadau = fillDaysInMonth(31);
                this.asoj = fillDaysInMonth(30);
                this.kartik = fillDaysInMonth(30);
                this.mangsir = fillDaysInMonth(30);
                this.poush =fillDaysInMonth(29);
                this.magh = fillDaysInMonth(30);
                this.falgun = fillDaysInMonth(30);
                this.chaitra = fillDaysInMonth(30);
                break;
            case 2082:
                this.baisakh =fillDaysInMonth(30);
                this.jestha = fillDaysInMonth(32);
                this.asar = fillDaysInMonth(31);
                this.saun = fillDaysInMonth(32);
                this.bhadau = fillDaysInMonth(31);
                this.asoj = fillDaysInMonth(30);
                this.kartik = fillDaysInMonth(30);
                this.mangsir =fillDaysInMonth(30);
                this.poush = fillDaysInMonth(29);
                this.magh = fillDaysInMonth(30);
                this.falgun = fillDaysInMonth(30);
                this.chaitra = fillDaysInMonth(30);
                break;
            case 2083, 2084:
                this.baisakh = fillDaysInMonth(31);
                this.jestha = fillDaysInMonth(31);
                this.asar = fillDaysInMonth(32);
                this.saun = fillDaysInMonth(31);
                this.bhadau = fillDaysInMonth(31);
                this.asoj = fillDaysInMonth(30);
                this.kartik = fillDaysInMonth(30);
                this.mangsir = fillDaysInMonth(30);
                this.poush =fillDaysInMonth(29);
                this.magh =fillDaysInMonth(30);
                this.falgun = fillDaysInMonth(30);
                this.chaitra =fillDaysInMonth(30);
                break;
            case 2085:
                this.baisakh = fillDaysInMonth(31);
                this.jestha =fillDaysInMonth(32);
                this.asar = fillDaysInMonth(31);
                this.saun = fillDaysInMonth(32);
                this.bhadau = fillDaysInMonth(30);
                this.asoj = fillDaysInMonth(31);
                this.kartik = fillDaysInMonth(30);
                this.mangsir = fillDaysInMonth(30);
                this.poush = fillDaysInMonth(29);
                this.magh = fillDaysInMonth(30);
                this.falgun = fillDaysInMonth(30);
                this.chaitra = fillDaysInMonth(30);
                break;
            default:
                this.baisakh = fillDaysInMonth(31);
                this.jestha = fillDaysInMonth(28);
                this.asar = fillDaysInMonth(30);
                this.saun = fillDaysInMonth(30);
                this.bhadau = fillDaysInMonth(30);
                this.asoj =fillDaysInMonth(30);
                this.kartik =fillDaysInMonth(30);
                this.mangsir = fillDaysInMonth(30);
                this.poush = fillDaysInMonth(30);
                this.magh = fillDaysInMonth(30);
                this.falgun =fillDaysInMonth(30);
                this.chaitra = fillDaysInMonth(30);
                break;

        }
    }

    public Day[] getBaisakh() {
        return baisakh;
    }

    public Day[] getJestha() {
        return jestha;
    }

    public Day[] getAsar() {
        return asar;
    }

    public Day[] getSaun() {
        return saun;
    }

    public Day[] getBhadau() {
        return bhadau;
    }

    public Day[] getAsoj() {
        return asoj;
    }

    public Day[] getKartik() {
        return kartik;
    }

    public Day[] getMangsir() {
        return mangsir;
    }

    public Day[] getPoush() {
        return poush;
    }

    public Day[] getMagh() {
        return magh;
    }

    public Day[] getFalgun() {
        return falgun;
    }

    public Day[] getChaitra() {
        return chaitra;
    }

    // yesko 5 wota construct garera month abgelegt hunxa.
    // ra yesma english date ablegen garna milxa


    public int totalDaysInYear(){

    int totalDays= baisakh.length+ jestha.length+asar.length+saun.length+
            bhadau.length+asoj.length+kartik.length+ mangsir.length+
            poush.length+ magh.length+ falgun.length+ chaitra.length;
    return totalDays;
    }

    private Day[] fillDaysInMonth( int days){

        Day[] day = new Day[days];
     //
        for(int i =0;i<days;i++){
            day[i]=new Day();
            day[i].setNepaliNumberDay(i+1);
        }
        //System.out.println("-->"+day[30].getNepaliNumberDay());
        return day;
    }


}

// 2081
