package com.company;

public class CompareArrays {

    private static boolean Compare(int[] firstArray, int[] secondArray) {
        if (firstArray == secondArray) {
            return true;
        } //если  равны массивы возвращаем правду

        int length = secondArray.length; //переменная длины массива
        if (length != firstArray.length) {
            return false;
        } //не равна длина массива first и second возвращаем false

        for (int i = 0; i < length; i++) {    //сравниваем значения массивов
            if (firstArray[i] != secondArray[i]) {
            return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] secondArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] thirdArray = new int[]{3, 2, 3, 3, 2, 2, 2, 9,7};
        int[] anotherArray = new int[]{1, 2, 3, 4, 5, -222, 7, 8};

        System.out.println(Compare(firstArray, secondArray));
        System.out.println(Compare(secondArray, thirdArray));
        System.out.println(Compare(anotherArray,firstArray));


    }
}
