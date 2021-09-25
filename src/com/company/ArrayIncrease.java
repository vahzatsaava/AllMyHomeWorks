package com.company;

public class ArrayIncrease {
    private static int[] IncreaseArray(int[] array,int length) {
        int[] secondArray = new int[length ];
        for (int i = 0; i <secondArray.length ; i++) {


        }

        return secondArray;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{3, -32, 12, -65, 324, 34, 1, 123, 34};
        int[] value = IncreaseArray(testArray,20);
        for (int i:value)
        {
            System.out.println(i);
        }
        System.out.println(value.length);
    }
}
