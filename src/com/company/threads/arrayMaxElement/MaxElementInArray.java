package com.company.threads.arrayMaxElement;

public class MaxElementInArray extends Thread {

    private final int[] array;
    private final int leftBoard;
    private final int rightBoard;
    private Integer result;

    MaxElementInArray(int[] array ,int leftBoard, int rightBoard) {
        this.array = array;
        this.leftBoard = leftBoard;
        this.rightBoard = rightBoard;
    }

    @Override
    public void run() {
        int max = array[0];
        for (int i = leftBoard; i <= rightBoard; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        result = max;
    }

    public int getMaxResult() {
        if (result == null){
            throw new NullPointerException();
        }
        return result;
    }

}
