package com.company.matrix_find_min_with_thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MatrixThreads {
    private final int[][] matrix;
    private final int threads;
    private List<PairBorders> list = new LinkedList<PairBorders>();

    public MatrixThreads(int[][] matrix, int threads) {
        this.matrix = matrix;
        this.threads = threads;
    }

    private List<PairBorders> createPairs() {
        int range = (int) Math.ceil((matrix.length * 1.0) / threads);
        for (int i = 0; i < matrix.length - matrix.length % range; i += range) {
            list.add(new PairBorders(i, i + range - 1));
            if (matrix.length % range != 0) {
                list.add(new PairBorders(matrix.length - matrix.length % range, matrix.length - 1));
            }
        }

        return list;
    }

    public int getMin() throws InterruptedException {
        List<MatrixGetMinResult> minElement = new ArrayList<>();
        List<PairBorders> borders = createPairs();
        for (PairBorders pair : borders) {
            minElement.add(new MatrixGetMinResult(matrix, pair.getLeftBorder(), pair.getRightBorder()));
        }
        for (MatrixGetMinResult thread : minElement) {
            thread.start();

        }
        for (MatrixGetMinResult thread : minElement) {
            thread.join();

        }
        int min = Integer.MAX_VALUE;
        for (MatrixGetMinResult thread : minElement) {
            if (thread.getMinResult() < min) {
                min = thread.getMinResult();
            }

        }
        return min;
    }
}
