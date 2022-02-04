package com.company.queue;

import java.io.IOException;
import java.util.Arrays;

public class QueueEmulator {
    private int countOfPeople = 0;
    private  final PropertiesReader propertiesReader = new PropertiesReader();
    private final double probabilityOfVisiting = propertiesReader.getDouble("probabilityOfVisiting");
    private final Terminal[] terminals = new Terminal[propertiesReader.getInt("terminal")];
    private final int timeValue = propertiesReader.getInt("deltaTime");
    private final int serviceTime = propertiesReader.getInt("serviceTime");

    public QueueEmulator() throws IOException {

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
        return (int)System.currentTimeMillis() / 1000;
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
