package com.company.OOP.converter;


public class ConverterWeight {
        /*
        Необходимо написать программу конвертер физических
        величин.
                Масса:
        кг<->грамм<->фунт(lb)<->карат в любую сторону
        Длина (расстояние):
        метр<->миля<->ярд<->фут в любую сторону

        Пользователю сначала предлагается выбрать что
        переводить (масса или расстояние), затем предлагается
        выбрать единицу измерения. Далее пользователь должен ввести
        число. В результате программа должна вывести 4 строки с
        переведенными величинами.
        Пример:

                > Выберите что переводить:
                > [1] - масса
                >  [2] - расстояние
    > 2
            > Выберите единицу измерения:
                > [1] - метр
                > [2] - миля
                 > [3] - ярд
                 > [4] - фут
    > 1
            > Введите число:
                > 10
                > Результат:
                > метры: 10
                > мили: 0.006214
                > ярды: 10.94
                > футы: 32.81

         */    //условие задачи

    private double meter; //1 миля это 1600 метров
    private double fut;   // 1 метр 3.2 фута
    private double yard;  //1 метр 1.09 ярдов
    private double mills;
    //конвертер метров
    public static void meter(double value) {
        System.out.println(value + " - Meter");
    }
    public static void metetToFut(double value) {
        System.out.println(value * 3.8 + " - Fut");
    }
    public static void meterToYard(double value) {
        System.out.println(value * 1.09 + " - Yards");
    }

    public static void meterToMills(double value) {
        System.out.println(value * 0.00062 + " - Mills");
    }

    //конвертер ярдов
    public static void yard(double value) {
        System.out.println(value + " - Yards");
    }

    public static void yardToMeter(double value) {
        System.out.println(value * 0.9 + " - Meter");
    }

    public static void yardToFut(double value) {
        System.out.println(value * 3 + " - Fut");
    }

    public static void yardToMills(double value) {
        System.out.println(value * 0.00056 + " - Mills");
    }

    // для футов
    public static void futs(double value) {
        System.out.println(value + " - Futs");
    }

    public static void futsToMeter(double value) {
        System.out.println(value * 0.3 + " - Meter");
    }

    public static void futsToYard(double value) {
        System.out.println(value * 0.33 + " -Yard");
    }

    public static void futsToMills(double value) {
        System.out.println(value * 0.000018 + " - Mills");
    }

    //для миль
    public static void mills(double value) {
        System.out.println(value + " - Mills");
    }

    public static void millsToMeter(double value) {
        System.out.println(value * 1609 + " - Meter");
    }

    public static void millsToYard(double value) {
        System.out.println(value * 1760 + " - Yard");
    }

    public static void millsToFut(double value) {
        System.out.println(value * 5280 + " - Fut");
    }

    //переделать сделать методы отдельные

    @Override
    public String toString() {
        return "Метры: " + meter + "\n" + "Футы: " + fut + "\n" + "Мили: " + mills + "\n" + "Ярды: " + yard;

    }
}
