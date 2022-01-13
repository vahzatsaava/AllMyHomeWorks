package com.company.OOP.my_arraylist;

public class Main {


    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Jerry");
        myArrayList.add("Tom");
        myArrayList.add("Garry");
        System.out.println(myArrayList.getSize());
        myArrayList.remove(0);


        for (int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}
