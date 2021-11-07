package com.company.strings;

public class StringToUpperCase {
    //    преобразовать все символы в нижний регистр
    private static String stringToUpper(String example) {
        String builder = "";      //строковые переменные
        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) >= 'A' && example.charAt(i) <= 'Z'){
              builder += (char)(example.charAt(i) + 32);
            }else {
                builder += example.charAt(i);
            }

        }
        return builder;
    }

    public static void main(String[] args) {
        String nameString = "Hello DeAr Students";
        System.out.println(stringToUpper(nameString));
    }
}
