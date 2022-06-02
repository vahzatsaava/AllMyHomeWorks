package com.company.arrays.codewarslevel6;

import java.util.Arrays;

public class stopGninnip {
    public static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int a = Arrays.stream(arr1)
                .sum();
        int b = Arrays.stream(arr2)
                .sum();
        return a + b;
    }

    public static int grow(int[] x) {
        int a = 0;
        for (int i = 0; i < x.length; i++) {
            a += x[i];
        }
        return a;

    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int c = 0;
        for (int a : classPoints) {
            c += a;

        }
        return c / classPoints.length < yourPoints;
    }

    public static String spinWords(String sentence) {
        String[] arr = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        String concat = "";
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.setLength(0);
            if (arr[i].length() >= 5) {
                concat += stringBuilder.append(arr[i]).append(" ").reverse();
            } else {
                concat += arr[i];
            }
        }
        return concat.trim();
    }

    public static void main(String[] args) {
        System.out.println(spinWords("This[ is a ]test"));
        System.out.println(noSpace("Hey my Friend"));
    }
}
