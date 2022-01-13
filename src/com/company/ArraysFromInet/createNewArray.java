package com.company.ArraysFromInet;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class createNewArray {
    //  1. Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3. Введенное пользователем число сохраняется в переменную n.
///2. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    //        3. Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//4. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
    private static int sizeArray() { //метод ввода пользователем числа
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        while (value < 3) {
            value = scanner.nextInt();
            scanner.close();
        }
        return value;
    }

    private static int[] createArray(int randomNUmber, int size) { //создание массива и рандомного числа
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(randomNUmber);
        }
        return array;

    }

    private static int[] onlyNaturalNumbers(int[] array) {//вывод четных значений во второй массив
        int[] secondArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                secondArray[i] = array[i];
            }
        }
        return secondArray;
    }

    public static void main(String[] args) {
        System.out.println("Введите значение больше 3-х");
        int number = sizeArray();
        int[] arrayFromEnter = createArray(15, number);
        System.out.println("Выводим массив");
        for (int i : arrayFromEnter
        ) {
            System.out.println(i);
        }
        System.out.println("Выводим четные значения во второй массив");
        int[] arrayFromTransform = onlyNaturalNumbers(arrayFromEnter);
        for (int i : arrayFromTransform
        ) {
            System.out.println(i);

        }


    }
}
