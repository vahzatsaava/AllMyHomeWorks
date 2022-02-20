package com.company.threads.arrayMaxElement;

public class LeadTimeOfMethods {
    private int max;
    private final int[] array;

    LeadTimeOfMethods(int[] array) {
        this.array = array;
    }

    private String findMaxForOneThread() {
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

    private String findMaxForThreeThread() {
        FindMax findMax = new FindMax(array, 3);
        return getString(findMax);

    }

    private String findMaxForFiveThread() {
        FindMax findMax = new FindMax(array, 5);
        return getString(findMax);
    }

    private String findMaxForTenThread() {
        FindMax findMax = new FindMax(array, 10);
        return getString(findMax);
    }

    private String getString(FindMax findMax) {
        long start = System.currentTimeMillis();
        try {
            findMax.getMax();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long finish = System.currentTimeMillis();
        long res = finish - start;
        return String.valueOf(res);
    }

    @Override
    public String toString() {
        return "Колличеество потоков " + "\t" + "Время выполнения" + "\n" +
                "Один  " + "\t" + "\t" + "\t" + "\t" + "-" + "\t" + findMaxForOneThread() + "\n" +
                "Три " + "\t" + "\t" + "\t" + "\t" + "-" + "\t" + findMaxForThreeThread() + "\n" +
                "Пять " + "\t" + "\t" + "\t" + "\t" + "-" + "\t" + findMaxForFiveThread() + "\n" +
                "Десять " + "\t" + "\t" + "\t" + "\t" + "-" + "\t" + findMaxForTenThread() + "\n";
    }
}
