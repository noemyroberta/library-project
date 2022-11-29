package utils;

import java.time.LocalDate;

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
    public static boolean isBeforeToday(DateFormat date) {
        return getQuantityOfDaysBeforeToday(date) > 0;
    }

    public static int getQuantityOfDaysBeforeToday(DateFormat date) {
        DateFormat today = getParsedTodayDate();
        return (today.year - date.year) + (today.month - date.month) + (today.day - date.day);
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
