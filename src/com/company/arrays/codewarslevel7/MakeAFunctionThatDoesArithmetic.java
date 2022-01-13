package com.company.arrays.codewarslevel7;

public class MakeAFunctionThatDoesArithmetic {
    public static int arithmetic(int a, int b, String operator) {
        double result = 0;
        switch (operator) {
            case "add":
                result = a + b;
            break;
            case "subtract":
                result = a - b;
            break;
            case "multiply":
                result = a * b;
            break;
            case "divide":
                result = a / b;
            default:

        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(arithmetic(2,4,"subtract"));
    }
}
