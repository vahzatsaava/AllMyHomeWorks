package com.company.serialazible;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person person = new Person("Dad",1);
        Person person1 = new Person("Fred",2);

        try (FileOutputStream fileOutputStream = new FileOutputStream("people.bin")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person);
            objectOutputStream.writeObject(person1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
