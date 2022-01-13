package com.company.arrays.fromNet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DataReverse {
    public static int[] DataReverse(int[] data) {
        return reverse(data);
    }

    public static int[] reverse(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0 && i < 8) {
                data[i] = 1;
            } else {
                data[i] = 0;
            }
             if (i > 8 && i < 12){
                data[i] = 0;
            }
            else if ((i >= 12 && i < 16)){
                data[i] = 1;
            }
            else if (i >= 16 && i <= 23){
                data[i] = 0;
            }
            else if (i >= 24){
                data[i] = 1;
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data1 = {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0};
        int[] rev = DataReverse(data1);
        System.out.println(Arrays.toString(rev));


        System.out.println(data1.length);
    }
}
