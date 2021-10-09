package com.company.arraysHighLevel;

import java.util.Arrays;

public class LongestArrayIncrease {

private static int[] longIncrease(int[] array){


    return  array;
}



    public static void main(String[] args) {
        int[] input = new int[]{-10,-9,-7,-5,-4,12,-4,5,0,1,2, 1, 2, 3, 1, 5, 7,8,9};
        int[] lens = new int[input.length];
        int max = 0;

        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i - 1])
                lens[i] = lens[i - 1] + 1;
            else lens[i] = 0;
            max = Math.max(lens[i], max);
        }

        for (int i = 0; i < input.length; i++) {
            if (lens[i] == max) {
                for (int j = i - lens[i]; j <= i; j++)
                    System.out.print(input[j] + " ");

            }
        }


    }
}

