package com.company.arraysHighLevel;

public class ArrayMaxModulCount {
    // Найти оличество элементов массива, превосходящих по модулю максимальный элемент
    private static int returnCountOfMaxModules(int[] array) {
        int max = array[0]; //переменная максимума
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int count = 0; //считаем колличество значений которые больше нашего максимума по модулю
        for (int i : array)
        {
            if (Math.abs(i) > max) {
                 count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[]{-2, -44, 5, -45, -100, 90, 54, -453};
        int maxValue = returnCountOfMaxModules(arrayOfNumbers); // присваиваем значение переменной maxValue
        System.out.println(maxValue);
    }
}
