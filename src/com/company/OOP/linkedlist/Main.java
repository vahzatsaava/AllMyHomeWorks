package com.company.OOP.linkedlist;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    private static boolean test(LinkedList linkedList, LinkedList linkedList1) {

        return linkedList.getSize() == linkedList1.getSize();
    }

    public static void main(String[] args) {
        new UnitTestLinked();
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(123);
        linkedList.add(12);
        linkedList.add(33);
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(5);
        linkedList1.add(6);
        linkedList1.add(123);
        linkedList1.add(12);
        linkedList1.add(33);
        linkedList1.add(12);
        linkedList1.pop();
        boolean isSim = test(linkedList,linkedList1);
        linkedList.pop(0);
        linkedList1.pop(0);
        linkedList.pop();
        linkedList1.pop(1);
        System.out.println(linkedList);
        System.out.println(linkedList1);
        System.out.println(linkedList.getSize());
        System.out.println(linkedList1.getSize());





/*
        Node node0 = new Node(1);
        node0.setValue(5);
        Node node1 = new Node(2);
        node1.setValue(1);
        Node node2 = new Node(4);
        node2.setValue(3);
        node0.setNext(node1);
        node1.setNext(node2);
        System.out.println(node1.getNext());

 */


        //инкапсуляцую
        //новое значение для узла это новый узел
        //реализовать добавление узлов в LinkedList


        //вставить элемент на любую позицию
        // создать метод для вычисления длины Linkedlista

        //удалить элемент из линкеда


    }
}
