package com.company.arraysHighLevel;

import java.util.Arrays;

public class LongestArrayIncrease {
// вывести на экран все увеличивающиеся последовательности
    //вывести на экран максимальную последовательность

    private static void returnLongIncrease(int[] array) {
        int count = 0;
        int max = 0;
        String build = "";
        String maxLength = "";

        for (int i = 0; i <array.length-1 ; i++) {
            count++;
            build += array[i] + " ";
            System.out.print(array[i] + " ");
            if (array[i] > array[i+1]){
                System.out.println();
                if (count > max){
                    max = count;
                    maxLength = build;
                }
                count = 0;
                build ="";
            }

        }
        System.out.println(maxLength + "Максимальная длина");
        /*
        int count = 0;
        int max = 0;
        String build = "";
        String maxLength = "";
        for (int i = 0; i < array.length-1; i++) {
            count++;
            build += array[i] + " ";
            System.out.print(array[i]+ " ");
            if (array[i] > array[i+1])   //каждый текущий элемент больще предыдущего
            {
                System.out.println();//выводим с новой строки ,если выполняется условие !!
                if (count > max){
                    max = count;
                    maxLength = build;
                }
                count = 0;
                build = "";
            }
        }
        System.out.println(max+ " : Наибольшее количество элементов в возрастащей последовательности");
        System.out.println(array[array.length-1] + " : выводим последний элемент массива");
        System.out.println(maxLength + "Выводим самую длинную последовательность чисел");

         */

    }


    public static void main(String[] args) {
        int[] input = new int[]{-10, -9, -7, -5, -4, 12, -4, 5, 0, 1, 2, 1, 2, 3, 1, 5, 7, 8, -9};
        returnLongIncrease(input);


    }
}

