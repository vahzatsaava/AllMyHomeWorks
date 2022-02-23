package com.company.matrix_find_min_with_thread;

public class MatrixGetMinResult extends Thread {
    private final int[][] matrix;
    private final int leftBorder;
    private final int rightBorder;
    private Integer result;

    MatrixGetMinResult(int[][] matrix, int leftBorder, int rightBorder) {
        this.matrix = matrix;
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
    }

    @Override
    public void run() {
        int min = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        result = min;
    }

    public int getMinResult() {
        if (result == null) {
            throw new NullPointerException();
        }
        return result;
    }
}
