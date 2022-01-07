package com.company.arrays.matrixarray;

import java.util.Random;

public class MatrixDZ {
    //находим сумму всех элементов матрицы
    public static void findSum(int[][] matrix) {
        int summ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                summ += matrix[i][j];
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
        int[][] newArray = new int[3][3];
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
    public static void doZeroInDGL(int[][] matrix) {
        System.out.println("Значениям под главной диагональю присваиваем - 0");
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && i != matrix[i].length - 1) {
                    matrix[i + 1][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //В матрице найти возрастающие строки и вынести на экран их номера
    public static void findIncrease(int[][] matrix) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            String increase = "";
            for (int j = 0; j < matrix[i].length - 1 ; j++) {
                if (matrix[i][j] < matrix[i][j + 1] )  {
                    increase += matrix[i][j] + " ";

                }else {
                    break;
                }

            }
            stringBuilder.append(increase + "\n");


        }
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {66, -6, -4}, {-770, 5, 9}};
        findIncrease(matrix);
    }
}
