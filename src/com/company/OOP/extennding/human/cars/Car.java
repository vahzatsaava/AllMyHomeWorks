package com.company.OOP.extennding.human.cars;

public abstract class Car {
    private double weight;
    private double speed;
    private String color;
    private double enginePower;
    private String madeInLand;
    private String benefit;

    public Car(double weight, double speed, double enginePower, String color, String madeInLand) {
        this.weight = weight;
        this.speed = speed;
        this.enginePower = enginePower;
        this.color = color;
        this.madeInLand = madeInLand;
        this.benefit = "Средство передвижения";
    }

    public double maxPower() {
        return (weight * speed) / enginePower;
    }

    public void showInfo() {
        System.out.println(weight + " " + speed + " " + color + " " + enginePower + " " + madeInLand);
    }

    //Спросить Александра как сделать так чтобы объект класса обязательно вызвал метод ?????
    public void showBenefit() {
        System.out.println(benefit);
    }
    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

}
