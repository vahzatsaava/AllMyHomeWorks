package com.company.arrays.codewarslevel6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticExample {
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);

    }

    public static String oddOrEven(int[] array) {
        int sum = Arrays.stream(array)
                .sum();
        return sum % 2 == 0 ? "even" : "odd";
    }

    //i increments the value (initially 0)
    //d decrements the value
    //s squares the value
    //o outputs the value into the return array
    //Invalid characters should be ignored.
    public static int[] parse(String data) {
        List<Integer> list = putCounter(data);
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private static ArrayList<Integer> putCounter(String data) {
        ArrayList<Integer> list = new ArrayList();
        int counter = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'i') {
                counter++;
            } else if (data.charAt(i) == 'd') {
                counter--;
            } else if (data.charAt(i) == 's') {
                counter = counter * counter;
            } else if (data.charAt(i) == 'o') {
                list.add(counter);
            } else {
                counter += 0;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(stringToNumber("1234"));
        System.out.println(oddOrEven(new int[]{1, 2, 4}));
        for (int i : parse("iiisdosodddddiso"))
        {
            System.out.println(i);
        }
        }

    }

