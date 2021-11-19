package com.company.converter.converter_for_numbers;

import javax.swing.text.html.HTMLDocument;

public class Hexadecimal {
    //тесты
    // null ; ""
    //парсим в 16 - чную систему исчисления
    // 10 -A
    // 11- B
    // 12 -C
    // 13 -D
    // 14 -E
    // 15 -F
    // сделать тесты для системы
    //сделать конвертер для перевода из одной системы в другую
    // разрабатывать архитектуру приложения
    // создать конструктор
    // возвращать сам decimal а не String
    //Конвертер без участия классов
    private String hexadecimal = "";

    public Hexadecimal(String hexadecimal) throws Exception{
        if (isValid(hexadecimal)) {
            this.hexadecimal = hexadecimal;
        }
        else {
            throw new Exception();
        }

    }

    public static Hexadecimal parseHexadecimals(Binary binary) throws Exception {
        int decValue = Binary.parseDecimal(binary);
        return parseHexadecimal(decValue);
    }


    public static Hexadecimal parseHexadecimal(int valueTen) throws Exception {
        String result = "";
        while (valueTen > 0) {
            char res;
            int digit = valueTen % 16; // остаток от деления на 16
            if (10 <= digit) {
                int difference = digit - 10;
                res = (char) (difference + 'A');
                result = res + result;
            } else {
                result = digit + result;
                // прибавляем к остатку переменную result
            }

            valueTen = valueTen / 16;  // уменьшаем на 16
        }
        return new Hexadecimal(result);
    }


    public static boolean isValid(String hexadecimal) {
        for (int i = 0; i < hexadecimal.length(); i++) {
            if (!(hexadecimal.charAt(i) >= 'A' && hexadecimal.charAt(i) <= 'F' || Character.isDigit(hexadecimal.charAt(i)))) {
                return false;
                //если наше значение Равно диапазону от A до F или равно числу то условие правильное
            }

        }
        return true;
    }


    @Override
    public String toString() {
        return hexadecimal;
    }
}
