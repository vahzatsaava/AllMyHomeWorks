package com.company.OOP.extennding.human;

public abstract class Worker extends Human{
    int salary;
    public Worker(String name,int salary){
        super(name);
        this.salary = salary;
    }
    public void dous (){
        System.out.println("Работник работает");
    }
}
