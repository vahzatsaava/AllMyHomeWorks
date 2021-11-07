package com.company.arraysHighLevel;

import java.util.Random;

public class ArrayIntoArray {
    // Даны два массива, вставить второй массив в первый на указанное место
    //вставить на позицию
    private static int[] pastedArrays;
    private static int[] resultArray;

    private static int[] pasteArrayInPosition(int[] mainArray, int[] subArray) {
        pastedArrays = new int[mainArray.length + subArray.length];

        //   for (int i = 0; i < subArray.length; i++) {
        //      pastedArrays[position + i] = subArray[i];
        //   }

        for (int i = 0; i < mainArray.length; i++) {
            pastedArrays[i] = mainArray[i];
        }

        return pastedArrays;
    }

    private static int[] pasteSubPosition(int[] subArray, int position) {
        resultArray = new int[pastedArrays.length];
        return resultArray;
    }

    public static void main(String[] args) {
        int[] mainArray = new int[]{2, -2, 1, 45, 54, -7};
        int[] subArray = new int[]{3, 2, 1};
        int[] array = pasteArrayInPosition(mainArray, subArray);
        for (int i : array
        ) {
            System.out.println(i);

        }
        System.out.println();
        int[] arrayResult = pasteSubPosition(subArray, 1);
        for (int i : arrayResult
        ) {
            System.out.println(i);

        }


    }
}
