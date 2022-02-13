package com.company.threads;

public class MyThread extends Thread{
    Boolean aBoolean;

    public MyThread(Boolean bool){
        aBoolean = bool;
    }

    @Override
    public void run() {
            synchronized (aBoolean){
                if (aBoolean){
                    System.out.println("Выполняем работу инструментом");
                }

                System.out.println("Закончил работу");
            }

    }
}
