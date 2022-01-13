package com.company.arrays.codewarslevel7;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestPairSum{
        public static int largestPairSum(int[] numbers){
            int max = numbers[0];
            int secMax = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max){
                    secMax = max;
                    max = numbers[i];
                }else if (numbers[i] > secMax && numbers[i] != max){
                    secMax = numbers[i];
                }
            }

            return max + secMax;
        }

        public static void main(String[] args) {
            int[] arr = {10, 14, 2, 23, 19};
            int res = largestPairSum(arr);
            System.out.println(res);
        }
}
