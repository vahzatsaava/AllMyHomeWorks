package com.company.calculator;

import java.util.Scanner;

public class RomanNumb {
    public static String doIntegerToRomanNumeral(int input) {
        if (input < 1 || input > 3999)
            return "Несоответствие значению римских цифр";
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;
        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }

    public static int doOperationWithNumbers(){
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondnumber = scanner.nextInt();
        String operation = "";
        System.out.println("Введите необходимую операцию");
        operation = scanner.next();
        switch (operation){
            case "-":
                result = firstNumber - secondnumber;
                break;
            case "+":
                result = firstNumber + secondnumber;
                break;
            case "*":
                result = firstNumber * secondnumber;
                break;
            case "/":
                try {
                    result = firstNumber / secondnumber;
                }
                catch (ArithmeticException e){
                    System.out.println("На ноль делить нельзя!");
                }
                break;
            default:
                System.out.println("Введите необходимую операцию!");

        }
        scanner.close();

        return result;
    }
    public static void outputResultOfRomanNumbers(){
        String number = doIntegerToRomanNumeral(doOperationWithNumbers());
        System.out.println(number);
    }

}
