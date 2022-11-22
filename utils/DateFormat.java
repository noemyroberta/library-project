package utils;

import java.time.LocalDate;
import java.util.Date;

public class DateFormat {
    private static int day, month, year;
    private static String dateFormat;

    public DateFormat(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dateFormat = day+"/"+month+"/"+year;
    }

    public static boolean isBeforeToday() {
        return getQuantityOfDaysBeforeToday() > 0;
    }

    private static int getQuantityOfDaysBeforeToday() {
        LocalDate today = LocalDate.now();
        String[] todaySplitted = today.toString().split("-");

        int day = Integer.parseInt(todaySplitted[2]);
        int month = Integer.parseInt(todaySplitted[1]);
        int year = Integer.parseInt(todaySplitted[0]);

        return (year - DateFormat.year) + (month - DateFormat.month) + (day - DateFormat.day);
    }

    public static String getDateFormat() {
        return dateFormat;
    }

}
