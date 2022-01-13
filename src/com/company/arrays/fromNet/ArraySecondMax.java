package com.company.arrays.fromNet;

import java.util.Random;

public class ArraySecondMax {
    //Напишите Java-программу, чтобы найти второе по величине число в массиве.
    public static int maxValue (int[] array){
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public static int secMaxValue (int[] array){
      int max = 0;
      int secMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                secMax = max;
                max =array[i];
            } else if (array[i] > secMax && array[i] != max){
                secMax = array[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10);
            System.out.println(arrays[i]);
        }
        int max = maxValue(arrays);
        System.out.println();
        System.out.println(max + " - Максимум");
        int sec = secMaxValue(arrays);
        System.out.println(sec + " - Вторая по величине переменная");
    }
}
