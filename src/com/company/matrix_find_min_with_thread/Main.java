package com.company.matrix_find_min_with_thread;

import com.company.threads.arrayMaxElement.TimerForMethods;

import javax.xml.crypto.Data;
import java.util.Date;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        int[][] matrix =
                {{1, -8, 3, 4, 5, 6, 7}, {3, 4, -34, 6, 7, 8, 9, -7, 12},
                        {33, 45654, 23423, -123234, 234}, {33, 45654, 23423, -1923234, 234}
                };
        System.out.println(matrix.length);
        MatrixThreads matrixThreads = new MatrixThreads(matrix,4);
        System.out.println(matrixThreads.getMin());
        TimerMethods timerMethods = new TimerMethods(matrix);
        System.out.println(timerMethods.countTime(2));
    }
}
