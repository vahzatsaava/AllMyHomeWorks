package com.company.OOP.extennding.human.boxweight;

public class Box {
    private  String name;
    private double width;
    private double length;
    private double height;

    public String getName() {
        return name;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getHeight(){
        return height;
    }

    Box(String name,double width,double length, double height) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void showInfo() {
        System.out.println(String.format(" Имя - %s \n ширина - %s \n длина - %s \n высота - %s", getName(),getWidth(),getLength(),getHeight()));
    }
}
