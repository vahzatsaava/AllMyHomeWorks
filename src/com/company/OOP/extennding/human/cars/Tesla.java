package com.company.OOP.extennding.human.cars;

public class Tesla extends Car implements Greenable{
    private double engineCapacity;

    public Tesla(double weight, double speed, double enginePower, String color, String madeInLand, double engineCapacity) {
        super(weight, speed, enginePower, color, madeInLand);
        this.engineCapacity = engineCapacity;
    }

    public void doSalesBenefit() {
        System.out.println("Экологичный транспорт");
    }

    @Override
    public double maxPower() {
        return super.maxPower() * engineCapacity;
    }

    @Override
    public void showBenefit() {
        doSalesBenefit();
    }

    @Override
    public void useBattery() {
        System.out.println("Используется батарея + комплект для зарядки");
    }

    @Override
    public void useTechnologies() {
        System.out.println("Голосовой помощник и автопилот");
    }
}
