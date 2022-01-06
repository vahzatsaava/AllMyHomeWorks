package com.company.arrays.matrixarray;

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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    System.out.println("Координаты минимума - " + i + " " + j);
                }
            }
        }
        System.out.println("Минимальный элемент - " + min);
    }

    //  Дан целочисленный двумерный массив,
    //  размерности n х n, поменять элементы ij и ji местами
    public static void changeValues(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }

    // В матрице элементы под главной диагональю обнулить
    public static void doZeroInDGL(int[][] matrix) {
        System.out.println("Значениям координат в диагонале присваиваем - 0");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //В матрице найти возрастающие строки и вынести на экран их номера
    public static void findIncrease(int[][] matrix) {
        String increase = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                increase += matrix[i][j] + " ";
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] > matrix[i][j + 1]) {
                    System.out.println();
                }
            }
            increase = "";
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 2}, {3, 6, -4}, {7, 5, 9}};
        findSum(matrix);//вызываем метод нахождения сумму элементов матрицы
        findMin(matrix);
        changeValues(matrix);
        System.out.println();
        doZeroInDGL(matrix);
        int[][] matrix1 = {{1, 4, 2}, {3, 6, -4}, {7, 5, 9}};
        findIncrease(matrix1);
    }
}
