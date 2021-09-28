package com.company.strings;

public class ExchangeSymbol {
    private static String exchangeString(String example) {
//       написать метод который заменяет выбранный символ на подстроку
        String exchange = ""; //создаем переменную строковую
        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) == 'е')   //если в нашем слове есть символ е то выполняем условие
            {
                exchange += example.substring(18); //exchange при выполнении условия присваиваем значению подстроки
            } else {
                exchange += example.charAt(i);
            }
        }
       return exchange;

    }

    public static void main(String[] args) {
        String nameString = "Какой чудесный вечер";
       String result = exchangeString(nameString);
        System.out.println(result);
    }
}
