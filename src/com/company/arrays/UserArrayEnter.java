package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserArrayEnter {

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
    private static String arrayToString(int[] array){
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        //Пользователь должен вводить с клавиатуры количество элементов
        // масива, после этого произвести ввод этих элементов, при этом
        // значение массива должно быть в диапазона от -10 до 10.
        // Если пользователь вводит число, не находящееся в этом диапазоне, то попросить
        // пользователя ввести число еще раз
        System.out.println("Введите колличество Элементов");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Введите значение элементов");

        int[] userArray = new int[number];
        for (int i = 0; i < userArray.length; i++) {
            int a;
            do {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Введите Вновь значение!");
                a = scanner1.nextInt();
                userArray[i] = a;
            } while (!(-10 < a && a < 10));
        }
        printArray(userArray); //выводим массив
        System.out.println("Преобразуем и  выводим массив в строку");
        String result= arrayToString(userArray);
        System.out.println(result);

    }
}
