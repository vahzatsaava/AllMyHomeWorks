package com.company.strings.romNetStrings;

public class CamelCasePaste {
    public static String camelCase(String input) {
        String out = "";
        for (int i = 0; i < input.length(); i++) {
            String c = Character.toString(input.charAt(i));
            if (c.equals(c.toUpperCase())) {
                out += " ";
            }
            out += c;
        }
        return out;
    }


    public static void main(String[] args) {
        String s = "camelCasing";
        System.out.println(camelCase(s));
    }
}
