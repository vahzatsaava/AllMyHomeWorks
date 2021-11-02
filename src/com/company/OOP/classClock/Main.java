package com.company.OOP.classClock;

public class Main {
    public static void main(String[] args) {

        Clock clock3 = new Clock("25:33");
        Clock clock = new Clock(06, 10);
        boolean result = clock.testHoursAndMinutes(clock, 12, 11);
        System.out.println(result);
        Clock clock1 = new Clock(02, 04);
        Clock clock2 = new Clock(04, 06);
        Clock clock4 = clock3.summClocck(clock1, clock2);
        System.out.println(clock4);
        System.out.println(clock4.testClocks(clock4,clock));



// человек мог создать часы введя строку в которой будут минуты и часы
    }

}
