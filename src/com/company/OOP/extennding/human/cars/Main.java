package com.company.OOP.extennding.human.cars;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Volkswagen polo = new Volkswagen(1500, 200, 110, "Black", "Germany");
        Volkswagen jetta = new Volkswagen(1700, 230, 119, "Red", "Russia");
        Tesla modelS = new Tesla(2200, 280, 205, "Metal", "USA", 600);

        System.out.println(modelS.maxPower());
        System.out.println(jetta.maxPower());
        Car[] cars = {polo, jetta, modelS};
        modelS.useBattery();
        modelS.useTechnologies();
        jetta.setBenefit("sdfsdf");
        polo.setBenefit("ggdgdg");
        for (Car i : cars
        ) {
            //i.showInfo();
            i.showBenefit();

        }
        ArrayList<String> list = new ArrayList<>();
        //некоторые методы будут недоступны если будем исп List

    }
}
