package com.company.OOP.converter;

public class ConverterDistance {
    private double kg;
    private double tonnes;
    private double gramms;
    private double funts;

    //Kg
    public static void killogram(double value) {
        System.out.println(value + " - Killograms");
    }

    public static void killousToTonnes(double value) {
        System.out.println(value * 0.01 + " - Tonnes");
    }

    public static void killousToGramms(double value) {
        System.out.println(value * 1000 + " - Gramms");
    }

    public static void killousToFunts(double value) {
        System.out.println(value * 2.204 + " - Funts");
    }

    //Tonnnes
    public static void tonnes(double value) {
        System.out.println(value + " - Tonnes");
    }

    public static void tonnesToKillous(double value) {
        System.out.println(value * 1000 + " - Killogrammes");
    }

    public static void tonnesToGramms(double value) {
        System.out.println(value * 1000000 + " - Gramms");
    }

    public static void tonnesToFunts(double value) {
        System.out.println(value * 2204 + " - Funts");
    }

    //Gramms
    public static void grams(double value) {
        System.out.println(value + " - Grams");
    }

    public static void gramsToTonnes(double value) {
        System.out.println(value * 0.000001 + " - Tonnes");
    }

    public static void gramsToKilous(double value) {
        System.out.println(value * 0.001 + " - Killograms");
    }

    public static void gramsToFunts(double value) {
        System.out.println(value * 0.0024 + " - Funts");
    }
    //Funts
    public static void funts(double value) {
        System.out.println(value + " - Funts");
    }

    public static void funtsToTonnes(double value) {
        System.out.println(value * 0.0004+ " - Tonnes");
    }

    public static void funtsToKillograms(double value) {
        System.out.println(value * 0.453+ " - Killograms");
    }

    public static void funtsToGrams(double value) {
        System.out.println(value * 453 + " - Grams");
    }



    @Override
    public String toString() {
        return "Киллограммы: " + kg + "\n" + "Граммы: " + gramms + "\n" + "Фунты: " + funts + "\n" + "Тонны: " + tonnes;
    }

}
