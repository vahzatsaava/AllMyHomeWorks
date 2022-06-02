package com.company.thread_learn;

public class Test extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("hey hey ");
        }
    }
}
