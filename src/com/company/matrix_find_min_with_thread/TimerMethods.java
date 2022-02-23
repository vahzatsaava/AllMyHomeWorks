package com.company.matrix_find_min_with_thread;

import java.util.Date;

public class TimerMethods {
    private final int[][] matrix;

     TimerMethods(int[][] matrix) {
        this.matrix = matrix;
    }

    public int countTime( int threads) {
        MatrixThreads matrixThreads = new MatrixThreads(matrix, threads);
        long start = System.currentTimeMillis();
        try {
            matrixThreads.getMin();
        }
        catch (InterruptedException i){
            i.printStackTrace();
            return 0;
        }
        long finish = System.currentTimeMillis();
        return (int) (finish - start);

    }
}
