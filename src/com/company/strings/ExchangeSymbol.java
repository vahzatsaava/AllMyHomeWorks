package com.company.strings;

public class ExchangeSymbol {
    private static String exchangeString(String example,char symbol,int subtringLeft,int substringRight) {
//       написать метод который заменяет выбранный символ на подстроку
        String exchange = ""; //создаем переменную строковую
        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) == symbol)   //если в нашем слове есть символ е то выполняем условие
            {
                exchange += example.substring(subtringLeft,substringRight); //exchange при выполнении условия присваиваем значению подстроки
            } else {
                exchange += example.charAt(i);
            }
        }
       return exchange;
    }

    public static void main(String[] args) {
        String nameString = "Какой чудесный вечер";
        char symbols = 'е';
        int leftBorder = 10;
        int rightBorder = 12;

       String result = exchangeString(nameString,symbols,leftBorder,rightBorder);
        System.out.println(result);
    }
}
