package com.company.OOP.extennding.human.boxweight;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight(String name, double width, double length, double height, double weight) {
        super(name, width, length, height);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


    public void showInfo() {
        System.out.println(String.format(" Имя - %s \n ширина - %s \n длина - %s \n высота - %s \n %s  - вес", getName(), getWidth(), getLength(), getHeight(), getWeight()));
    }


}
