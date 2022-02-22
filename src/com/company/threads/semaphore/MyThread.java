package com.company.threads.semaphore;

import java.util.concurrent.Semaphore;

public class MyThread extends Thread {
    int i;
    Semaphore semaphore;
    Car car;

    MyThread(int i, Semaphore semaphore, Car car){
        this.i = i;
        this.semaphore = semaphore;
        this.car = car;
    }

    @Override
    public void run() {


        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Свободных ресурсов - %d\n", semaphore.availablePermits());

        System.out.printf("Поток %d захватил ресурс\n", i);
        try {
            car.fu();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release();

        System.out.printf("Поток %d освободил ресурс\n", i);
    }
}
