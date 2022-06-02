package com.company.serialazible;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fileOutputStream = new FileInputStream("people.bin")){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();
            System.out.println(person1);
            System.out.println(person2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
