package com.company.arrays.fromNet;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDiff {
    //Ваша цель в этом ката - реализовать функцию различия,
    // которая вычитает один список из другого и возвращает результат.
    //
    //Он должен удалить все значения из списка a, которые присутствуют в списке b, сохраняя их порядок.
    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag){
                arrayList.add(a[i]);
            }
        }
        int [] res = new int[arrayList.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{1, 2, 5};
        int[] diff = arrayDiff(a, b);
        for (int i : diff
        ) {
            System.out.println(i);

        }

    }
}
