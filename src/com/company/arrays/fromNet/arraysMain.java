package com.company.arrays.fromNet;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class arraysMain {
    //Если в массиве А(20) есть элемент равный квадрату последнего элемента,
    //то все элементы расположенные после такого элоемента возвести в
    //квадрат, иначе оставить массив без изменения.
    public static void doArraysSqrt(int[] array) {
        //int [] arrays = new int[]{0,2,2,3,4,5,5,5,2,2,2,4,2};
        int numberValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == (array[array.length - 1] * array[array.length - 1])) {
                numberValue = i;
                break;
            }
        }
        for (int i = numberValue; i < array.length; i++) {
            System.out.println(array[i] * array[i]);
        }

    }

    // Известно, что у заданного вещественного вектора Х=(х1, х2, ...., х8) есть по крайней мере одна
    // отрицательная компонента. Определить номер первой по порядку отрицательной
    //компоненты.
    public static int findTheMinNumber(int[] array) {
        int numberValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                numberValue = i;
                break; // при первом нахождении отрицательного числа программа прекратит дальшейший поиск других чисел
            }
        }
        return numberValue;
    }

    //сортировка по возрастанию
    public static int[] doSortByMax(int[] arrrays) {
        //Внешний цикл каждый раз сокращает фрагмент массива тк внутренний цикл каждый раз
        // ставит в конец фрагмента максимальный элемент
        for (int i = arrrays.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrrays[j] > arrrays[j + 1]) { //если исходное значение больше следующего впереди
                    int tmp = arrrays[j];         //tmp = исходному значению
                    arrrays[j] = arrrays[j + 1];
                    arrrays[j + 1] = tmp;
                }
            }
            //Сравниваем элементы попарно,если они имеют неправильный порядок
            // то меняем местами
        }
        return arrrays;
    }

    //Аналогичный метод (По убыванию сортировка)
    public static int[] doSortByMin(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int minTemp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = minTemp;
                }
            }
        }
        return array;
    }

    //** - задача №2
    //    Создать статический метод, который будет иметь два целочисленных параметра a и b, и в качестве
    //    своего значения возвращать случайное целое число из
    //       отрезка [a;b]. C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.
    public static int findAndReturnRandomNumber(int firstNumber, int secondNumber) {
        Random random = new Random();
        return random.nextInt(firstNumber - secondNumber);
    }

    //                    задача № 6
    //Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
    // а затем этот же массив выведите на экран тоже в строку,
    // но в обратном порядке (99 97 95 93 … 7 5 3 1).
    public static void findEvenNumbers(int value) {
        int[] array = new int[value];
        for (int i = 0; i <= array.length; i++) {
            if (i % 2 == 1) {
                //  System.out.println(i);
                System.out.printf(" " + i);
            }
        }
        System.out.println();
        for (int i = array.length; i > 0; i--) {
            if (i % 2 == 1) {
                System.out.printf(" " + i);
            }
        }

    }

    //    задача №7
    //Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
    // Подсчитайте сколько в массиве чётных элементов и выведете
    // это количество на экран на отдельной строке.
    public static int[] makeRandomArray(int valueOfRandom, int arraySize) {
        Random random = new Random();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(valueOfRandom);
        }
        return array;
    }

    public static void returnEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
    }

    //В небольшом городке на начало года население p0 = 1000. Население регулярно увеличивается на 2 процента в год,
    // и более 50 новых жителей ежегодно приезжают в город. Сколько лет нужно городу, чтобы его население было больше или равно p = 1200 жителей?
    public static int nbYear(int p0, double percent, int aug) {
        int years = 0;
        /*
        while (result >= 1200) {
            years++;
            p0 = (int)  (p0 + (p0 * percent) + aug);
            result = p0;
            continue;
        }

         */
        for (int i = 0; i < 10; i++) {
            double result = 0;
            years++;
            p0 = (int) (p0 + (p0 * percent) + aug);
            result = p0;
            if (result >= 1200) {
                break;
            }
        }
        return years;
    }

    //Вам будет дан массив целых чисел. Ваша задача - взять этот
    // массив и найти индекс N, где сумма целых чисел слева от N равна
    // сумме целых чисел справа от N. Если нет индекса, который мог бы сделать это, верните - 1
    public static int summLeft(int[] arr, int index ) {
        int leftSumm = 0;
        for (int i = 0; i < index ; i++) {
            leftSumm += arr[i];
        }
        return leftSumm;
    }
    public static int summRight (int[] arr,int index){
        int rightSumm = 0;
        for (int i = index + 1; i < arr.length ; i++) {
            rightSumm += arr[i];
        }
        return rightSumm;
    }

    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (summLeft(arr,i) == summRight(arr,i)){

                return i;
            }

        }
        return -1;
    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        return "";
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            int leftSumm = summRight(arr,i);
        }
        int a = findEvenIndex(arr);
        System.out.println(a);


//        int res = nbYear(1000, 0.02, 50);
//        System.out.println(res);
        /*
        //Создать метод, который будет сортировать указанный
        // массив по возрастанию любым известным вам способом.
        //используем сортировку пузырьком
      //  int[] array = new int[]{1, 6, 2, 3, 12, -12, 0, 9};
        //doSortByMin(array);
       // doSortByMax(array);
        //for (int i : array
       // ) {
         //   System.out.println(i);
       // }

         */  //решение задачи с сортировкой данных
        /*
        int[] array = new int[20];
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = findAndReturnRandomNumber(15, 10);
            }
            for (int i : array
            ) {
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println("Значение должно быть положительным ,а первое значение больше второго");
        }

         */  // решение второй задачи **2
        /*
        int [] arrayOfNumbers = new int[]{0,-1,-3,-2,-0,-0,0,40,-5,4,5};
        int findModul = findTheMinNumber(arrayOfNumbers);
        System.out.println(findModul);

         */  // нахождение элемента отрицательного
        /*
        int[] arrays = new int[]{0, 2, 2, 3, 4, 5, 5, 5, 2, 2, 2, 4, 2};
        doArraysSqrt(arrays);

         */  // если квадрат последнего элемента массива равен
        // какому либо элементу то возвести в квадрат элементы
        /*
        findEvenNumbers(100);

         */  // задача 6
        /*
        int[] arrays = makeRandomArray(10, 15);
        for (int i : arrays
        ) {
            System.out.println(i);
        }
        System.out.println();
        returnEvenNumbers(arrays);

         */  // задача 7
    }
}
