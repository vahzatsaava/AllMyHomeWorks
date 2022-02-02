package com.company.queue;

import java.io.IOException;
import java.util.Arrays;

public class QueueEmulator {
    private int countOfPeople = 0;
    private final double pOfComing = new PropertiesReader().getDouble("pOfComing");
    private final Terminal[] terminals = new Terminal[new PropertiesReader().getInt("terminal")];

    public QueueEmulator() throws IOException {
    }


    private int addPeopleInLine() {
        if (Math.random() < pOfComing) {
            countOfPeople++;
        }
        return countOfPeople;
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
    private void freeTerminal() throws IOException {
        for (int i = 0; i < terminals.length; i++) {
            int timeValue = new PropertiesReader().getInt("deltaTime");
            int delta = new PropertiesReader().getInt("serviceTime");
            if (terminals[i] != null) {
                if (System.currentTimeMillis() / 1000 - terminals[i].getTime() > getTimeWithDelta(timeValue, delta)) {
                    terminals[i] = null;
                }
            }
        }
    }


    public void emulate() throws InterruptedException, IOException {
        System.out.println(Arrays.toString(terminals));
        while (true) {
            System.out.println(addPeopleInLine());
            takeTerminal();
            freeTerminal();
            System.out.println(Arrays.toString(terminals));
            Thread.sleep(1000);
        }

    }

    private int getTimeWithDelta(int time, int delta) {
        int percent = (int) (Math.random() * (delta - (-delta))) + (-delta);

        return (int) (time + ((time / 100.0) * percent));

    }


}
