package com.company.strings.romNetStrings;

public class ExesAndOhs {
    public static boolean getXO(String str) {
        int countOfX = 0;
        int countOfo = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x'){
                countOfX++;
            }
            if (str.charAt(i) == 'o'){
                countOfo ++;
            }
        }
        if (countOfo == countOfX){
            return true;
        }
        if (countOfo == 0 && countOfX == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "dsfsdf";
        String x = "ooxXOx";
        System.out.println(getXO(s));
    }
}
