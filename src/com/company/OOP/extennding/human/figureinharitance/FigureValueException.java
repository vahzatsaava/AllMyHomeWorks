package com.company.OOP.extennding.human.figureinharitance;

public class FigureValueException extends NumberFormatException{
    FigureValueException(){
        super("Значение не может быть отрицательным в фигуре !");
    }
}
