package com.company.threads.arrayMaxElement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindMax {
    private final int[] array;
    private final int threads;
    private List<Pair> list = new LinkedList<Pair>();


    FindMax(int[] array, int threads) {
        this.threads = threads;
        this.array = array;
    }

    private List<Pair> createPairs() {
        int range = (int) Math.ceil(array.length * 1.0 / threads);
        for (int i = 0; i < array.length - array.length % range; i += range) {
            list.add(new Pair(i, i + range - 1));
        }
        //посмотреть еще раз !!
        if (array.length % range != 0) {
            list.add(new Pair(array.length - array.length % range, array.length - 1));
        }
        return list;
    }

    public int getMax() throws InterruptedException {
        List<MaxElementInArray> maxElement = new ArrayList<>();
        List<Pair> borders = createPairs();
        for (Pair pair : borders) {
            maxElement.add(new MaxElementInArray(array,pair.getFirstNumber(), pair.getSecondNumber()));
        }
        for (MaxElementInArray max : maxElement) {
            max.start();
        }
        for (MaxElementInArray max : maxElement) {
            max.join();
        }
        int max = Integer.MIN_VALUE;
        for (MaxElementInArray thread : maxElement) {
            if (thread.getMaxResult() > max){
                max = thread.getMaxResult();
            }
        }


        return max;
    }

}
