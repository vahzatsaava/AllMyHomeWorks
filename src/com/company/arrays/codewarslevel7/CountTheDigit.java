package com.company.arrays.codewarslevel7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTheDigit {
    //пользователь вводит два числа ,первое больше 0 , второе d меньше 9,  нужно подсчитать сколько будет совпадений
    // числа d в цисле n ,если числа от 0 до n мы еще возведем в квадрат
    public static int nbDig(int n, int d) {
        int count = 0;
        String res = String.valueOf(d);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            stringBuilder.append(i * i);
        }
        System.out.println(stringBuilder.toString());
        for (int i = 0; i < res.length(); i++) {
            for (int j = 0; j < stringBuilder.length(); j++) {
                if (res.charAt(i) == stringBuilder.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static double find_average(int[] array) {

        return Arrays.stream(array)
                .average()
                .orElse(0);

    }

    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            start++;
            if (start++ != 5) {
                count++;
            }
        }
        return count;
    }
private static  char[] x = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static char findMissingLetter(char[] array) {

        String res = "";
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        res = res.toLowerCase();

        int leftBoard = 0;
        int rightBoard = 0;
        for (int i = 0; i < x.length; i++) {
            if (res.charAt(0) == x[i]){
                leftBoard = i;
            }
            if (res.charAt(res.length() - 1) == x[i]){
                rightBoard = i;
            }
        }
        String s = Arrays.toString(x).replace("[","")
                .replaceAll("]","")
                .replaceAll(",","")
                .replaceAll(" ","").substring(leftBoard,rightBoard + 1);

        String alphabet = "";
        for (int i = 0; i < res.length(); i++) {
            if (!(res.contains(s.charAt(i) + ""))){
                alphabet += s.charAt(i);
            }
        }

        return alphabet.charAt(0);
    }
    //112

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {

            if (arrayOfSheeps[i] == true && arrayOfSheeps[i] != null){
                count++;
            }
        }

        int num = (int) Arrays.stream(arrayOfSheeps)
                .filter(i -> i.equals(true))
                .count();
        return count;

    }

        public static void main(String[] args) {
        System.out.println(nbDig(7, 9));
        System.out.println(find_average(new int[]{1, 2, 3}));
        System.out.println(dontGiveMeFive(4, 17));
        System.out.println(findMissingLetter(new char[]{'O','Q','R','S'}));
            System.out.println(countSheeps(new Boolean[]{true,  true,  true,  false,
                    true,  true,  true,  true ,
                    true,  false, true,  false,
                    true,  false, false, true ,
                    true,  true,  true,  true ,
                    false, false, true,  true }));
    }
}
