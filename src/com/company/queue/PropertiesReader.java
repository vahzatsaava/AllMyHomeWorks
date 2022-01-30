package com.company.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class PropertiesReader {
    private String fileName;
    private final HashMap<String, String> mapFromProperties = new HashMap<String, String>();

    PropertiesReader() {
    }

    PropertiesReader(String fileName) {
        this.fileName = fileName;
    }

    private String readFile() {
        String inputFromProperties = "src/com/company/queue/application.properties";
        if (fileName == null || fileName.isEmpty()) {
            return readFileNameOrDefaultName(inputFromProperties);
        } else {
            return readFileNameOrDefaultName(fileName);
        }
    }

    private String readFileNameOrDefaultName(String name) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(name))) {
            while (reader.ready()) {
                //разобраться в методе read попробовать порасуждать над ним
                builder.append("\n").append(reader.readLine());
                //String.valueOf()
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString().trim();
    }

    private HashMap<String, String> addKeys(HashMap<String, String> map) {
        //добавляем метод который считывает с файла в переменную text
        String text = readFile();
        //делим строку на переносы
        String[] arraysSplitFile = text.split("\n");
        String key = "";
        String value = "";
        for (int i = 0; i < arraysSplitFile.length; i++) {
            //делим элементы по знаку равенства "=",создаем массив строк arraySplitValues
            String[] arraySplitValues = arraysSplitFile[i].split("=");
            for (int j = 0; j < arraySplitValues.length; j++) {
                String nameStr = "";
                String valueStr = "";
                if (j % 2 == 0) {
                    //если индекс четный то присваиваем ему valueName
                    nameStr += arraySplitValues[j];
                    key = nameStr;
                } else {
                    //если нечет то valueKey
                    valueStr += arraySplitValues[j];
                    value = valueStr;
                }
            }
            //добавляем в map полученные значения
            map.put(key, value);
        }

        /*
        //key String for Mup
        String nameKey = "";
        //key Integer for Mup
        int valueKey = 0;
        String number = "";
        String chars = "";
        for (int i = 0; i < text.length(); i++) {

            if (Character.isDigit(text.charAt(i)) && text.charAt(i) != '=' && text.charAt(i) != ' ') {
                number += text.charAt(i);
            } else if (text.charAt(i) != '=' && text.charAt(i) != ' ') {
                chars += text.charAt(i);
            }
            if (text.charAt(i) == ' ') {
                valueKey = Integer.parseInt(number);
                number = "";
                nameKey = chars;
                chars = "";
                mapFromProperties.put(nameKey, valueKey);

            }
        }

         */
        return map;
    }
    //два метода которые доступны пользователю
    //getInt
    //getString

    public void getInt(String name) {
        for (var i : addKeys(mapFromProperties).entrySet()) {
            String val = mapFromProperties.get(name);
            if (i.getKey().equals(name)) {
                System.out.println(val + " - the value !");
            }
        }
    }
    public void getString(int value) {
        String res = String.valueOf(value);
        for (var i : addKeys(mapFromProperties).entrySet()) {
            if (i.getValue().equals(res)) {
                System.out.println(i.getKey());
            }
        }
    }
    @Override
    public String toString() {
        return  mapFromProperties.toString();
    }
}
