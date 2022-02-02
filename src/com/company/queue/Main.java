package com.company.queue;


import java.io.IOException;
import java.util.HashMap;

public class Main {

    // предоставить возможность по заданному ключу доставать значения из файла
    public static void main(String[] args) {
        QueueEmulator queueEmulator = null;
        try {
            queueEmulator = new QueueEmulator();
        } catch (IOException i) {
            System.out.println("Ошибка ввода данных !");
        }

        try {
            queueEmulator.emulate();
        } catch (IOException  i) {
            System.out.println("Ошибка ввода данных !");
        }
        catch (InterruptedException i){
            System.out.println("Ошибка использования Thread !");
        }

    }
}
