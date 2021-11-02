package com.company.calculator;

import com.company.OOP.Car;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int typeFirstValue() {
        System.out.println("Введите первое значение");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    private static int typeSecondValue() {

        System.out.println("Введите второе значение");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }
    public static void main(String[] args) {
        //находим сумму и выводим
        ArabicNumbers arabicNumbers = new ArabicNumbers(typeFirstValue(), typeSecondValue());
        System.out.println(arabicNumbers.returnResult());

    }

}
