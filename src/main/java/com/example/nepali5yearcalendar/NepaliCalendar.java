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

                this.baisakh = fillDaysInMonth(31, NepaliMonth.BAISAKH, 17, EnglishMonth.APRIL, EnglishMonth.MAY);

                this.jestha = fillDaysInMonth(32, NepaliMonth.JESTHA, 17, EnglishMonth.MAY, EnglishMonth.JUNE);
                this.asar = fillDaysInMonth(31, NepaliMonth.ASAR, 15, EnglishMonth.JUNE, EnglishMonth.JULY);
                this.saun = fillDaysInMonth(32, NepaliMonth.SHRAWAN, 14, EnglishMonth.JULY, EnglishMonth.AUGUST);
                this.bhadau = fillDaysInMonth(31, NepaliMonth.BHADAU, 14, EnglishMonth.AUGUST, EnglishMonth.SEPTEMBER);
                this.asoj = fillDaysInMonth(30, NepaliMonth.ASOJ, 13, EnglishMonth.SEPTEMBER, EnglishMonth.OCTOBER);
                this.kartik = fillDaysInMonth(30, NepaliMonth.KARTIK, 14, EnglishMonth.OCTOBER, EnglishMonth.NOVEMBER);
                this.mangsir = fillDaysInMonth(30, NepaliMonth.MANGSIR, 14, EnglishMonth.NOVEMBER, EnglishMonth.DECEMBER);
                this.poush = fillDaysInMonth(29, NepaliMonth.POUSH, 15, EnglishMonth.DECEMBER, EnglishMonth.JANUARY);
                this.magh = fillDaysInMonth(29, NepaliMonth.MAGH, 17, EnglishMonth.JANUARY, EnglishMonth.FEBRUARY);
                this.falgun = fillDaysInMonth(30, NepaliMonth.FALGUN, 17, EnglishMonth.FEBRUARY, EnglishMonth.MARCH);
                this.chaitra = fillDaysInMonth(30, NepaliMonth.CHAIT, 18, EnglishMonth.MARCH, EnglishMonth.APRIL);
                break;
            case 2081:

                this.baisakh = fillDaysInMonth(31, NepaliMonth.BAISAKH, 18, EnglishMonth.APRIL, EnglishMonth.MAY);
                this.jestha = fillDaysInMonth(31, NepaliMonth.JESTHA, 18, EnglishMonth.MAY, EnglishMonth.JUNE);
                this.asar = fillDaysInMonth(32, NepaliMonth.ASAR, 17, EnglishMonth.JUNE, EnglishMonth.JULY);
                this.saun = fillDaysInMonth(32, NepaliMonth.SHRAWAN, 16, EnglishMonth.JULY, EnglishMonth.AUGUST);
                this.bhadau = fillDaysInMonth(31, NepaliMonth.BHADAU, 15, EnglishMonth.AUGUST, EnglishMonth.SEPTEMBER);
                this.asoj = fillDaysInMonth(30, NepaliMonth.ASOJ, 14, EnglishMonth.SEPTEMBER, EnglishMonth.OCTOBER);
                this.kartik = fillDaysInMonth(30, NepaliMonth.KARTIK, 15, EnglishMonth.OCTOBER, EnglishMonth.NOVEMBER);
                this.mangsir = fillDaysInMonth(30, NepaliMonth.MANGSIR, 15, EnglishMonth.NOVEMBER, EnglishMonth.DECEMBER);
                this.poush = fillDaysInMonth(29, NepaliMonth.POUSH, 16, EnglishMonth.DECEMBER, EnglishMonth.JANUARY);
                this.magh = fillDaysInMonth(30, NepaliMonth.MAGH, 18, EnglishMonth.JANUARY, EnglishMonth.FEBRUARY);
                this.falgun = fillDaysInMonth(30, NepaliMonth.FALGUN, 16, EnglishMonth.FEBRUARY, EnglishMonth.MARCH);
                this.chaitra = fillDaysInMonth(30, NepaliMonth.CHAIT, 17, EnglishMonth.MARCH, EnglishMonth.APRIL);
                break;
            case 2082:


                this.baisakh = fillDaysInMonth(30, NepaliMonth.BAISAKH, 17, EnglishMonth.APRIL, EnglishMonth.MAY);
                this.jestha = fillDaysInMonth(32, NepaliMonth.JESTHA, 18, EnglishMonth.MAY, EnglishMonth.JUNE);
                this.asar = fillDaysInMonth(31, NepaliMonth.ASAR, 16, EnglishMonth.JUNE, EnglishMonth.JULY);
                this.saun = fillDaysInMonth(32, NepaliMonth.SHRAWAN, 16, EnglishMonth.JULY, EnglishMonth.AUGUST);
                this.bhadau = fillDaysInMonth(31, NepaliMonth.BHADAU, 15, EnglishMonth.AUGUST, EnglishMonth.SEPTEMBER);
                this.asoj = fillDaysInMonth(30, NepaliMonth.ASOJ, 14, EnglishMonth.SEPTEMBER, EnglishMonth.OCTOBER);
                this.kartik = fillDaysInMonth(30, NepaliMonth.KARTIK, 15, EnglishMonth.OCTOBER, EnglishMonth.NOVEMBER);
                this.mangsir = fillDaysInMonth(30, NepaliMonth.MANGSIR, 15, EnglishMonth.NOVEMBER, EnglishMonth.DECEMBER);
                this.poush = fillDaysInMonth(29, NepaliMonth.POUSH, 16, EnglishMonth.DECEMBER, EnglishMonth.JANUARY);
                this.magh = fillDaysInMonth(30, NepaliMonth.MAGH, 18, EnglishMonth.JANUARY, EnglishMonth.FEBRUARY);
                this.falgun = fillDaysInMonth(30, NepaliMonth.FALGUN, 16, EnglishMonth.FEBRUARY, EnglishMonth.MARCH);
                this.chaitra = fillDaysInMonth(30, NepaliMonth.CHAIT, 17, EnglishMonth.MARCH, EnglishMonth.APRIL);


                break;
            case 2083:

                this.baisakh = fillDaysInMonth(31, NepaliMonth.BAISAKH, 17, EnglishMonth.APRIL, EnglishMonth.MAY);
                this.jestha = fillDaysInMonth(31, NepaliMonth.JESTHA, 17, EnglishMonth.MAY, EnglishMonth.JUNE);
                this.asar = fillDaysInMonth(32, NepaliMonth.ASAR, 16, EnglishMonth.JUNE, EnglishMonth.JULY);
                this.saun = fillDaysInMonth(31, NepaliMonth.SHRAWAN, 15, EnglishMonth.JULY, EnglishMonth.AUGUST);
                this.bhadau = fillDaysInMonth(31, NepaliMonth.BHADAU, 15, EnglishMonth.AUGUST, EnglishMonth.SEPTEMBER);
                this.asoj = fillDaysInMonth(30, NepaliMonth.ASOJ, 14, EnglishMonth.SEPTEMBER, EnglishMonth.OCTOBER);
                this.kartik = fillDaysInMonth(30, NepaliMonth.KARTIK, 15, EnglishMonth.OCTOBER, EnglishMonth.NOVEMBER);
                this.mangsir = fillDaysInMonth(30, NepaliMonth.MANGSIR, 15, EnglishMonth.NOVEMBER, EnglishMonth.DECEMBER);
                this.poush = fillDaysInMonth(29, NepaliMonth.POUSH, 16, EnglishMonth.DECEMBER, EnglishMonth.JANUARY);
                this.magh = fillDaysInMonth(30, NepaliMonth.MAGH, 18, EnglishMonth.JANUARY, EnglishMonth.FEBRUARY);
                this.falgun = fillDaysInMonth(30, NepaliMonth.FALGUN, 16, EnglishMonth.FEBRUARY, EnglishMonth.MARCH);
                this.chaitra = fillDaysInMonth(30, NepaliMonth.CHAIT, 17, EnglishMonth.MARCH, EnglishMonth.APRIL);


                break;
            case 2084:
                this.baisakh = fillDaysInMonth(31, NepaliMonth.BAISAKH, 17, EnglishMonth.APRIL, EnglishMonth.MAY);
                this.jestha = fillDaysInMonth(31, NepaliMonth.JESTHA, 17, EnglishMonth.MAY, EnglishMonth.JUNE);
                this.asar = fillDaysInMonth(32, NepaliMonth.ASAR, 16, EnglishMonth.JUNE, EnglishMonth.JULY);
                this.saun = fillDaysInMonth(31, NepaliMonth.SHRAWAN, 15, EnglishMonth.JULY, EnglishMonth.AUGUST);
                this.bhadau = fillDaysInMonth(31, NepaliMonth.BHADAU, 15, EnglishMonth.AUGUST, EnglishMonth.SEPTEMBER);
                this.asoj = fillDaysInMonth(30, NepaliMonth.ASOJ, 14, EnglishMonth.SEPTEMBER, EnglishMonth.OCTOBER);
                this.kartik = fillDaysInMonth(30, NepaliMonth.KARTIK, 15, EnglishMonth.OCTOBER, EnglishMonth.NOVEMBER);
                this.mangsir = fillDaysInMonth(30, NepaliMonth.MANGSIR, 15, EnglishMonth.NOVEMBER, EnglishMonth.DECEMBER);
                this.poush = fillDaysInMonth(29, NepaliMonth.POUSH, 16, EnglishMonth.DECEMBER, EnglishMonth.JANUARY);
                this.magh = fillDaysInMonth(30, NepaliMonth.MAGH, 18, EnglishMonth.JANUARY, EnglishMonth.FEBRUARY);
                this.falgun = fillDaysInMonth(30, NepaliMonth.FALGUN, 17, EnglishMonth.FEBRUARY, EnglishMonth.MARCH);
                this.chaitra = fillDaysInMonth(30, NepaliMonth.CHAIT, 18, EnglishMonth.MARCH, EnglishMonth.APRIL);


                break;
            case 2085:
                this.baisakh = fillDaysInMonth(31, NepaliMonth.BAISAKH, 18, EnglishMonth.APRIL, EnglishMonth.MAY);
                this.jestha = fillDaysInMonth(32, NepaliMonth.JESTHA, 18, EnglishMonth.MAY, EnglishMonth.JUNE);
                this.asar = fillDaysInMonth(31, NepaliMonth.ASAR, 16, EnglishMonth.JUNE, EnglishMonth.JULY);
                this.saun = fillDaysInMonth(32, NepaliMonth.SHRAWAN, 16, EnglishMonth.JULY, EnglishMonth.AUGUST);
                this.bhadau = fillDaysInMonth(30, NepaliMonth.BHADAU, 15, EnglishMonth.AUGUST, EnglishMonth.SEPTEMBER);
                this.asoj = fillDaysInMonth(31, NepaliMonth.ASOJ, 15, EnglishMonth.SEPTEMBER, EnglishMonth.OCTOBER);
                this.kartik = fillDaysInMonth(30, NepaliMonth.KARTIK, 15, EnglishMonth.OCTOBER, EnglishMonth.NOVEMBER);
                this.mangsir = fillDaysInMonth(30, NepaliMonth.MANGSIR, 15, EnglishMonth.NOVEMBER, EnglishMonth.DECEMBER);
                this.poush = fillDaysInMonth(29, NepaliMonth.POUSH, 16, EnglishMonth.DECEMBER, EnglishMonth.JANUARY);
                this.magh = fillDaysInMonth(30, NepaliMonth.MAGH, 18, EnglishMonth.JANUARY, EnglishMonth.FEBRUARY);
                this.falgun = fillDaysInMonth(30, NepaliMonth.FALGUN, 16, EnglishMonth.FEBRUARY, EnglishMonth.MARCH);
                this.chaitra = fillDaysInMonth(30, NepaliMonth.CHAIT, 17, EnglishMonth.MARCH, EnglishMonth.APRIL);
                    break;

            default:
                this.baisakh = fillDaysInMonth(31, NepaliMonth.BAISAKH, 17, EnglishMonth.APRIL, EnglishMonth.MAY);
                this.jestha = fillDaysInMonth(31, NepaliMonth.JESTHA, 17, EnglishMonth.MAY, EnglishMonth.JUNE);
                this.asar = fillDaysInMonth(32, NepaliMonth.ASAR, 16, EnglishMonth.JUNE, EnglishMonth.JULY);
                this.saun = fillDaysInMonth(31, NepaliMonth.SHRAWAN, 15, EnglishMonth.JULY, EnglishMonth.AUGUST);
                this.bhadau = fillDaysInMonth(31, NepaliMonth.BHADAU, 15, EnglishMonth.AUGUST, EnglishMonth.SEPTEMBER);
                this.asoj = fillDaysInMonth(30, NepaliMonth.ASOJ, 14, EnglishMonth.SEPTEMBER, EnglishMonth.OCTOBER);
                this.kartik = fillDaysInMonth(30, NepaliMonth.KARTIK, 15, EnglishMonth.OCTOBER, EnglishMonth.NOVEMBER);
                this.mangsir = fillDaysInMonth(30, NepaliMonth.MANGSIR, 15, EnglishMonth.NOVEMBER, EnglishMonth.DECEMBER);
                this.poush = fillDaysInMonth(29, NepaliMonth.POUSH, 16, EnglishMonth.DECEMBER, EnglishMonth.JANUARY);
                this.magh = fillDaysInMonth(30, NepaliMonth.MAGH, 18, EnglishMonth.JANUARY, EnglishMonth.FEBRUARY);
                this.falgun = fillDaysInMonth(30, NepaliMonth.FALGUN, 16, EnglishMonth.FEBRUARY, EnglishMonth.MARCH);
                this.chaitra = fillDaysInMonth(30, NepaliMonth.CHAIT, 17, EnglishMonth.MARCH, EnglishMonth.APRIL);


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

    private Day[] fillDaysInMonth(int days, NepaliMonth nepaliMonth, int firstEnglishDateEnd, EnglishMonth firstEnglishMonth, EnglishMonth secondEnglishMonth) {

        Day[] day = new Day[days];
        //
        for (int i = 0; i < days; i++) {
            day[i] = new Day();
            day[i].setNepaliNumberDay(i + 1);
            day[i].setNepaliMonth(nepaliMonth);
            if (i < firstEnglishDateEnd) {
                day[i].setEnglishMonth(firstEnglishMonth);
            } else {
                day[i].setEnglishMonth(secondEnglishMonth);
            }
        }
        //System.out.println("-->"+day[30].getNepaliNumberDay());
        return day;
    }


}

// 2081
