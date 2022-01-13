package com.company.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void doDigit(List<Integer> list) {
        for (Integer i : list
        ) {
            if (i % 2 == 0) {
                list.remove(i);
                list.stream();
            }
        }

    }

    public static void doWithStreamDigit(List<Integer> list) {
        Object[] array = list.stream().filter(i -> i % 2 == 0).sorted().takeWhile(i -> i < 40).toArray();
        System.out.println(Arrays.toString(array));
    }
    public static void f1(){

        System.out.println(Arrays.toString(Stream.of(4,3,6,7,8).sorted().map(i -> "Место " + i ).toArray()));
        //правильное написание
        Stream.of(4,3,6,7,8)
                .sorted()
                .map(i -> "Место " + i )
                .forEach(i -> System.out.println(i));
    }
    public static void f2(){

        System.out.println((Stream.of(4,3,6,7,8).sorted().map(i -> "Место " + i ).count()));
        //min - terminal
        //max - terminal
        //findFirst - ищет 1-й поповшийся элемент
        //AllMatch - все соответствует
        //AnyMatch - хотя ба одно соответствует
        //noneMatch -
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(5);
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);
        doWithStreamDigit(numbers);
        f1();
        f2();
    }
}
