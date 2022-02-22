package com.company.threads.arrayMaxElement;

import javax.xml.crypto.Data;
import java.util.function.Supplier;

public class TimerForMethods {
    private final int[] array;

    TimerForMethods(int[] array) {
        this.array = array;
    }

    private int getCountTimeForOneThread() {
        int max = array[0];
        long start = System.currentTimeMillis();
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        long finish = System.currentTimeMillis();
        long res = finish - start;
        return (int) res;
    }

    private int getCountTimeForThreeThread() {
        FindMax findMax = new FindMax(array, 3);
        return countTime(findMax);

    }

    private int getCountTimeForFiveThread() {
        FindMax findMax = new FindMax(array, 5);
        return countTime(findMax);
    }

    private int getCountTimeForTenThread() {
        FindMax findMax = new FindMax(array, 10);
        return countTime(findMax);
    }

    private int countTime(FindMax findMax) {

        long start = System.currentTimeMillis();
        try {
            findMax.getMax();
        } catch (InterruptedException e) {
            e.printStackTrace();
            long finishExp = System.currentTimeMillis();
            long result = finishExp - start;
            return 0;
        }
        long finish = System.currentTimeMillis();
        long res = finish - start;
        return (int) res;
    }

    private int getAverageTime(Supplier <Integer> supplier){
        int averageTime = 0;
        for (int i = 0; i < 10; i++) {
            averageTime += supplier.get();
        }
        return (int) (averageTime / 10.0);
    }

    @Override
    public String toString() {
        return "Колличеество потоков " + "\t" + "Время выполнения" + "\n" +
                "Один  " + "\t\t\t\t\t" + getAverageTime(this::getCountTimeForOneThread) + "\n" +
                "Три " + "\t\t\t\t\t" + getAverageTime(this::getCountTimeForThreeThread) + "\n" +
                "Пять " + "\t\t\t\t\t" + getAverageTime(this::getCountTimeForFiveThread) + "\n" +
                "Десять " + "\t\t\t\t\t" + getAverageTime(this::getCountTimeForTenThread) + "\n";

    }
}
