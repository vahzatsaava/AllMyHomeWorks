package com.company.threads.arrayMaxElement;

public class TimerForMethods {
    private final int[] array;

    TimerForMethods(int[] array) {
        this.array = array;
    }

    private String getCountTimeForOneThread() {
        int max = array[0];
        long start = System.currentTimeMillis();
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        long finish = System.currentTimeMillis();
        long res = finish - start;
        return String.valueOf(res);
    }

    private String getCountTimeForThreeThread() {
        FindMax findMax = new FindMax(array, 3);
        return countTime(findMax);

    }

    private String getCountTimeForFiveThread() {
        FindMax findMax = new FindMax(array, 5);
        return countTime(findMax);
    }

    private String getCountTimeForTenThread() {
        FindMax findMax = new FindMax(array, 10);
        return countTime(findMax);
    }

    private String countTime(FindMax findMax) {
        long start = System.currentTimeMillis();
        try {
            findMax.getMax();
        } catch (InterruptedException e) {
            e.printStackTrace();
            long finishExp = System.currentTimeMillis();
            long result = finishExp - start;
            return String.valueOf(result);
        }
        long finish = System.currentTimeMillis();
        long res = finish - start;
        return String.valueOf(res);
    }

    @Override
    public String toString() {
        return "Колличеество потоков " + "\t" + "Время выполнения" + "\n" +
                "Один  " + "\t\t\t\t\t" + getCountTimeForOneThread() + "\n" +
                "Три " + "\t\t\t\t\t" + getCountTimeForThreeThread() + "\n" +
                "Пять " + "\t\t\t\t\t" + getCountTimeForFiveThread() + "\n" +
                "Десять " + "\t\t\t\t\t" + getCountTimeForTenThread() + "\n";
    }
}
