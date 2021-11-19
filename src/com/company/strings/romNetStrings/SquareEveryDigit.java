package com.company.strings.romNetStrings;

import java.util.Arrays;

public class SquareEveryDigit {
    //Изограмма - это слово, в котором нет повторяющихся букв, последовательных или непоследовательных

    public static boolean isIsogram(String str) {
        /*
        char[] chAr = str.toUpperCase().toCharArray();
        for (int i = 0; i < chAr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (chAr[i] == chAr[j]) {
                    return false;
                }
            }
        }
        return true;

         */
        return str.length() == str.toLowerCase().chars().distinct().count();
    }


    public static boolean compSame(int[] firstVal, int[] multip) {

        int count = 0;
        for (int i = 0; i < firstVal.length; i++) {
            firstVal[i] = firstVal[i] * firstVal[i];
            for (int j = 0; j < multip.length; j++) {
                if (firstVal[i] == multip[j]) {
                    count++;
                }
            }
            if (count == firstVal.length) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        /*
        boolean res = isIsogram("abca");
        System.out.println(res);

         */
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{6, 7, 8, 4, 9, 1,4};
        System.out.println(compSame(a, b));
       //каждый элемент массива а и проверяю его в массиве б
       //Элемент массива инт
        // прочитать сложность алгоритма
        // из 10 в 16 чную преобразовать
        // метод для нахождения элементов в массиве

    }
}
