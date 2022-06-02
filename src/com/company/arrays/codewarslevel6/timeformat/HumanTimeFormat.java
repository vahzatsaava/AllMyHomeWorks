package com.company.arrays.codewarslevel6.timeformat;

public class HumanTimeFormat {
    private int minutes;
    private int seconds;
    private int hour;
    private int days;
    private int years;

    public String getAllTime(int seconds) {
        minutes = seconds / 60;
        String result = String.format("Minutes - %d, Seconds - %d", getMinutes(seconds), getSeconds(seconds));
        String resultWithHours = String.format("Years - %d,Days - %d,Hours - %d,Minutes - %d, Seconds - %d", getYears(days), getDays(hour) % 365, getHours(minutes) % 24, getMinutes(seconds), getSeconds(seconds));
        return resultWithHours;
    }

    private int getMinutes(int seconds) {
        minutes = seconds / 60;
        return minutes % 60;
    }

    private int getSeconds(int seconds) {
        seconds = seconds % 60;
        return seconds;
    }

    private int getHours(int minutes) {
        hour = minutes / 60;
        return hour;
    }

    private int getDays(int hour) {
        days = getHours(minutes) / 24;
        return days;
    }

    private int getYears(int days) {
        years = getDays(hour) / 365;
        return years;
    }


}
