package com.company.queue;

import java.io.IOException;
import java.util.Arrays;

public class QueueEmulator {
    private int countOfPeople = 0;
    private final double probabilityOfVisiting = new PropertiesReader().getDouble("probabilityOfVisiting");
    private final Terminal[] terminals = new Terminal[new PropertiesReader().getInt("terminal")];
    private final int timeValue = new PropertiesReader().getInt("deltaTime");
    private final int serviceTime = new PropertiesReader().getInt("serviceTime");

    public QueueEmulator() throws IOException {
    }

    private void addPeopleInLine() {
        if (Math.random() < probabilityOfVisiting) {
            countOfPeople++;
        }
        System.out.println(countOfPeople);
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

    private int getCurrentTime() {
        return (int)System.currentTimeMillis() / 1000;
    }
    private int getTimeWithDelta(int time, int delta) {
        int percent = (int) (Math.random() * (delta - (-delta))) + (-delta);

        return (int) (time + ((time / 100.0) * percent));

    }

    private void freeTerminal() throws IOException {
        for (int i = 0; i < terminals.length; i++) {
            if (terminals[i] != null) {
                if (getCurrentTime() - terminals[i].getTime() > getTimeWithDelta(timeValue, serviceTime)) {
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
