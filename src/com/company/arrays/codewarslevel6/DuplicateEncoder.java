package com.company.arrays.codewarslevel6;

public class DuplicateEncoder {
    //дана строка ,если в строке есть повторяющиеся символы вставляем ) если символ один то - (
    static String encode(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count <= 1) {
                stringBuilder.append("(");
                count = 0;
            } else {
                stringBuilder.append(")");
                count = 0;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String res = encode("(( @");
        System.out.println(res);
    }
}
