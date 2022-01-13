package com.company.strings.romNetStrings;

public class StringCamel {
    public static String toJadenCase(String phrase) {
//надо определить идет ли слово после пробела (если идет пробел за ним идет большая)
        StringBuilder builder = new StringBuilder(phrase);
        String out = "";

        for (int i = 0; i < phrase.length(); i++) {
            String res = Character.toString(phrase.charAt(i));
            if (res.equals(" ")){
                out += res.toUpperCase();
            }
            out += res;
            /*
            if (phrase.charAt(i) == ' ') {
                out += Character.toString(phrase.charAt(i + 1)).toUpperCase();
            }
            out += phrase.charAt(i);

             */
        }
        return out;
    }

    public static void main(String[] args) {
        String s = "How can mirrors be real if our eyes aren't real";
        System.out.println(toJadenCase(s));

    }
}
