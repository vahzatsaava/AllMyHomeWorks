package com.company;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    private static int[] PrintArrayString(int[] array) {
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        //Создайте массив из 8 случайных целых чисел из отрезка
// [1;10]. Выведите массив на экран в строку.
// Замените каждый элемент с нечётным индексом на ноль.
// Снова выведете массив на экран на отдельной строке.
        Random random = new Random();
        int[] array = new int[8];
        int min = 1;
        int max = 10;
        int different = max - min;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(different + 1) + min;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = 0;
            }
        }
        PrintArrayString(array);
    }
}
