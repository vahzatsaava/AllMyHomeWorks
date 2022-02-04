package com.company.queue;


import java.io.IOException;
import java.util.HashMap;

public class Main {

    // предоставить возможность по заданному ключу доставать значения из файла
    public static void main(String[] args)  {

        QueueEmulator queueEmulator = new QueueEmulator();
        try {
            queueEmulator.emulate();
        }catch (InterruptedException | IOException i){
            System.out.println("ZzzzZZzz");
        }

    }
}

