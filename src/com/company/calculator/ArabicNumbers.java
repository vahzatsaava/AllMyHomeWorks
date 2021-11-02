package com.company.calculator;

import java.util.Scanner;

public class ArabicNumbers {
    private int firstNumber;
    private int secondNumber;

    ArabicNumbers(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstnumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    int returnResult() {
        String result = "";
        int resultValue = 0;
        System.out.println("Введите необходимую операцию");
        Scanner scannerChars = new Scanner(System.in);
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
        return resultValue;
    }


}
