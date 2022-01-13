package com.company.arrays.fromNet;

public class GiveNegativeeNumber {
    public static int makeNegative(final int x) {
        return x < 0 ? x : -x;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = -2;
        System.out.println(makeNegative(a));
        System.out.println(b);
    }
}
