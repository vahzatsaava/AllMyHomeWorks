package com.company.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StreamApiDZ {
    //В массиве чисел найти количество таких чисел,
    // которые кратны 3 и при этом явялются нечетными
    public static void multipleOfThree(int[] array) {
        long countOfDigits = Arrays.stream(array).
                filter(i -> i % 3 == 0).
                filter(i -> i % 2 == 1)
                .count();
        System.out.println(countOfDigits);
    }

    //Дан arraylist, который состоит из названий продуктов.
    // Найти те продукты, которые начинаются с буквы А
    public static void beginAatFirstSymbol(List<String> products) {
        Object[] product = products.stream().
                filter(i -> i.charAt(0) == 'A').
                toArray();
        System.out.println(Arrays.toString(product));
    }

    //Даны три списка. Первый список - названия телефонов,
    // второй - название автомобилей, третий - название фруктов.
    // Найти только те товары, в которых количество букв больше 5
    public static void containFiveChars(List<String> listOfPhones, List<String> listOfCars, List<String> listOfProducts) {
        Object[] phones = listOfPhones.stream()
                .filter(i -> i.length() > 5)
                .toArray();
        System.out.println(Arrays.toString(phones));
        Object[] cars = listOfCars.stream()
                .filter(i -> i.length() > 5)
                .toArray();
        System.out.println(Arrays.toString(cars));
        Object[] products = listOfProducts.stream()
                .filter(i -> i.length() < 5)
                .toArray();
        System.out.println(Arrays.toString(products));

    }

    //задан массив с целыми числами -  копейкамию
    //преобразовать так, чтобы элемент в виде Х руб., Y коп
    public static void exchangeCentsToDollar(int[] array) {

        // int cents = Arrays.stream(array).
        Object[] arr = Arrays.stream(array)
                .mapToObj(i -> String.format("%d руб %d коп", i / 100, i % 100))
                .toArray();
        System.out.println(Arrays.toString(arr));

    }

    public static void showMaxEnginePower(List<CarsForStream> carsEngine) {
        Object[] pow = carsEngine.stream()
                .filter(i -> i.getPower() > 250)
                .toArray();
        System.out.println(Arrays.toString(pow));
        CarsForStream max = carsEngine.stream().max(CarsForStream::compare).get();
        System.out.println(max.getPower());

    }

    //убедиться в том что в массиве все числа четные
    public static void isEvenNumbers(int[] array) {
        boolean isEven = Arrays.stream(array)
                .allMatch(i -> i % 2 == 0);
        System.out.println(isEven);
    }


    public static void main(String[] args) {
        int[] array = {1, -4, 14, 6, 9, 21, 36, 5, 100, 4};
        multipleOfThree(array);
        List<String> products = new ArrayList<>();
        products.add("Potato");
        products.add("Apple");
        products.add("Cherry");
        products.add("Adidas");
        beginAatFirstSymbol(products);

        LinkedList<String> listOfPhones = new LinkedList<>();
        listOfPhones.add("Nokia");
        listOfPhones.add("Samsung");
        listOfPhones.add("Sony");
        listOfPhones.add("Huawey");
        LinkedList<String> listOfCars = new LinkedList<>();
        listOfCars.add("Tesla");
        listOfCars.add("audi");
        listOfCars.add("BMW");
        listOfCars.add("Lada");
        listOfCars.add("Kia");
        LinkedList<String> listOfProducts = new LinkedList<>();
        listOfProducts.add("Apple");
        listOfProducts.add("mango");
        listOfProducts.add("Kiwi");
        System.out.println();
        containFiveChars(listOfPhones, listOfCars, listOfProducts);
        int[] cents = {120, 230, 340, 1230, 570};
        CarsForStream audi = new CarsForStream("A4", "r220o3", "yellow", 180);
        CarsForStream lada = new CarsForStream("Granta", "s550rr", "black", 102);
        CarsForStream mustang = new CarsForStream("Mustang", "o004rr", "white", 450);
        CarsForStream kia = new CarsForStream("Rio", "sd45", "Green", 220);
        CarsForStream mercedes = new CarsForStream("E200", "ds432", "orange", 290);
        LinkedList<CarsForStream> allCarsPower = new LinkedList<>();
        allCarsPower.add(audi);
        allCarsPower.add(lada);
        allCarsPower.add(mustang);
        allCarsPower.add(kia);
        allCarsPower.add(mercedes);
        showMaxEnginePower(allCarsPower);
        //вывод максимума

        isEvenNumbers(array);
        exchangeCentsToDollar(cents);

    }
}
