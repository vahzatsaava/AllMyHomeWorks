package com.company.threads.arrayMaxElement;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[5001];
        array[0] = 5;
        array[100] = 7;
        array[4000] = 55;
        FindMax findMax = new FindMax(array,5);
        System.out.println(findMax.getMax());
        //озознать все ,пересмотреть
        //задать какие-то маленьькие значения
        // сравнить длину выполнения программы
        //сравнить время выполнения потов
    }

}
