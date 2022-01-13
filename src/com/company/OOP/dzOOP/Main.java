package com.company.OOP.dzOOP;

public class Main {
    public static void main(String[] args) {
        /*
        //б) Создайте три экземпляра этого класса.
        Phone nokia = new Phone();
        nokia.model = "2130";
        Phone iphone = new Phone();
        iphone.weight = 400;
        iphone.number = 3424;
        Phone samsung = new Phone();
        //в) Выведите на консоль значения их переменных.
        System.out.println(nokia.model +" "+ iphone.weight  );
        nokia.receiveCall("Виктор");
        iphone.receiveCall("Алла");
        System.out.println(iphone.getNumber());

         */
        Phone iphone = new Phone(23, "10x", 300 );
        Phone nokia = new Phone(1,"s30");
        Phone samsung = new Phone();
        System.out.println(iphone.getNumber() +" "+ iphone.model +" "+ iphone.weight);
        iphone.receiveCall("Petr");
        iphone.sendMessage(234234234,234234234,234234234,234234234,11111111);
    }

}
