package com.company.arrays;

public class FindMax {
    //Найти максимальный и минимальный элементы массива
    private static int maxValue(int[] array) {
        int max = array[0];

        for (int i : array)
        {
            if (i > max)
                max = i;
        }



        return max;
    }
    public static void main(String[] args) {
        System.out.println("Максимальное значение");
        int[] arrays = new int[]{9, 34, 234, 45, 4, 6, 6, 32, 1, 34, 45, 234345, 4};

        int max = maxValue(arrays); // вызов методов
        System.out.println(max);
    }
}
