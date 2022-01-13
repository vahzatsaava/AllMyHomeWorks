package com.company.strings.romNetStrings;

public class AccumFunction {
    //Написать функцию накопителя
    public static String accum(String s) {
        char[] stringChar = s.toCharArray();
        StringBuilder mumbling = new StringBuilder();
        int counter = 1;

        for (char letter: stringChar) {
            for (int i = 0; i < counter; i++) {
                if (i == 0) {
                    mumbling.append(Character.toUpperCase(letter));
                }
                else {
                    mumbling.append(Character.toLowerCase(letter));
                }
            }
            mumbling.append('-');
            counter++;
        }
        return mumbling.toString().substring(0, mumbling.length()-1);



    }

    public static void main(String[] args) {
        String abc = "abcDfg";
        //abc - имеем
            //A - Bb - Ccc-Dddd-Fffff-Gggggg
        System.out.println(accum(abc));
    }
}
