package com.company.flyemulator;

public class Main {
    public static void main(String[] args) {
        Boolean flag = false;
        //System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            new Plain(flag).start();
        }
    }
}
