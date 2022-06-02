package com.company.future_callable;

import java.util.ArrayList;
import java.util.List;

public class DbPeople {
    private List<People> people = new ArrayList<>();


    public void add(String name, int age, String speciality) {
        people.add(new People(name, age, speciality));
    }
    public void remove(String name){
        people.removeIf(p -> p.getName().equals(name));
    }

    public List<People> getPeople() {
        return people;
    }



}
