package com.company.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Boolean b = true;
        boolean flag = false;

        for (int i = 0; i < 100000; i++){
            new MyThread(b).start();
        }



        synchronized (b){

        }
    }
}
