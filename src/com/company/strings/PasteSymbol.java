package com.company.strings;

public class PasteSymbol {
//    Вставить в переданную строку после каждого символа
//    переданный символ (строка: "привет" символ '$' результат: "п$р$и$в$е$т"")
    private static void pasteSymbol(String example) {
        char [] results=example.toCharArray();
        for (int i = 0; i < results.length; i++) {
            if (i%2==0){
                results[i]='$';
            }
            System.out.println(results[i]);
        }

    }

    public static void main(String[] args) {
        String hello = "hello";
        pasteSymbol(hello);

    }
}
