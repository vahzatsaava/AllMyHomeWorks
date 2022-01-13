package com.company.strings.romNetStrings;

public class DeleteChars {
    public static String deleteSymb(String s) {
        s = s.toLowerCase();
        String res = containsSymbols(s);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String c = Character.toString(s.charAt(i));
            for (int j = 0; j < res.length(); j++) {
                String a = Character.toString(res.charAt(j));
                if (!(c.equals(a))){
                    stringBuilder.append(c);
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String containsSymbols(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charsSymbol = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < charsSymbol.length; j++) {
                if (s.charAt(i) == charsSymbol[j]) {
                    stringBuilder.append(s.charAt(i));
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "Hello my friend";
        String a = deleteSymb(s);
        System.out.println(a);
    }
}
