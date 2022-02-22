package com.company.threads.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(4, true);
        Car car = new Car();

        for (int i = 0; i < 10; i++){
            new MyThread(i, semaphore, car).start();
        }
    }
}
