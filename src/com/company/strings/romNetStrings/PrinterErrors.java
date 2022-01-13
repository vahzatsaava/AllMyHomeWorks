package com.company.strings.romNetStrings;

public class PrinterErrors {
    //На фабрике принтер печатает этикетки
    // для коробок. Для одного вида ящиков принтер должен
    // использовать цвета, которые для простоты обозначены буквами от a до m.
    //
    //Цвета, используемые принтером, записываются в
    // контрольную строку. Например, "хорошей" контрольной строкой будет
    // aaabbbbhaijjjm, что означает, что принтер использовал три раза цвет
    // a, четыре раза цвет b, один раз цвет h, затем один раз цвет a ...

    public static String printerError(String s) {
        int countOfMistakes = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 97 || s.charAt(i) > 109) {
                countOfMistakes++;
            }
        }
        return countOfMistakes +"/" + s.length();
    }

    public static void main(String[] args) {
        System.out.println(printerError("aaabbbbhaijjjm"));
    }
}
