package com.company.dz_from_udemy.viselica;

import java.util.Random;
import java.util.Scanner;

public class GameViselica {
    /*
    Старая добрая игра "Виселица" (с недобрым названием).

Смысл игры:

Компьютер загадывает любое слово, взятое из
словаря (ссылка на словарь прилагается). Человек пытается,
 называя буквы, угадать слово. Если буква есть в слове, компьютер
 вскрывает отгаданные буквы. Неотгаданные буквы не вскрываются, а выводятся, например,
 прочерки (дефисы). Есть ограниченное кол-во попыток (по умолчанию, максимум 6). Если попытки
 исчерпаны - человек проиграл, игра завершается и показывается загаданное слово и кол-во ошибок допущенных игроком.

Рисовать виселицу в консоли необязательно. Если есть желание - это сделать можно (но огребёте головной боли).
     */
    public static String randomWords(String[] words){
        Random random = new Random();
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[random.nextInt(words.length)];
            break;
        }
        return res;
    }
    public static String inputChar (String[] words){
        String s = randomWords(words);
        Scanner scanner = new Scanner(System.in);
        String chs = scanner.next();
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (s.contains(chs)){

            }
        }
        return "";

    }

    public static void main(String[] args) {
        String[] res = {"123","456","789"};
        String aou = randomWords(res);
        System.out.println(aou);
    }
}
