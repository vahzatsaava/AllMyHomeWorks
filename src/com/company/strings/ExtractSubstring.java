package com.company.strings;

import java.util.Scanner;

public class ExtractSubstring {
    //  удалить подстроку из строки (пример -> строка: "привет, друг!"" подстрока: "ет," результат: "прив друг!")
    // найти подстроку ет,(любую переданную строку)
    private static boolean contains(String stringMain, String stringSub) {

        boolean result = true;

        if (stringMain.equals("")) {
            result = false;
        } else if (stringSub == null && stringMain == null) {
            return result = false;
        } else if (stringSub.length() == 0 && stringSub == "") {
            result = true;
        } else if (stringSub.length() > stringMain.length()) {
            result = false;
        }

        for (int i = 0; i < stringMain.length(); i++) {
            if (stringMain.charAt(i)!=stringSub.charAt(i)){ // не пойму как сравнить тут
                // значения ,если они разной длины ,надо ли использовать массив
                result = false;
            }
        }

        return result;
    }

    private static String string(String result, String value) {
        String lastResult = "";
        for (int i = 0; i < result.length(); i++) {
            if (result != value) {
                lastResult += result.charAt(i);
            } else {
                lastResult += result.charAt(i) + value;
            }
        }
        return lastResult;
    }

    private static String stringSubstring(String example, int leftValue, int rightValue) {
        String result = "";

        for (int i = leftValue; i <= rightValue; i++) {
            result += example.charAt(i);

        }

        return result;

    }

    // ввод пользователем значений
    private static int returnInput() {
        System.out.println("Введите параметры ");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        while (result < 0) {
            System.out.println("Введите параметры еще раз ");
            result = scanner.nextInt();
        }
        return result;
    }

    public static void main(String[] args) {
        String nameString = "Hello Dear Friend";
        //  int left = returnInput();
        // int right = returnInput();
        //nameString=   string("hello","rt");
        //  System.out.println(nameString);
        nameString = stringSubstring("Hello ", 1, 4);
        System.out.println(nameString);

        boolean isSub = contains("Hello", "lo");
        System.out.println(isSub);
    }
}
