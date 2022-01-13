package com.company.arrays.matrixarray;

public class matrixArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[][] matrix = { {1, 2, 3}, {0, 0, 0}, {1, 1}, {2, 2} };
        int[][][] matrix3 = { {{1}, {2}, {3}}, {{0}, {0}, {0}}, {{1}, {1}, {1}}, {{2}, {2}, {2}} };

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
