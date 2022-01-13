package com.company.arrays.codewarslevel7;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        StringBuilder stringBuilder = new StringBuilder();
        String res = String.valueOf(num);
        char[] chars = res.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[chars.length - i - 1]);
        }

        return Integer.parseInt(stringBuilder.toString());
    }

    public static void main(String[] args) {
        int num = sortDesc(163959999);
        System.out.println(num);
    }
}
