package com.company.threads.arrayMaxElement;

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

    public List<Pair> createPairs() {

        int range = (int) Math.ceil(array.length * 1.0 / threads);
        for (int i = 0; i < array.length - array.length % range; i += range) {
            list.add(new Pair(i, i + range - 1));
        }

        return list;
    }
    public int getMax(){
        createPairs();

    }

}
