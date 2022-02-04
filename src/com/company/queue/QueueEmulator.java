package com.company.queue;

import java.io.IOException;
import java.util.Arrays;

public class QueueEmulator {
    private int countOfPeople = 0;
    private final PropertiesReader propertiesReader;
    private final double probabilityOfVisiting;
    private final Terminal[] terminals;
    private final int timeValue;
    private final int serviceTime;

    public QueueEmulator() {
        try {
            propertiesReader = new PropertiesReader();
        } catch (IOException e) {
            throw new PropertiesReadingException(e);
        }
        try {
            probabilityOfVisiting = propertiesReader.getDouble("probabilityOfVisiting");
            terminals = new Terminal[propertiesReader.getInt("terminal")];
            timeValue = propertiesReader.getInt("deltaTime");
            serviceTime = propertiesReader.getInt("serviceTime");
        } catch (NullPointerException | NumberFormatException n) {
            //найти как чтобы выбрасывал ключ в сообщении
            //либо самому прокинуть и засунуть в это исключение
            throw new PropertyNotFoundException(n.getMessage());
        }
        //Логика работы светофора

    }

    private void addPeopleInLine() {
        if (Math.random() < probabilityOfVisiting) {
            countOfPeople++;
        }
    }

    private void takeTerminal() {
        for (int i = 0; i < terminals.length; i++) {
            if (terminals[i] == null) {
                if (countOfPeople > 0) {
                    countOfPeople--;
                    terminals[i] = new Terminal();
                }
            }
        }
    }

    private int getCurrentTimeInSeconds() {
        return (int) System.currentTimeMillis() / 1000;
    }

    private int getTimeWithDelta(int time, int delta) {
        int percent = (int) (Math.random() * (delta - (-delta))) + (-delta);

        return (int) (time + ((time / 100.0) * percent));

    }

    private void freeTerminal() throws IOException {
        for (int i = 0; i < terminals.length; i++) {
            if (terminals[i] != null) {
                if (getCurrentTimeInSeconds() - terminals[i].getTime() > getTimeWithDelta(timeValue, serviceTime)) {
                    terminals[i] = null;
                }
            }
        }
    }

    public void emulate() throws InterruptedException, IOException {
        System.out.println(Arrays.toString(terminals));
        while (true) {
            addPeopleInLine();
            takeTerminal();
            freeTerminal();
            System.out.println(Arrays.toString(terminals));
            Thread.sleep(1000);
        }

    }


}
