package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DateFormat {
    private final int day;
    private final int month;
    private final int year;

    public DateFormat() {
        DateFormat today = getParsedTodayDate();

        this.day = today.day;
        this.month = today.month;
        this.year = today.year;
    }

    public DateFormat(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static DateFormat transformString(String date) {
        String[] splittedDate = date.split("/");

        int day = Integer.parseInt(splittedDate[0]);
        int month = Integer.parseInt(splittedDate[1]);
        int year = Integer.parseInt(splittedDate[2]);

        return new DateFormat(day, month, year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    public static boolean isBeforeToday(DateFormat date) {
        return getQuantityOfDaysBeforeToday(date) > 0;
    }

    public static int getQuantityOfDaysBeforeToday(DateFormat date) {
        DateFormat today = getParsedTodayDate();
        return (today.year - date.year) + (today.month - date.month) + (today.day - date.day);
    }
    
    public static int getQuantityOfDaysAfterToday(DateFormat date) {
        DateFormat today = getParsedTodayDate();
        return (date.year - today.year) + (date.month - today.month) + (date.day - today.day);
    }
    
    public static List<DateFormat> getDatesBetween(DateFormat firstDate, DateFormat secondDate) {
        List<DateFormat> listDate = new ArrayList<>();
        
        int quant = secondDate.day - firstDate.day;
        
        for (int i=0; i<=quant; i++) {
            listDate.add(new DateFormat(firstDate.day + i, firstDate.month, firstDate.year));
        }
        return listDate;
    }

    private static DateFormat getParsedTodayDate() {
        LocalDate today = LocalDate.now();
        String[] todaySplitted = today.toString().split("-");

        int day = Integer.parseInt(todaySplitted[2]);
        int month = Integer.parseInt(todaySplitted[1]);
        int year = Integer.parseInt(todaySplitted[0]);

        return new DateFormat(day, month, year);
    }

    @Override
    public String toString() {
        return day+"/"+month+"/"+year;
    }
}
