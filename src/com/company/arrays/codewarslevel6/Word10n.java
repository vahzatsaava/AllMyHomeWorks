package com.company.arrays.codewarslevel6;

public class Word10n {
    public static String abbreviate(String string) {
        String[] strings = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        String res = "";
        for (int i = 0; i < strings.length; i++) {
            res += strings[i];
            if (res.length() < 4) {
                stringBuilder.append(strings[i]).append(" ");
            } else {
                stringBuilder.append(res.charAt(0)).append(res.length() - 2).append(res.charAt(res.length() - 1)).append(" ");
            }

            res = "";
        }
        return stringBuilder.toString().strip();
    }

    public static void main(String[] args) {
        String res = abbreviate("Куда идем мы");
        System.out.println(res);
        System.out.println(res.length());

    }
}

