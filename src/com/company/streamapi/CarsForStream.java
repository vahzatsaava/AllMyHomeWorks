package com.company.streamapi;

public class CarsForStream {
    private String model;
    private String numberOfCar;
    private String color;
    private int power;

    public CarsForStream(String model, String numberOfCar, String color, int power) {
        this.model = model;
        this.numberOfCar = numberOfCar;
        this.color = color;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return power + " " + color  + " " + model + " " + numberOfCar;
    }
    public static int compare (CarsForStream firstCar, CarsForStream secondCar){
        if(firstCar.getPower() > secondCar.getPower()) {
            return 1;
        }
        return -1;
    }
}
