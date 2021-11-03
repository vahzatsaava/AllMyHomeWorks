package com.company.OOP.converter;

import java.util.Scanner;

public class ConverterMain {

    private static void choiseParametrs() {
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
                Scanner scanner1 = new Scanner(System.in);
                int distance = scanner1.nextInt();
                switch (distance) {
                    case 1:
                        System.out.println("Введите число метров");
                        Scanner scannerMeter = new Scanner(System.in);
                        int distanceMeter = scannerMeter.nextInt();
                        ConverterWeight converterWeightMeter = new ConverterWeight(distanceMeter);
                        System.out.println(converterWeightMeter);
                        break;
                    case 2:
                        System.out.println("Введите число ярдов");
                        Scanner scannerYard = new Scanner(System.in);
                        int distanceYards = scannerYard.nextInt();
                        ConverterWeight converterWeightYards = new ConverterWeight(distanceYards);
                        System.out.println(converterWeightYards);
                        break;
                    case 3:
                        System.out.println("Введите число футов");
                        Scanner scannerFut = new Scanner(System.in);
                        int distanceFut = scannerFut.nextInt();
                        ConverterWeight converterWeightFut = new ConverterWeight(distanceFut);
                        System.out.println(converterWeightFut);
                        break;
                    case 4:
                        System.out.println("Введите число миль");
                        Scanner scannerMills = new Scanner(System.in);
                        int distanceMills = scannerMills.nextInt();
                        ConverterWeight converterWeightMills = new ConverterWeight(distanceMills);
                        System.out.println(converterWeightMills);
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
                Scanner scanner2 = new Scanner(System.in);
                int weight = scanner2.nextInt();
                switch (weight) {
                    case 1:
                        System.out.println("Введите число килограмов");
                        Scanner scannerKG = new Scanner(System.in);
                        int distanceKG = scannerKG.nextInt();
                        ConverterDistance converterDistanceKG = new ConverterDistance(distanceKG);
                        System.out.println(converterDistanceKG);
                        break;
                    case 2:
                        System.out.println("Введите число граммов");
                        Scanner scannerGrams = new Scanner(System.in);
                        int distanceGrams = scannerGrams.nextInt();
                        ConverterDistance converterDistanceGrams = new ConverterDistance(distanceGrams);
                        System.out.println(converterDistanceGrams);
                        break;
                    case 3:
                        System.out.println("Введите число фунтов");
                        Scanner scannerFunts = new Scanner(System.in);
                        int distanceFunts = scannerFunts.nextInt();
                        ConverterDistance converterDistanceFunts = new ConverterDistance(distanceFunts);
                        System.out.println(converterDistanceFunts);
                        break;
                    case 4:
                        System.out.println("Введите число тонн");
                        Scanner scannerTonns = new Scanner(System.in);
                        int distanceTonns = scannerTonns.nextInt();
                        ConverterDistance converterDistanceTonns = new ConverterDistance(distanceTonns);
                        System.out.println(converterDistanceTonns);
                        break;
                    default:
                }
                break;
            default:
                System.out.println("Введен неизвестный параметр!");

        }

    }

    public static void main(String[] args) {

        choiseParametrs();
    }
}
