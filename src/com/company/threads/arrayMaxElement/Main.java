package com.company.threads.arrayMaxElement;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[189800001];
        /*
        array[0] = 5;
        array[100] = 7;
        array[4000] = 55;

         */
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10000);
//        }
        array[10000] = 1000;
        array[20000] = 122342;

        FindMax findMax = new FindMax(array,5);
        System.out.println(findMax.getMax());
        TimerForMethods leadTimeOfMethods = new TimerForMethods(array);
        System.out.println(leadTimeOfMethods);

        //озознать все ,пересмотреть
        //задать какие-то маленьькие значения
        // сравнить длину выполнения программы
        //сравнить время выполнения потов
    }

}
