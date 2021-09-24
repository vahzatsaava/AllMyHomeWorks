package com.company;

public class MirrorArray {
    //Определить, является ли массив
    // зеркальным пример (1, 2, 2, 1  5, 6, 7, 4, 4, 7, 6, 5)
    public static void main(String[] args) {
        int[] array = {3, 7,5,5, 7, 3};
        boolean resultMirror = true;

        for (int i = 0; i <= array.length/2; i++) {
            int j = array.length - 1 - i;
            if (array[i] != array[j]) {
                resultMirror = false;
                break;
            }
        }
        if (resultMirror) {
            System.out.println("Массив зеркальный");
        } else {
            System.out.println("Массив не зеркальный");
        }
    }
}
