package com.company.calculator;

import java.util.Scanner;

public class RomanOrArabic {
    public void useTheNumbers() {
        System.out.println("Выберите какими данными будете пользоваться для подсчета.");
        System.out.println("1 - Римские цифры ");
        System.out.println("2 - Арабские");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                RomanNumb.outputResultOfRomanNumbers();
                break;
            case 2:
                ArabicNumbers.outputResultOfArabicNumerals();
                break;
            default:
                System.out.println("Введенные значения не соответствуют вводу!");

        }
        scanner.close();
    }
}
