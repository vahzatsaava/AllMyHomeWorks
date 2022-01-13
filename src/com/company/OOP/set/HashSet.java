package com.company.OOP.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet {
    public static void main(String[] args) {
        java.util.Set<String> strings = new TreeSet<>();
        String s = "что входная строка содержит только буквы буквы что";
        //split возвращает массив
        String[] words = s.split(" ");
        for (String word : words) {
            strings.add(word);
            System.out.println(word.hashCode());
        }
        System.out.println(strings);
    }
}
