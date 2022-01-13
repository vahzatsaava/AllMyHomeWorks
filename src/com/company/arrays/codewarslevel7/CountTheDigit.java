package com.company.arrays.codewarslevel7;

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
        for (int i = 0; i < res.length() ; i++) {
            for (int j = 0; j < stringBuilder.length(); j++) {
                if (res.charAt(i) == stringBuilder.charAt(j)){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(nbDig(7,9));
    }
}
