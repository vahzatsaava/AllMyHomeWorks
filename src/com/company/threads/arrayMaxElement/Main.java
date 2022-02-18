package com.company.threads.arrayMaxElement;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 4, 8, 66, 567,66,4567,2,33};
        MaxElementInArray maxElementInArray = new MaxElementInArray(array,0, 3);
        maxElementInArray.start();
        maxElementInArray.join();
        System.out.println(maxElementInArray.getMaxResult());
        FindMax findMax = new FindMax(array,2);
        findMax.createPairs();

    }

}
