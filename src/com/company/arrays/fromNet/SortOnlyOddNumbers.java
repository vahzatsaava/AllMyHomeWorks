package com.company.arrays.fromNet;

import java.util.Arrays;

public class SortOnlyOddNumbers {
    public static int[] sortArray(int[] array) {
        /*
        for (int i = 0; i < array.length-1; i++) {
            for (int j = array.length-1; j >1; j--) {
                if (array[j] % 2 == 1) {
                    if (array[j - 1] > array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }
        return array;

         */
        // Sort the odd numbers only
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        // Then merge them back into original array
        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }

        return array;

    }

    public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        String min = array[0];
        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) >= Integer.parseInt(max)){
                min = array[i];
            }
            if (Integer.parseInt(array[i]) <= Integer.parseInt(max)){
                min = array[i];
            }

        }


        return max + " " + min;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 33, 44, 44, 66, 10, 3, 9, 8, 4};
        array = sortArray(array);

        String name = "1 2 3 4 5";
        String a = highAndLow(name);
        System.out.println(a);

    }
}
