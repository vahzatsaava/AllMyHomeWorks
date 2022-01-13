package com.company.strings.romNetStrings;

public class FindSymbolsRepeat {
    //Напишите программу на Java, чтобы найти повторяющиеся символы в строке
    public static void findSymbol(String name) {
        char[] chars = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            for (int j = i+1; j < name.length(); j++) {
                if (chars[i] == chars[j]){
                    System.out.println(chars[j]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String s = "Челоовек";
        findSymbol(s);
    }
}
