package com.company.strings.romNetStrings;

public class ExchangeValuesInteger {
       // ссылка на источник
  //  https://itvdn.com/ru/blog/article/test-java-20
    //Напишите программу на Java для того,
    // чтобы поменять местами значения, хранящиеся в двух
    // переменных с помощью третьей переменной
    public static void exchangeValues(double a, double b){
        double anotherValue = b;
        b = a;
        a = anotherValue;
        System.out.println(a);
        System.out.println(b);
    }
    //Напишите программу на Java,
    // чтобы поменять местами значения, хранящиеся в двух переменных,
    // без использования третьей переменной.
    public static void exchangeValueWithoutThirdValues(double firstVal, double secondVal){
        firstVal = firstVal + secondVal;
        secondVal = firstVal - secondVal;
        firstVal = firstVal -secondVal;
        System.out.println(firstVal);
        System.out.println(secondVal);
    }
    public static void main(String[] args) {
        exchangeValues(4,2);
        System.out.println();
        exchangeValueWithoutThirdValues(4,2);
    }
}
