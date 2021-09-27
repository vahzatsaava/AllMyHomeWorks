package com.company.arrays;

public class ArrayIncrease {
    private static int[] increaseArray(int[] array,int length) {
        int[] secondArray = new int[length ];
        for (int i = 0; i <array.length; i++)
        {
            secondArray[i]=array[i];

        }

        return secondArray;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{3, -32, 12, -65, 324, 34, 1, 123, 34};
        int x=15;
        int[] value = increaseArray(testArray,x);
        for (int i:value)
        {
            System.out.println(i);
        }
        System.out.println(value.length);
    }
}
