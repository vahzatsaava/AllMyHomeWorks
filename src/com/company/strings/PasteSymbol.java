package com.company.strings;

public class PasteSymbol {
    //    Вставить в переданную строку после каждого символа
//    переданный символ (строка: "привет" символ '$' результат: "п$р$и$в$е$т"")
    private static String pasteSymbol(String example, char symbol) {

        String build = "";

        for (int i = 0; i < example.length(); i++) {
            if (i != example.length() - 1) {
                build += example.charAt(i) + "" + symbol;
            } else {
                 build += example.charAt(i);
            }
        }
        return build;
    }

    public static void main(String[] args) {

        String hello = "hello";
        hello = pasteSymbol(hello,'$');
        System.out.println(hello);

    }
}
