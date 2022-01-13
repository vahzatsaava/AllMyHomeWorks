package com.company.OOP.extennding.human.figureinharitance;

public class Rect extends Figure {

    public Rect(int a, int b) {
        super(a, b);
    }

    public Rect(int size) {
        super(size);
    }


    @Override
    public boolean validate(int a, int b) {
        return super.validate(a, b);
    }

    @Override
    public int area() {
        return getA() * getB();
    }


}
