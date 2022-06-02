package com.company.serialazible;

import java.io.Serializable;

public class Person implements Serializable {
    private final String name;
    private final int number;

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return getNumber() + " : " + getName();
    }
}
