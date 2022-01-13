package com.company.OOP.my_arraylist;

public class MyArrayList {
    private String[] myArrays = new String[10];
    private int size = 0;
    public void add(String s){
        myArrays[size] = s;
        size++;
        if (size == myArrays.length){
            String[] newStringArray = new String[myArrays.length * 2];
            for (int i = 0; i < myArrays.length; i++) {
                myArrays[i] = newStringArray[i];
            }
            myArrays = newStringArray;
        }
    }
    public void remove(int position){
        for (int i = position; i < size - 1; i++) {
            myArrays[i] = myArrays[i + 1];
        }
        size--;
    }
    public int getSize(){
        return size;
    }
    public String get(int index){
        return myArrays[index];
    }

}
