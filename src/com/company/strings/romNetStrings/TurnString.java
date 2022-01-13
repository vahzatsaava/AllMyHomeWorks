package com.company.strings.romNetStrings;

public class TurnString {
    //Напишите программу на Java для переворачивания строки,
    // изменив расположение символов в строке задом наперёд без использования встроенных в String функций
    //первый способ
    public static void turnString(String name) {
        char[] result = name.toCharArray();  //создаем массив чаров
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.printf(result[i] + " "); //выводим результат в строку
        }
    }

    //второй способ
    public static void turnStringSec(String name) {
        String result = "";//создаем переменную для склеивания результата
        for (int i = name.length()-1; i >= 0 ; i--) {
            result += name.charAt(i) + " ";
        }
        System.out.println(result);
    }

    // c использованием функции reverse
    public static void  turnWithBuilder(String name){
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.reverse();
        System.out.println(builder);
    }

    public static void main(String[] args) {
        String name = "Сегодня мы идем гулять";
        turnString(name);
        System.out.println();
        turnStringSec(name);
        System.out.println();
        turnWithBuilder(name);
    }
}
