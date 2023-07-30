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
                this.baisakh = new Day[31];
                this.jestha = new Day[32];
                this.asar = new Day[31];
                this.saun = new Day[32];
                this.bhadau = new Day[31];
                this.asoj = new Day[30];
                this.kartik = new Day[30];
                this.mangsir = new Day[30];
                this.poush = new Day[29];
                this.magh = new Day[29];
                this.falgun = new Day[30];
                this.chaitra = new Day[30];
                break;
            case 2081:
                this.baisakh = new Day[31];
                this.jestha = new Day[31];
                this.asar = new Day[32];
                this.saun = new Day[32];
                this.bhadau = new Day[31];
                this.asoj = new Day[30];
                this.kartik = new Day[30];
                this.mangsir = new Day[30];
                this.poush = new Day[29];
                this.magh = new Day[30];
                this.falgun = new Day[30];
                this.chaitra = new Day[30];
                break;
            case 2082:
                this.baisakh = new Day[30];
                this.jestha = new Day[32];
                this.asar = new Day[31];
                this.saun = new Day[32];
                this.bhadau = new Day[31];
                this.asoj = new Day[30];
                this.kartik = new Day[30];
                this.mangsir = new Day[30];
                this.poush = new Day[29];
                this.magh = new Day[30];
                this.falgun = new Day[30];
                this.chaitra = new Day[30];
                break;
            case 2083, 2084:
                this.baisakh = new Day[31];
                this.jestha = new Day[31];
                this.asar = new Day[32];
                this.saun = new Day[31];
                this.bhadau = new Day[31];
                this.asoj = new Day[30];
                this.kartik = new Day[30];
                this.mangsir = new Day[30];
                this.poush = new Day[29];
                this.magh = new Day[30];
                this.falgun = new Day[30];
                this.chaitra = new Day[30];
                break;
            case 2085:
                this.baisakh = new Day[31];
                this.jestha = new Day[32];
                this.asar = new Day[31];
                this.saun = new Day[32];
                this.bhadau = new Day[30];
                this.asoj = new Day[31];
                this.kartik = new Day[30];
                this.mangsir = new Day[30];
                this.poush = new Day[29];
                this.magh = new Day[30];
                this.falgun = new Day[30];
                this.chaitra = new Day[30];
                break;
            default:
                this.baisakh = new Day[31];
                this.jestha = new Day[28];
                this.asar = new Day[30];
                this.saun = new Day[30];
                this.bhadau = new Day[30];
                this.asoj = new Day[30];
                this.kartik = new Day[30];
                this.mangsir = new Day[30];
                this.poush = new Day[30];
                this.magh = new Day[30];
                this.falgun = new Day[30];
                this.chaitra = new Day[30];
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
}

// 2081
