package com.company.arrays.fromNet;

public class MinArrayInteger {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min){
                min = args[i];
            }
        }
        return min;
    }
        public static void main(String[] args) {
        int[] a = new int[]{33,33,2,55,34,-45,-34,3,4,1,3,5,6,-324};
            System.out.println(findSmallestInt(a));
    }
}
