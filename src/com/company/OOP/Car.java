package com.company.OOP;

public class Car {
    private int weight;
    private String color = "Methalic";
    private String model;

    public int getWeight(){
        return weight;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
    public Car(int weight, String model){

        this.weight = weight;
        this.model = model;
    }
    public void paintCar(String color){
        this.color = color;
    }

    Car thirdCar (Car car2){
        int weight;
        weight = this.weight + car2.weight;
        String model = this.model + car2.model;
        Car car = new Car(weight, model);
        return car;
    }

}
