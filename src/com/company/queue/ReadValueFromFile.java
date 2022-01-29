package com.company.queue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadValueFromFile {


    private  String convertInput() {
        String inputFromProperties = "C:\\Users\\123s\\IdeaProjects\\AllMyHomeWorks\\src\\com\\company\\queue\\application.properties";
        StringBuilder builder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFromProperties))) {
            while (reader.ready()) {
                builder.append(reader.readLine()).append(" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    public HashMap<String, Integer> addKeys() {
        HashMap<String, Integer> mapFromProperties = new HashMap<String, Integer>();
        String convertChars = convertInput();
        //key String for Mup
        String nameKey = "";
        //key Integer for Mup
        int valueKey = 0;
        String number = "";
        String chars = "";
        for (int i = 0; i < convertChars.length(); i++) {

            if (Character.isDigit(convertChars.charAt(i)) && convertChars.charAt(i) != '=' && convertChars.charAt(i) != ' ') {
                number += convertChars.charAt(i);
            } else if (convertChars.charAt(i) != '=' && convertChars.charAt(i) != ' ') {
                chars += convertChars.charAt(i);
            }
            if (convertChars.charAt(i) == ' ') {
                valueKey = Integer.parseInt(number);
                number = "";
                nameKey = chars;
                chars = "";
                mapFromProperties.put(nameKey, valueKey);

            }
        }

        return mapFromProperties;
    }

    public void showMup(HashMap<String, Integer> mup) {
        for (var pair : mup.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " --> " + value);
        }
    }

}
