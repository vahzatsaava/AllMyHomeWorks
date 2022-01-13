package com.company.arrays.codewarslevel6;

public class Xbonacchi {
    /*
    Если вы выполнили ката последовательности Трибоначчи, вы бы уже знали,
    что у господина Фибоначчи есть по крайней мере старший брат. Если нет, быстро посмотрите, как все работает.

    Что ж, пора еще немного расширить семейство: подумайте о Quadribonacci,
     начинающемся с сигнатуры из 4 элементов, и каждый последующий элемент является суммой 4 предыдущих, Pentabonacci (ну, Cinquebonacci, вероятно, звучал бы немного более по-итальянски, но это было бы тоже звучит ужасно) с сигнатурой из 5 элементов, каждый последующий элемент является суммой 5 предыдущих и так далее.

    Что ж, угадайте, что? Вы должны создать функцию Xbonacci, которая принимает сигнатуру из X элементов - и помните, что каждый следующий элемент является суммой последних X элементов - и возвращает первые n элементов такой засеянной последовательности.

    xbonacci {1,1,1,1} 10 = {1,1,1,1,4,7,13,25,49,94}
    xbonacci {0,0,0,0,1} 10 = {0,0,0,0,1,1,2,4,8,16}
    xbonacci {1,0,0,0,0,0,1} 10 = {1,0,0,0,0,0,1,2,3,6}
    xbonacci {1,1} производит последовательность Фибоначчи

     */ // instruction
    public static double[] xbonacci(double[] signature, int n) {
        final int length = signature.length;
        double[] newArray = new double[n];
        for (int i = 0; i < signature.length; i++) {
            newArray[i] = signature[i];
        }

        for (int i = 0; i < newArray.length - signature.length; i++) {
            int count = 0;
            for (int j = i; j < newArray.length; j++) {
                count++;
                newArray[length  + i] += newArray[j];
                if (count >= length){
                    count = 0;
                    break;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        double[] res = {0,1};
        double[] arr = xbonacci(res, 100);
        for (double i : arr
        ) {
            System.out.println(i);

        }
    }
}
