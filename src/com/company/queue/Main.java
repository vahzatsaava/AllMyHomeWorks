package com.company.queue;


import java.util.HashMap;

public class Main {

    // предоставить возможность по заданному ключу доставать значения из файла
    public static void main(String[] args) {
        PropertiesReader readValue = new PropertiesReader();
        readValue.getInt("peoplePerHour");
        readValue.getString(60);
        System.out.println(readValue);

    }
}
