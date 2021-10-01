package com.company.strings;

import java.util.Scanner;

public class ExtractSubstring {
    //  Извлечь подстроку из строки (пример -> строка: "привет, друг!"" подстрока: "ет," результат: "прив друг!")
    private static void extractSubString(String example, int leftBorder, int rightBorder) {
        String builderSub; // переменная для вырезания строки
        String builderLast = "";

        for (int i = 0; i < example.length(); i++) {
            builderSub = example.substring(leftBorder, rightBorder); // вырезанные значения
            builderLast = example.replace(builderSub, ""); // удаляем переменню builderSub
        }
        System.out.println(builderLast); //выводим на консоль измененную строку
    }

    // ввод пользователем значений
    private static int returnInput() {
        System.out.println("Введите параметры ");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        while (result < 0 ) {
            System.out.println("Введите параметры еще раз ");
            result = scanner.nextInt();
        }
        return result;
    }
    public static void main(String[] args) {
        String nameString = "Hello Dear Friend";
        int left = returnInput();
        int right = returnInput();
        extractSubString(nameString, left, right);
    }
}
