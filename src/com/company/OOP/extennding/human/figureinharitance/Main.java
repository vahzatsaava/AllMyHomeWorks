package com.company.OOP.extennding.human.figureinharitance;

public class Main {
    public static void main(String[] args) {
        try {
            Rect rect = new Rect(3, 4);
            System.out.println(rect);
        } catch (FigureValueException e) {
            System.out.println("Side cannot be negative!");
        }
        try {
            Triangle triangle = new Triangle(-2, 4, 6);
            System.out.println(triangle);
        }catch (FigureValueException e){
            System.out.println("Side cannot be negative!");
        }

        Rect rect1 = new Rect(5);
        Triangle triangle1 = new Triangle(3, 8);

        System.out.println(rect1.area());
        System.out.println(triangle1.area());
    }
}
