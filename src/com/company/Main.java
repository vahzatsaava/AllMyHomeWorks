package com.company;

public class Main {

     // ЗАДАЧА
    // Сделать реверс массива.
    // Java Doc

    /**
     * Метод предназначен для реверса массива
     *
     * @param array -массив для реверса
     * @return - это  предназначено для расчета реверса
     */
    private static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int numb = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = numb;
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void F(int value) {
        value += 1;

    }

    public static void main(String[] args) {
        int[] arrayOfNumber = new int[]{4, 1, 5, 6, 7, 3, 2, -1, -2};

        System.out.println("Выводим первоначальный массив");

        for (int i = 0; i < arrayOfNumber.length; i++) {
            System.out.println(arrayOfNumber[i]);
        }
        System.out.println("Выводим Реверс");

        reverseArray(arrayOfNumber);
        printArray(arrayOfNumber);
        int number = 10;
        F(number);
        System.out.println(number);

    }
}
