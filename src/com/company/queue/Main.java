package com.company.queue;


import java.io.IOException;
import java.util.HashMap;

public class Main {

    // предоставить возможность по заданному ключу доставать значения из файла
    public static void main(String[] args) {
        PropertiesReader propertiesReader = null;
        try {
            propertiesReader = new PropertiesReader();

        } catch (IOException i) {
            System.out.println("Exp");
        }
        //propertiesReader.getInt("peoplePerHour");
        //propertiesReader.getString(60);
        //System.out.println(propertiesReader);
        String inputFromProperties = "src/com/company/queue/application.properties";
        System.out.println(propertiesReader.toString());

    }
}
