package com.company.OOP.classClock;

public class Main {
    public static void main(String[] args) {

        Clock clock3 = new Clock("25:33");
        Clock clock = new Clock(29, 10);
        boolean result = clock.testHoursAndMinutes(clock, 05, 10);
        System.out.println(result);
        Clock clock1 = new Clock(14,10);
        Clock clock2 = clock1.add(clock);
        boolean res = clock2.testHoursAndMinutes(clock2,19,20);
        System.out.println(res);

// человек мог создать часы введя строку в которой будут минуты и часы
    }

}
