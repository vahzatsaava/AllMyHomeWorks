package com.company.OOP.converter;

import java.util.Scanner;

public class ChoiseQuantities {
    public static void choiseParametrs() {
        System.out.println("Выберите что будем сравнивать!");
        System.out.println("1 - Вес");
        System.out.println("2 - Дистанция");
        Scanner scanner = new Scanner(System.in);
        int weightOrDistance = scanner.nextInt();
        switch (weightOrDistance) {
            case 1:
                System.out.println("Выберите пожалуйста величину измерения дистанции");
                System.out.println("1 - метры");
                System.out.println("2 - ярды");
                System.out.println("3 - футы");
                System.out.println("4 - мили");
                int distance = scanner.nextInt();
                switch (distance) {
                    case 1:
                        System.out.println("Введите число метров");
                        int distanceMeter = scanner.nextInt();
                        ConverterWeight.meter(distanceMeter);
                        ConverterWeight.metetToFut(distanceMeter);
                        ConverterWeight.meterToYard(distanceMeter);
                        ConverterWeight.yardToMills(distanceMeter);
                        break;
                    case 2:
                        System.out.println("Введите число ярдов");
                        int distanceYards = scanner.nextInt();
                        ConverterWeight.yard(distanceYards);
                        ConverterWeight.yardToFut(distanceYards);
                        ConverterWeight.yardToMeter(distanceYards);
                        ConverterWeight.meterToMills(distanceYards);
                        break;
                    case 3:
                        System.out.println("Введите число футов");
                        int distanceFut = scanner.nextInt();
                        ConverterWeight.futs(distanceFut);
                        ConverterWeight.futsToMeter(distanceFut);
                        ConverterWeight.futsToMills(distanceFut);
                        ConverterWeight.futsToYard(distanceFut);
                        break;
                    case 4:
                        System.out.println("Введите число миль");
                        int distanceMills = scanner.nextInt();
                        ConverterWeight.mills(distanceMills);
                        ConverterWeight.millsToMeter(distanceMills);
                        ConverterWeight.millsToYard(distanceMills);
                        ConverterWeight.millsToFut(distanceMills);
                        break;
                    default:
                }
                break;
            case 2:
                System.out.println("Выберите пожалуйста величину измерения веса");
                System.out.println("1 - киллограммы");
                System.out.println("2 - граммы");
                System.out.println("3 - фунт");
                System.out.println("4 - тонна");
                int weight = scanner.nextInt();
                switch (weight) {
                    case 1:
                        System.out.println("Введите число килограмов");
                        int distanceKG = scanner.nextInt();
                        ConverterDistance.killogram(distanceKG);
                        ConverterDistance.killousToTonnes(distanceKG);
                        ConverterDistance.killousToFunts(distanceKG);
                        ConverterDistance.killousToGramms(distanceKG);
                        break;
                    case 2:
                        System.out.println("Введите число граммов");
                        int distanceGrams = scanner.nextInt();
                        ConverterDistance.grams(distanceGrams);
                        ConverterDistance.gramsToTonnes(distanceGrams);
                        ConverterDistance.gramsToKilous(distanceGrams);
                        ConverterDistance.gramsToFunts(distanceGrams);
                        break;
                    case 3:
                        System.out.println("Введите число фунтов");
                        int distanceFunts = scanner.nextInt();
                        ConverterDistance.funts(distanceFunts);
                        ConverterDistance.funtsToTonnes(distanceFunts);
                        ConverterDistance.funtsToKillograms(distanceFunts);
                        ConverterDistance.funtsToGrams(distanceFunts);
                        break;
                    case 4:
                        System.out.println("Введите число тонн");
                        int distanceTonns = scanner.nextInt();
                        ConverterDistance.tonnes(distanceTonns);
                        ConverterDistance.tonnesToKillous(distanceTonns);
                        ConverterDistance.tonnesToFunts(distanceTonns);
                        ConverterDistance.tonnesToGramms(distanceTonns);
                        break;
                    default:
                }
                break;
            default:
                System.out.println("Введен неизвестный параметр!");
        }
        scanner.close();
    }

}
