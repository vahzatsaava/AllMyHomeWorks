package com.company.arrays.matrixarray;

import java.util.Arrays;
import java.util.Random;

public class MatrixDZ {
    //находим сумму всех элементов матрицы
    public static void findSum(int[][] matrix) {
        int summ = 0;
        //использование цикла for
        /*
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                summ += matrix[i][j];
            }
        }
         */
        //цикл foreach
        for (int[] i : matrix) {
            for (int j : i
            ) {
                summ += j;
            }
        }
        System.out.println("Сумма элементов - " + summ);
    }

    //Дан целочисленный двумерный массив, размерности
    // n х m, найти наименьший элемент массива и координату, в которой он находится
    public static void findMin(int[][] matrix) {
        int min = matrix[0][0];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String res = "";
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    res += i + " " + j;
                    stringBuilder.setLength(0);
                    stringBuilder.append(res);
                }
            }
        }
        System.out.println("Координаты минимального элемента - " + stringBuilder);
        System.out.println("Минимальный элемент - " + min);
    }

    //  Дан целочисленный двумерный массив,
    //  размерности n х n, поменять элементы ij и ji местами
    public static int[][] changeValues(int[][] matrix) {
        int[][] newArray = new int[matrix.length][matrix.length];
        System.out.println("Выводим исходные данные массива !");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Выводим изменения!");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + "  ");
            }
            System.out.println();
        }
        return newArray;
    }

    // В матрице элементы под главной диагональю обнулить
    //пройтись столько раз сколько надо обнулить элементов
    public static void doZeroInDGL(int[][] matrix) {
        System.out.println("Значениям под главной диагональю присваиваем - 0");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                matrix[i][j] = 0;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //В матрице найти возрастающие строки и вынести на экран их номера
    //последний элемент рассмотреть отдельно
    //сохранить отдельно последний элемент
    public static void findIncrease(int[][] matrix) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            //последеняя переменная массива
            int lastValue = 0;
            //предпоследняя переменная массива
            int beforeLastValue = 0;
            for (int j = 0; j < matrix[i].length - 1; j++) {
                lastValue = matrix[i][matrix[i].length - 1];
                beforeLastValue = matrix[i][matrix[i].length - 2];
                if (matrix[i][j] < matrix[i][j + 1] && lastValue > beforeLastValue) {
                    if (j == matrix[i].length - 2) {
                        stringBuilder.append("Номера увеличивающихся строк - ").append(i).append("\n");
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(stringBuilder);
    }

    // В матрице найти убывающие столбцы и вывести на экран их номера
    public static void findIncreaseI(int[][] matrix) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            if (i > 0) {
                break;
            }
            int lastValue = 0;
            int beforeLastValue = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                //последний элемент столбца(нижний)
                lastValue = matrix[matrix.length - 1][j];
                //предпоследний элемент столбца
                beforeLastValue = matrix[matrix.length - 2][j];
                if (matrix[i][j] > matrix[i + 1][j] && lastValue < beforeLastValue) {
                    stringBuilder.append("Убывающие столбцы - ").append(j).append("\n");

                }
            }
        }
        System.out.println(stringBuilder);
    }

    // Сделать циклический сдвиг четных строк на 1 элемент вправо, а нечётных на 2 вправо
    public static void moveInPosition(int[][] matrix) {
        int[][] b = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    swapsElementsInArray(matrix[i], 1);
                    break;

                } else {
                    swapsElementsInArray(matrix[i], 2);
                    break;
                }
            }
        }
        for (int[] i : matrix) {
            //вывод в одну строку
            System.out.println(Arrays.toString(i));
            //     вывод с помощью вложенного цикла
//            for (int value : i) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
        }
    }


    public static int[] swapsElementsInArray(int[] array, int position) {
        /*
        if (position < 0) throw new IllegalArgumentException("Значение отрицательное !");
        int rightIndexPosition = array.length - position;
        if (rightIndexPosition == 0 || rightIndexPosition == array.length) {
            return array;
        }
        //создаем новый массив где будем перезаливать данные
        int[] newArray = new int[array.length];
        //создаем счетчик для значений массива
        int arrIndex = 0;
        //пока значение счетчика меньше длины массива (прогоняем условие)
        while (arrIndex < array.length) {
            if (rightIndexPosition < array.length - 1) {
                rightIndexPosition = 0;
            }
            //присваиваем значение  массива array от индекса[rightIndexPosition] newArray[arrIndex++]
            newArray[arrIndex++] = array[rightIndexPosition++];
        }
        return newArray;

         */
        int first = array[0];
            for (int i = 0; i < array.length  ; i++) {
                if (i == array.length - 1){
                    array[array.length-1] = first;
                    break;
                }
                array[i] = array[(i+position) % array.length];
            }
            /*
            for (int i = 0; i < position; i++) {
            int lastValue = array[array.length - 1];

            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
array[0] = lastValue;
             */


        return array;


    }


    public static void main(String[] args) {
        // int[][] matrixI = {{1, -402, 3}, {0, -60, -120}, {-1, -505, -900}};
        //int[][] matrixJ = {{1, 2, 3}, {4, 7, 9}, {-1, -10, 5}};
//        int[][] matrixY = {
//                {5, 2, 3},
//                {4, 5, 8},
//                {1, 8, 10}};
        int[] arr = {1, 2, 3, 4, 5, 6};
        swapsElementsInArray(arr, 1);
        for (int i : swapsElementsInArray(arr, 4)
        ) {
            System.out.println(i);

        }
        //findIncrease(matrixJ);
        //findIncreaseI(matrixI);
        //moveInPosition(matrixI);
        //    findIncreaseI(matrixY);
        //  moveInPosition(matrixJ);

    }
}
