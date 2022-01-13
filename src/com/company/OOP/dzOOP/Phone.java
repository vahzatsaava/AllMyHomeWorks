package com.company.OOP.dzOOP;

public class Phone {
    //а) Создайте класс Phone, который содержит переменные number, model и weight.
    int number;
    int weight;
    String model;

    //г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
    // Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов
    void receiveCall(String name) {
        System.out.println("Вам звонит " + name);
    }

    int getNumber() {
        return this.number;
    }

    //д) Добавить конструктор в класс Phone, который принимает на вход
// три параметра для инициализации переменных класса - number, model и weight.
    Phone(int number, String model, int weight) {
        this.number = number;
        this.weight = weight;
        this.model = model;
        //з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
        Phone phone = new Phone(221, "ss4");
    }

    //е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
    Phone(int number, String model) {
        this.model = model;
        this.number = number;
    }

    //ж) Добавить конструктор без параметров.
    Phone() {

    }

    //и) Добавьте перегруженный метод
    // receiveCall, который принимает два параметра - имя звонящего и номер телефона
    // звонящего. Вызвать этот метод.
    void receiveCall(String name, int number) {
        System.out.println(name + " " + number);
    }
//к) Создать метод sendMessage с аргументами переменной длины. Данный метод принимает
// на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    void sendMessage(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
