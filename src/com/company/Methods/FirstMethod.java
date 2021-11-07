package com.company.Methods;

import java.util.Arrays;

public class FirstMethod {
    //нахождение суммы при помощи (переменным числа параметров)
    private static int returnSumm(int...digits){
        int summ = 0;
        for (int i = 0; i < digits.length; i++) {
            summ += digits[i];
        }
        return summ;
    }
    private static void summ(int a,int b){
        System.out.println(a+b);
    }
    private static void summ(final String a,String b){
        System.out.println(a.hashCode());
        System.out.println(a+b);
    }
    private static int[] returnArray(final int[] array){
        array[0] = 0;
        return null;
    }
    public static void main(String[] args) {
         final int[] a = {1,3,4,5,6,7,8,9};
         returnArray(a);
         System.out.println(Arrays.toString(a));

    }
}
