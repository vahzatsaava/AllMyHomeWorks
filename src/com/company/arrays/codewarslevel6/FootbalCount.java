package com.company.arrays.codewarslevel6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootbalCount {
    public static double findUniq(double arr[]) {
        double val = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == arr[1]) {
                val = arr[arr.length - 1];
            } else {
                val = arr[0];
            }
        }
        return val;
    }

    public static int points(String[] games) {
        int count = 0;
        for (String s : games) {
            String[] arr = s.split(":");
            int leftVal = Integer.parseInt(arr[0]);
            int rightVal = Integer.parseInt(arr[1]);
            if (leftVal > rightVal) {
                count += 3;
            } else if (leftVal == rightVal) {
                count += 1;
            }

        }
        return count;
    }

    public static String bumps(final String road) {
        int count = 0;
        for (int i = 0; i < road.length(); i++) {
            if (road.charAt(i) == 'n') {
                count++;
            }
        }
        //count <= 15 ? "Woohoo!" : "Car Dead";
        return road.chars()
                .filter(i -> i == 'n')
                .count() <= 15 ? "Woohoo!" : "Car Dead";
    }

    public static String well(String[] x) {
        int count = (int) Arrays.stream(x)
                .filter(i -> i.equals("good")).count();
        if (count > 2) {
            return "I smell a series!";
        } else if (count == 0) {
            return "Fail!";
        }
        return "Publish!";
    }

    public static int areaOrPerimeter(int l, int w) {
        return l == w ? l * w : l * 2 + w * 2;
    }

    public static int countBits(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 0) {
                stringBuilder.append("0");
            } else {
                stringBuilder.append("1");
            }
            n = n / 2;
        }
        return (int) stringBuilder
                .reverse()
                .toString()
                .chars()
                .filter(i -> i == '1')
                .count();
    }

    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"}));
        System.out.println(findUniq(new double[]{0, 1, 0}));
        System.out.println(bumps(new String("____n_____nnnnnnn_nn__nn_nnn")));
        System.out.println(well(new String[]{"bad", "bad", "bad", "bad"}));
        System.out.println(countBits(1234));
    }
}
