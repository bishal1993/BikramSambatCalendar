package com.example.nepali5yearcalendar;

import java.util.ArrayList;

public class NepaliEnglishDateConverter {
   static NepaliCalendar calendar2080 = new NepaliCalendar( 2080);
    static  NepaliCalendar calendar2081 = new NepaliCalendar(2081);
    static   NepaliCalendar calendar2082 = new NepaliCalendar( 2082);
    static  NepaliCalendar calendar2083 = new NepaliCalendar( 2083);
    static NepaliCalendar calendar2084 = new NepaliCalendar( 2084);
    static NepaliCalendar calendar2085 = new NepaliCalendar(2085);

    ArrayList<NepaliCalendar> nepaliCalendars = new ArrayList<>();

    public int daysInEnglishMonth(EnglishMonth englishMonth, int year) {


        switch (englishMonth) {
            case JANUARY:
                return 31;

            case FEBRUARY:
                return year % 4 == 0 ? 29 : 28;
            case MARCH:
                return 31;
            case APRIL:
                return 30;
            case MAY:
                return 31;
            case JUNE:
                return 30;
            case JULY:
                return 31;
            case AUGUST:
                return 31;
            case SEPTEMBER:
                return 30;
            case OCTOBER:
                return 31;
            case NOVEMBER:
                return 30;
            case DECEMBER:
                return 31;
            default:
                return -1;
        }
    }


    public static int findDaysInAllYears() {
        int totalDays = calendar2080.totalDaysInYear() + calendar2081.totalDaysInYear() +
                calendar2082.totalDaysInYear() + calendar2083.totalDaysInYear() + calendar2084.totalDaysInYear() + calendar2085.totalDaysInYear();
        return totalDays;

    }


    public static void main(String [] args){
       System.out.println(findDaysInAllYears());
       System.out.println(calendar2080.totalDaysInYear());
       System.out.println(calendar2081.getBaisakh().length);
       System.out.println(calendar2082.getJestha().length);
       System.out.println(calendar2083.getAsar().length);



    }
}
