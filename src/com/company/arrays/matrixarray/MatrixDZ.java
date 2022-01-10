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
        for (int[] i : matrix
        ) {
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
    //последний элемент рассмотреть отдельно
    //сохранить отдельно последний элемент
    public static void findIncrease(int[][] matrix) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            int lastValue = 0;
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
                    stringBuilder.append("Убывающие строки - ").append(j).append("\n");

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
                if (j % 2 == 0) {
                    swapsElementsInArray(matrix[i], 1);
                } else {
                    swapsElementsInArray(matrix[i], 2);
                }
                System.out.print(matrix[i] + " ");
            }
            System.out.println();
        }

    }

    public static int[] swapsElementsInArray(int[] array, int position) {
        for (int i = 0; i < position; i++) {
            int lastValue = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastValue;
        }
        return array;

    }


    public static void main(String[] args) {
        int[][] matrixI = {{1, -402, 3}, {0, -60, -120}, {-1, -505, -900}};
        int[][] matrixJ = {{1, 2, 3}, {4, 7, 9}, {-1, -10, 0}};
        //findIncrease(matrixJ);
        //findIncreaseI(matrixI);

        moveInPosition(matrixJ);


    }
}
