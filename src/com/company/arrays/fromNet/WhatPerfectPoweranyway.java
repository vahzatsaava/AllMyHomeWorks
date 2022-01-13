package com.company.arrays.fromNet;

public class WhatPerfectPoweranyway {

    public static String getMiddle(String word) {
        String res = "";
        if (word.length() == 1){
            return res += word;
        }
        for (int i = 0; i < word.length() / 2; i++) {

            if (word.length() % 2 == 1){
                res += word.charAt(word.length()/2);
                break;
            }
            else {
                res += word.charAt(word.length()/2 - 1) + res + word.charAt(word.length() / 2);
                break;

            }
        }
        return res;
    }
    public static int[] isPerfectPower(int n) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < n; k++) {
            i++;
            for (int l = 0; l < n; l++) {
                j++;
                if (j > n) {
                    j = 1;
                    break;
                }
                if (n == Math.pow(i, j)) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    //оптимизировать данную задачку

    public static void main(String[] args) {
        int[] arr = isPerfectPower(1);
        for (int i : arr
        ) {
            System.out.println(i);

        }
        String s = "A";
        System.out.println(getMiddle(s));
    }
}
