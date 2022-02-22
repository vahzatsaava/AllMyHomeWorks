package com.company.functionalInterfaces;

interface Timer{
    int getTime();
}

class Clazz{
    static int getTimeForOne(){
        return 1;
    }

    int getTimeForFive(){
        return 5;
    }
}

public class Main {
    public static void main(String[] args) {
        Clazz clazz = new Clazz();
        System.out.println(getAverageTime(clazz::getTimeForFive));
        System.out.println(getAverageTime(Clazz::getTimeForOne));
        System.out.println(getAverageTime(() -> 3));
    }

    static int getAverageTime(Timer timer){
        int average = 0;

        for (int i = 0; i < 10; i++) {
            average += timer.getTime();
        }

        return average / 10;
    }
}
