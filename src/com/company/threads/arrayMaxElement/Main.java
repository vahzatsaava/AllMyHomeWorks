package com.company.threads.arrayMaxElement;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 4, 8, 66, 567,66,4567,2,55};
        MaxElementInArray maxElementInArray = new MaxElementInArray(array,0, 3);
        maxElementInArray.start();
        maxElementInArray.join();
        System.out.println(maxElementInArray.getMaxResult());
        FindMax findMax = new FindMax(array,5);
        findMax.createPairs();

    }

}
