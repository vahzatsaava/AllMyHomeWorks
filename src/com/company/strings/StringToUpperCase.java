package com.company.strings;

public class StringToUpperCase {
    //    преобразовать все символы в нижний регистр
    private static void stringToUpper(String example) {
        String builder = "";      //строковые переменные
        String builderFirstChar = "";
        for (int i = 0; i < example.length(); i++) {
            if (example.isEmpty()) {           //если строка пустая
                builder = example;            //то builder равен строке
            } else {
                builderFirstChar = example.substring(0, 1); // присваиваем переменной builderFirstChar первый символ
                builder = example.substring(1).toLowerCase(); // а переменной builder значение от 1-ой позиции и далее
            }
        }
        System.out.println(builderFirstChar + builder);
    }

    public static void main(String[] args) {
        String nameString = "Hello DeAr Students";
        stringToUpper(nameString);
    }
}
