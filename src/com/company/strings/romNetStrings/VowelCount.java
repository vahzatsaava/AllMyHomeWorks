package com.company.strings.romNetStrings;

public class VowelCount {
    public static boolean isVowel(char s) {
        char[] charsSymbol = {'a', 'e', 'i', 'o', 'u'};
        for (char i : charsSymbol
        ) {
            if (i == s) {
                return true;
            }
        }
        return false;
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }
}
