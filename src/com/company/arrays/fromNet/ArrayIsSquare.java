package com.company.arrays.fromNet;

public class ArrayIsSquare {
    public static boolean isSquare(int n) {
        for (int i = 0; i < n; i++) {
            if (i * i == n){
                return true;
            }
        }
        return n == 0;// fix me!
    }
    public static void main(String[] args) {
        System.out.println(isSquare(25));
    }
}
