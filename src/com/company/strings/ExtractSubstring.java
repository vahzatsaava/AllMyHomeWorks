package com.company.strings;

public class ExtractSubstring {
    //  Извлечь подстроку из строки (пример -> строка: "привет, друг!"" подстрока: "ет," результат: "прив друг!")
    private static void extractSubString(String example) {
        String builderSub = "";
        String builderLast= "";
        for (int i = 0; i < example.length(); i++) {
            if (example.isEmpty()){
                example=null;
            }else {
                builderSub=example.substring(5,example.length());
                builderLast=example.substring(0,2);
            }

        }
        System.out.println(builderLast+builderSub); //складываем две строки и выводим результат

    }

    public static void main(String[] args) {
        String nameString = "Hello Dear Friend ";
        extractSubString(nameString);
    }
}
