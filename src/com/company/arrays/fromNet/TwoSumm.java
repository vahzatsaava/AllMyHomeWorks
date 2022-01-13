package com.company.arrays.fromNet;

public class TwoSumm {
    //Напишите функцию, которая принимает массив чисел (целые числа для тестов) и целевое число.
    // Он должен найти два разных элемента в массиве, которые при сложении дают целевое значение.
    // Затем индексы этих элементов должны быть возвращены в виде кортежа, например: (index1, index2).
    //
    //Для целей этого ката некоторые тесты могут иметь
    // несколько ответов; любые действующие решения будут приняты.
    //
    //Ввод всегда будет действительным (числа будут массивом длиной 2 или больше,
    // и все элементы будут числами; цель всегда будет суммой двух разных элементов из этого массива).
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] + numbers[i] == 0){

            }
        }
        return null; // Do your magic!
    }

    public static int oddNumber(int number) {
        if (number % 2 == 0) {
            return number;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int value = 4;
        int res = oddNumber(value);
        System.out.println(res);
    }
}
