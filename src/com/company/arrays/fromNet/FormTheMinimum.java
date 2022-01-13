package com.company.arrays.fromNet;

import java.util.Arrays;

public class FormTheMinimum {
    public static int minValue(int[] values) {
        int result = 0;
        for(int i = 1; i <= 9; i++) {
            for(int j = 0; j < values.length; j++) {
                if(values[j] == i) {
                    result = result * 10 + values[j];
                    break;
                }
            }
        }

        return result;    }



    public static void main(String[] args) {
        System.out.println(minValue(new int[]{1, 2, 3, 4}));
    }
}
