package com.company.arrays.fromNet;

public class Countthedivisorsofanumber {
    public static long numberOfDivisors(int n) {
        long count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int res = 30;
        System.out.println(numberOfDivisors(res));
    }
}
