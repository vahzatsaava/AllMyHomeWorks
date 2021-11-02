package com.company.OOP.classClock;

import java.util.Locale;

public class Clock {
    //1) Сформатировать дату на 35 строке
    //2)задание сделать так чтобы время выводилось корректное
    //3) тестовый случай (складываем два класса)(два входный параметра),если время больше то вывести в консоль что такого случая не будет
    private final int hours;
    private final int minutes;


    public Clock(int hours, int minutes) {
        int resMinutes = minutes % 60;
        int resHours = (hours + minutes / 60) % 24;
        this.hours = resHours;
        this.minutes = resMinutes;
    }

    //вводит человек строку!
    //"01:20"
    public Clock(String time) {
        String hourSide = "";
        String minuteSide = "";
        boolean rightSide = false;

        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == ':') {
                rightSide = true;
                continue;
            }
            if (rightSide) {
                minuteSide += time.charAt(i);
            } else {
                hourSide += time.charAt(i);
            }

        }

        int hours = Integer.parseInt(hourSide);
        int minutes = Integer.parseInt(minuteSide);
        int resMinutes = minutes % 60;
        int resHours = (hours + minutes / 60) % 24;
        this.hours = resHours;
        this.minutes = resMinutes;
    }

    //протестировать равенство (Метод проверяющий равенство значений)
    public boolean testHoursAndMinutes(Clock clock, int hours, int minutes) {
        boolean isSimilar;
        if (clock.hours == hours && clock.minutes == minutes) {
            isSimilar = true;
        } else {
            isSimilar = false;
        }
        return isSimilar;
    }

    public boolean testClocks(Clock clockSumm, Clock clockEnter) {
        boolean isSimilar;
        if (clockSumm.hours == clockEnter.hours && clockSumm.minutes == clockEnter.minutes) {
            isSimilar = true;
        } else {
            isSimilar = false;
        }
        return isSimilar;
    }

    public Clock summClocck(Clock clock1, Clock clock2) {
        int minutes = clock1.minutes + clock2.minutes;
        int hours = clock1.hours + clock2.hours;
        Clock clock = new Clock(hours, minutes);
        return clock;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public Clock add(Clock clock) {
        int resHours = this.hours + clock.hours;
        int resMinutes = this.minutes + clock.minutes;
        int min = resMinutes % 60;
        int hours = (resHours + resMinutes / 60) % 24;

        // Clock clock1 = new Clock(resHours, resMinutes);
        return new Clock(hours, min);
    }

    public Clock add(int minutes) {
        int resMinutes = this.minutes + minutes;
        int min = resMinutes % 60;
        int hours = (this.hours + resMinutes / 60) % 24;
        return new Clock(hours, min);
    }

    @Override
    public String toString() {
        String res = hours < 10 ? "0" + hours : hours + "";
        res += ":";
        res += minutes < 10 ? "0" + minutes : minutes + "";

        return res;
    }
// написать метод ТЕСТ
    //
    //часы создавались правильно при вводе
}
