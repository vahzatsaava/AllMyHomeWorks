package com.company.OOP.extennding.human;

public class main {
    public static void main(String[] args) {
        Driver driver = new Driver("Red", 10);
        Worker worker1 = driver;
        driver.drive();
        System.out.println(worker1.name);
        worker1.dous();
        Cooker cooker = new Cooker("fr", 30);
        Worker[] workers = {cooker, driver};
        for (Worker i : workers
        ) {
            i.dous();

        }
        driver = (Driver) worker1;

    }
}
