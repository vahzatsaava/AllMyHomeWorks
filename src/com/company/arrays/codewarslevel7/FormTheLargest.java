package com.company.arrays.codewarslevel7;

import java.util.ArrayList;
import java.util.Arrays;

public class FormTheLargest {
    public static long maxNumber(long n) {

        //123
        String res = Long.toString(n);
        char[] arr = res.toCharArray();
        Arrays.sort(arr);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[arr.length - i - 1]);
        }
        long a = Long.parseLong(stringBuilder.toString());


        return a;
    }

    public static void main(String[] args) {
        long a = maxNumber(312);
        System.out.println(a);
    }
}
