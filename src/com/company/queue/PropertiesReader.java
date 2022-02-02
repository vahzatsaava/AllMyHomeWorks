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


    private String readFile() throws IOException {
        StringBuilder builder = new StringBuilder();
        try (Reader reader = new java.io.FileReader(fileName)) {
            while (reader.ready()) {
                builder.append((char) reader.read());
            }
        }
        return builder.toString();
    }

    private void addKeys() throws IOException {
        String text = readFile();
        String[] arraysSplitFile = text.split("\r\n");
        for (String s : arraysSplitFile) {
            String[] arraySplitValues = s.split("=");
            String key = arraySplitValues[0];
            String value = arraySplitValues[1];
            mapFromProperties.put(key, value);
        }

    }


    public int getInt(String name) {
        return Integer.parseInt(mapFromProperties.get(name));
    }

    public double getDouble(String name) {
        return Double.parseDouble(mapFromProperties.get(name));
    }

    public String getString(String name) {
        return mapFromProperties.get(name);
    }

    @Override
    public String toString() {
        return mapFromProperties.toString();
    }
}
