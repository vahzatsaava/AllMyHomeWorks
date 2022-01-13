package com.company.arrays.fromNet;

public class CountPositiveNegative {
    //Вернуть массив, где первый элемент - это количество положительных чисел, а второй элемент - сумма отрицательных чисел.
    //
    //Если входной массив пуст или равен нулю, вернуть пустой массив.
    private static int[] countPositivesSumNegative(int[] array) {
        int positiveCount = 0; // колличество положительных чисел
        int negativeSumm = 0;  //сумма отрицат.
        if (array == null || array.length == 0) {
            return new int[]{}; //возвращаем пустой массив
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveCount++;
            }
            if (array[i] < 0) {
                negativeSumm += array[i];
            }

        }

        return new int[]{positiveCount, negativeSumm};
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 6, 7, 8, -4, -4, -10, -34, 4};
        int[] arrays = new int[0];
        arrays = countPositivesSumNegative(array);
        for (int i : arrays
        ) {
            System.out.println(i);

        }
    }
}
