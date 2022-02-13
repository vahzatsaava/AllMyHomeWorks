package com.company.threads;

public class Main {
    public static void main(String[] args) {
        Boolean flag = false;
        Thread thread1 = new MyThread(flag);
        Thread thread2 = new MyThread(flag);
        Thread runThread = new Thread(new Runnab());

        thread1.start();
        thread2.start();
    }
}
