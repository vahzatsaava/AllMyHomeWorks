package com.company.arrays.codewarslevel7;

public class GreetMe {
    //Напишите метод, который принимает в качестве имени один аргумент,
    // а затем приветствует это имя с заглавной буквы и заканчивается восклицательным знаком.
    public static String greet(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                stringBuilder.append(Character.toString(name.charAt(i)).toUpperCase());
            } else {
                stringBuilder.append(name.charAt(i));
            }
        }
        return "Hello" + " " + stringBuilder.toString() + "!";
    }


    public static void main(String[] args) {
        System.out.println(greet("GerTruDA"));
    }
}
