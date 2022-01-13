package com.company.strings.romNetStrings;

public class DeleteVowelsSymbols {
    public static String disemvowel(String str) {
        String res = str.toUpperCase();
        String lastRes = "";
        String middleRes = "";
//        for (int i = 0; i < res.length(); i++) {
//            if (res.charAt(i) >)
//        }
        for (char i : res.toCharArray()
        ) {if (i % 2 == 0 ){
            lastRes += Character.toString(i);
        }

        }
        return lastRes;
    }

    public static void main(String[] args) {
        String name = "alexander!";
        String names = "hello my friends";
        System.out.println(disemvowel(name));
        System.out.println(disemvowel(names));
    }
}
