package com.company.OOP.extennding.human;

public class Cooker extends Worker {
    public Cooker(String name, int salary){
        super(name,salary);
    }
    public void cook(){
        System.out.println("Повар готовит");
    }

    @Override
    public void dous() {
        cook();
    }
}
