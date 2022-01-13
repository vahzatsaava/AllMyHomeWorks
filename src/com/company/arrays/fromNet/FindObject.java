package com.company.arrays.fromNet;

import java.util.Arrays;

public class FindObject {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                return "found the needle at position " + i;
            }
        }
        return "needle lost" ;
    }

    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "world", "hay", 2, "3", true, "needle"};
        System.out.println(findNeedle(haystack1));

    }
}