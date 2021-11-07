package com.company.calculator;

import java.util.Scanner;

public class ArabicNumbers {
    public static void outputResultOfArabicNumerals() {

        String result = "";
        int resultValue = 0;
        Scanner scannerChars = new Scanner(System.in);
        System.out.println("Введите первое значение!");
        int firstNumber = scannerChars.nextInt();
        System.out.println("Введите второе значение!");
        int secondNumber = scannerChars.nextInt();
        System.out.println("Введите необходимую операцию");
        result = scannerChars.next();
        switch (result) {
            case "-":
                resultValue = firstNumber - secondNumber;
                break;
            case "+":
                resultValue = firstNumber + secondNumber;
                break;
            case "/":
                try {
                    resultValue = firstNumber / secondNumber;

                } catch (ArithmeticException e) {
                    System.out.println("На ноль нельзя делить");
                    resultValue = 0;
                }
                break;
            case "*":
                resultValue = firstNumber * secondNumber;
            default:

        }
        scannerChars.close();
        System.out.println(resultValue);
    }

    public static void main(String[] args) {

        outputResultOfArabicNumerals();
    }


}
