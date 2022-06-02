package com.company.thread_learn.counter_thread;

public class Main {
    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 400 ; i++) {
                    counterThread.inc();
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500 ; i++) {
                    counterThread.dec();
                }

            }
        });
        try {
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("T " + counterThread.getX());
    }
}
