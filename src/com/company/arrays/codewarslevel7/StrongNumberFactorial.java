package com.company.arrays.codewarslevel7;

public class StrongNumberFactorial {
    public static String isStrongNumber(int num) {
        String STRONG = "STRONG!!!!";
        String NOT_STRONG = "Not Strong !!";
        int res = 0;
        String strings = String.valueOf(num);
        for (int i = 0; i < strings.length(); i++) {
            res += doFactor(Character.getNumericValue(strings.charAt(i)));
        }
        return res == num ? STRONG : NOT_STRONG;
    }
    public static int doFactor(int num) {
        int res = 1;
        for (int i = 0; i < num; i++) {
            res *= (num - i);
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(isStrongNumber(145));
    }
}
