package com.company.future_callable;

public class People {
    private String name;
    private int age;
    private String speciality;

    public People(String name, int age, String speciality) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public  int getAge() {
        return age;
    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
