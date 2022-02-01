package com.company.queue;

import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class PropertiesReader {
    private String fileName;
    private final HashMap<String, String> mapFromProperties = new HashMap<String, String>();

    PropertiesReader() throws IOException {
        fileName = "src/com/company/queue/application.properties";
        addKeys();

    }
    PropertiesReader(String fileName) throws IOException {
        this.fileName = fileName;
        addKeys();
    }

    /*
    private String setName() {
        if (fileName == null || fileName.isEmpty()) {
            return readFile(inputFromProperties);
        } else {
            return readFile(fileName);
        }
    }

     */

    private String readFile() throws IOException {
        StringBuilder builder = new StringBuilder();
        try (Reader reader = new java.io.FileReader(fileName)) {
            while (reader.ready()) {
                //разобраться в методе read попробовать порасуждать над ним
                //явное приведение к типу чар тк возвращает инт
                builder.append((char) reader.read());
                //String.valueOf()
            }
        }
        return builder.toString();
    }

    private void addKeys() throws IOException {
        //добавляем метод который считывает с файла в переменную text
        String text = readFile();
        //делим строку на переносы
        String[] arraysSplitFile = text.split("\r\n");
        for (String s : arraysSplitFile) {
            //делим элементы по знаку равенства "=",создаем массив строк arraySplitValues
            String[] arraySplitValues = s.split("=");
            String key = arraySplitValues[0];
            String value = arraySplitValues[1];
            //добавляем в map полученные значения
            mapFromProperties.put(key, value);
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
    }
    //два метода которые доступны пользователю
    //getInt
    //getString

    public int getInt(String name) {
        return Integer.parseInt(mapFromProperties.get(name));
    }

    //ненужен этот метод
    public String getString(String name) {
        return mapFromProperties.get(name);
    }

    @Override
    public String toString() {
        return mapFromProperties.toString();
    }
}
