package com.company.OOP.extennding.human;

public class Driver extends Worker{
    public Driver(String name, int salary){
        super(name,salary);
    }
    public void drive(){
        System.out.println("Водитель ведет");
    }

    @Override
    public void dous() {
        drive();
    }
}
