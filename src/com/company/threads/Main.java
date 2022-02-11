package com.company.threads;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("1");
        Thread thread2 = new MyThread("2");

        Thread runThread = new Thread(new Runnab());

        thread1.start();
        thread2.start();
    }
}
