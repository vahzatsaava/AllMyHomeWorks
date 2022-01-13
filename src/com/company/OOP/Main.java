package com.company.OOP;



public class Main {
    public static void main(String[] args) {
        Car car = new Car(1200,"Audi");
        System.out.println(car.getColor());
        car.paintCar("Зеленый");
        System.out.println(car.getColor());
        Car car1 = new Car(1233,"Пежо");
        Car car2 = car.thirdCar(car1);
        car.paintCar("Yellow");
        Car car3 = car1.thirdCar(car2);
        System.out.println(car3);
        System.out.println(car.getColor());

    }
}
