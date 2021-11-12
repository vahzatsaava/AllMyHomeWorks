package com.company.strings.romNetStrings;

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
        boolean isFalse = false;
        for (int i = 0; i < firstVal.length; i++) {
            firstVal[i] = firstVal[i] * firstVal[i];
        }
        for (int i = 0; i < firstVal.length; i++) {
            int value = firstVal[i];
            if (value == multip[i]){

                isFalse = true;

            }
            else {
                isFalse = false;
            }
        }

        return isFalse;
    }


    public static void main(String[] args) {
        /*
        boolean res = isIsogram("abca");
        System.out.println(res);

         */
        int[] a = new int[]{3, 2, 4, 6, 5};
        int[] b = new int[]{9, 4, 16, 36, 25, 45, 0};
        System.out.println(compSame(a,b));
//каждый элемент массива а и проверяю его в массиве б
//Элемент массива инт
        // прочитать сложность алгоритма
        // из 10 в 16 чную преобразовать
        // метод для нахождения элементов в массиве

    }
}
