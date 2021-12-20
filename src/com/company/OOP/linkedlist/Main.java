package com.company.OOP.linkedlist;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(123);
        linkedList.add(12);
        linkedList.add(33);
  //      System.out.println(linkedList.length());

        linkedList.add(2,5);
        linkedList.add(65,4);
        linkedList.add(34,0);
        linkedList.add(4);
        linkedList.add(-55);

        System.out.println(linkedList);
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.pop());
        System.out.println(linkedList);



        /*
        Node node0 = new Node();
        node0.setValue(5);
        Node node1 = new Node();
        node1.setValue(1);
        Node node2 = new Node();
        node2.setValue(3);
        node0.setNext(node1);
        node1.setNext(node2);
        System.out.println(node2.getNext());

         */

        //инкапсуляцую
        //новое значение для узла это новый узел
        //реализовать добавление узлов в LinkedList


        //вставить элемент на любую позицию
        // создать метод для вычисления длины Linkedlista

        //удалить элемент из линкеда


    }
}
