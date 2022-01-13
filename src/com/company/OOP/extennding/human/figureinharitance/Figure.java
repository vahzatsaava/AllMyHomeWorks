package com.company.OOP.extennding.human.figureinharitance;

public abstract class Figure {
    private int a;
    private int b;

    public Figure(int a, int b) throws FigureValueException {
        if (validate(a, b)) {
            this.a = a;
            this.b = b;
        } else {
            throw new FigureValueException();
        }
    }

    public Figure(int size) throws FigureValueException {
        if (validate(size)) {
            this.a = size;
            this.b = size;
        } else {
            throw new FigureValueException();
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int area() {
        return 0;
    }

    public boolean validate(int a, int b) {
        if (a <= 0 || b <= 0) {
            return false;
        } else {
            return true;
        }
    }
    public final int pi (){
        return 0;
    }
    public boolean validate(int size) {
        return size > 0;
    }
}
