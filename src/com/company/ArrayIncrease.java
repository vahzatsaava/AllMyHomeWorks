package com.company;

public class ArrayIncrease {
    private static int[] IncreaseArray(int[] array) {
        int lenght = array.length;
        int[] secondArray = new int[array.length * 2];
        return secondArray;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{3, -32, 12, -65, 324, 34, 1, 123, 34};
        int[] value = IncreaseArray(testArray);
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        System.out.println(value.length);
    }
}
