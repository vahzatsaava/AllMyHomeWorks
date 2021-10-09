package com.company.arraysHighLevel;

import java.util.Random;

public class ArrayIntoArray {
    // Даны два массива, вставить второй массив в первый на указанное место
    private static int[] pasteArrayInPosition(int[] mainArray, int[] pastedArray, int position) {
        int[] pastedArrays = new int[mainArray.length + pastedArray.length];
        for (int i = 0; i < mainArray.length; i++) {

            pastedArrays[i] = mainArray[i];
        }
        return pastedArrays;
    }


    public static void main(String[] args) {
        int[] mainArray = new int[]{2, -2, 1, 45, 54 - 7};
        int[] pastedArray = new int[]{3, 2, 0};

        //        int[] newArray = new int[mainArray.length+pastedArray.length];
//        int[] newSecond = new int[mainArray.length+pastedArray.length];
//
//        for (int i = 0; i <mainArray.length ; i++) {
//            newArray[i] = mainArray[i];
//        }
//        for (int i = 0; i < newArray.length; i++) {
//            newSecond[5] = pastedArray[i];
//
//        }
//
//        for (int i:newSecond
//             ) {
//            System.out.println(i);
//
//        }
        int[] array = pasteArrayInPosition(mainArray, pastedArray, 0);
        for (int i : array
        ) {
            System.out.println(i);

        }

    }
}
