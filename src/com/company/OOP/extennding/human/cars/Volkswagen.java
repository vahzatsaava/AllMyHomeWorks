package com.company.OOP.extennding.human.cars;

public class Volkswagen extends Car {
    public Volkswagen(double weight, double speed, double enginePower, String color, String madeInLand) {
        super(weight, speed, enginePower, color, madeInLand);
    }
    public void doSalesBenefit(){
        System.out.println("Немецкое качество");
    }
    @Override
    public double maxPower() {
        return super.maxPower();
    }


}
