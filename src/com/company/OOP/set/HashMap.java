package com.company.OOP.set;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("Garry", 33);
        map.put("War", 20);
        map.put("Charly", 55);
        for (Map.Entry<String, Integer> i : map.entrySet()
        ) { if (i.getValue() < 30){
            System.out.println(i.getKey());
        }

        }

    }
}
