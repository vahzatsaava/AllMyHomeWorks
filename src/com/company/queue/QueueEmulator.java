package com.company.queue;

import java.util.Arrays;
import java.util.Random;

public class QueueEmulator {
    private int countOfPeople = 0;
    private double pOfComing = 0.5;
    Terminal[] terminals = new Terminal[6];

    public void emulate() throws InterruptedException {
        System.out.println(Arrays.toString(terminals));
        while (true) {
            if (Math.random() < pOfComing) {
                countOfPeople++;
            }
            System.out.println(countOfPeople);

            for (int i = 0; i < terminals.length; i++) {
                if (terminals[i] == null) {
                    if (countOfPeople > 0) {
                        countOfPeople--;
                        terminals[i] = new Terminal();
                    }
                }
            }
            for (int i = 0; i < terminals.length; i++) {
                int timeValue = 10;
                int delta = 50;
                if (terminals[i] != null) {
                    if (System.currentTimeMillis() / 1000 - terminals[i].getTime() > getTimeWithDelta(timeValue,delta)) {
                        terminals[i] = null;
                    }
                }
            }

            System.out.println(Arrays.toString(terminals));


            Thread.sleep(1000);
        }

    }
    private  int getTimeWithDelta(int time, int delta) {
        int percent = (int) (Math.random() * (delta - (-delta))) + (-delta);

        return (int) (time + ((time / 100.0) * percent));

    }



}
