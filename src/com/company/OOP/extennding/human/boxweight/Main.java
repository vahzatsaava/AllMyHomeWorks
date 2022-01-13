package com.company.OOP.extennding.human.boxweight;

public class Main {
    public static void main(String[] args) {
    BoxWeight boxWeight = new BoxWeight("Triangle",3.2,4.4,5.0,1.1);
    boxWeight.showInfo();
        System.out.println();
    Box box = new Box("Qube",4.5,10.3,10);
    box.showInfo();
    }
}
