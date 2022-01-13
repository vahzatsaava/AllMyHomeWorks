package com.company.OOP.extennding.human.figureinharitance;

public class Triangle extends Figure {
    private int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(int size, int c) {
        super(size);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public int findPerimetr() {
        return (getC() + getA() + getB()) / 2;
    }

    @Override
    public int area() {
        return (findPerimetr() - getA()) * (findPerimetr() - getB());
    }
}
