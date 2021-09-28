package com.company.strings;

import java.util.Arrays;

public class StringToArray {
    //    Дана строка, состоящая из слов. Слова разделены пробелами. Преобразовать строку в массив слов.
    private static void stringToArrray(String example) {
        char[] result = example.toCharArray();
/*

//        for (int i = 0; i < result.length; i++) {  //создаем массив char и переводим нашу переменную example в char

//            if (result[i] != ' ') {                // если result[i] не равен "пробелу" , то выводим result[i]
//                System.out.println(result[i]);
//            }
//
//        }


 */  // решение с for
        for (char i : result) {
            if (i != ' ') {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        String nameString = "Hello Dear Friends";
        stringToArrray(nameString);

    }
}
