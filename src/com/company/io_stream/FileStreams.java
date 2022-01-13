package com.company.io_stream;

import java.io.*;
import java.util.Scanner;

public class FileStreams {
    public static void main(String[] args) throws IOException {
        try (FileWriter writer = new FileWriter("First.txt", false)) {
            writer.write("443");
            writer.write("Q");
        }

        String input = "C:\\Users\\123s\\Desktop\\scanTest.txt";
        try (BufferedReader readers = new BufferedReader(new FileReader(input))){

            while (readers.ready()) {
                String line = readers.readLine();
                System.out.println(line);
            }

        }




        //считать с Reader
        //относительный и абсолютный путь посмотреть (01:03);
        //обЪект тестирования выдает отчет
        // время теста,название теста, входные данные теста,результат(успешность выполнения этого теста)
    }
}
