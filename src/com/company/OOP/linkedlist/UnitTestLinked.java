package com.company.OOP.linkedlist;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.prefs.InvalidPreferencesFormatException;

public class UnitTestLinked {
    //nvidia - видеокарта дискретна
    // процессор i3 - i5
    //оперативкаа 16
    //512гб ssd


    public UnitTestLinked() {
        if (!testAdd()) {
            logToFile("testAdd",false);
            throw new IndexOutOfBoundsException("Значения не добавляются в исходный List");
        }else {
            logToFile("testAdd",true);
        }
        if (!testAddPositionInLast()) {
            logToFile("testAddPositionLast",false);
            throw new IndexOutOfBoundsException("Результат добавления Элемента в конец списка работает некорректно");
        }else {
            logToFile("testAddPositionLast",true);
        }
        if (!testAddPositionInStart()) {
            logToFile("testAddPositionLast",false);
            throw new IndexOutOfBoundsException("Результат добавления Элемента в начало не сработал");
        }else {
            logToFile("testAddPositionLast",true);
        }
        if (!testPop()) {
            logToFile("testPop",false);
            throw new IndexOutOfBoundsException("Результат удаления элемента не сработал!!");
        }else {
            logToFile("testPop",true);
        }
        if (!testPopInStartPosition()) {
            logToFile("testPopInStartPosition",false);
            throw new IndexOutOfBoundsException("Результат удаления первого элемента не сработал!");
        }else {
            logToFile("testPopInStartPosition",true);
        }



    }
    private void logToFile(String name,boolean result){
        Date date = new Date();
        try(FileWriter writer = new FileWriter("LinkedTest.txt",true)) {
            writer.write("Название теста;" + name + " Date;" + date + "- Результат;" + result + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private boolean testAdd() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(1);
        return linkedList.getSize() == linkedList1.getSize() && linkedList.getStart().getValue() == linkedList1.getStart().getValue();
    }

    private boolean testAddPositionInLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3, 2);
        return linkedList.getLast().getValue() == linkedList1.getLast().getValue() && linkedList.getSize() == linkedList1.getSize();
    }

    private boolean testAddPositionInStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(1, 0);
        return linkedList.getStart().getValue() == linkedList1.getStart().getValue() && linkedList.getSize() == linkedList1.getSize();

    }

    private boolean testPop() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.pop();

        //Сравниваем удаленный элемент с последаним (равны ли они) и сравниваем длину двух листов
        //как сравнить два линкеда ???
        return linkedList.getLast().getValue() == linkedList1.getLast().getValue() && linkedList.getSize() == linkedList1.getSize();
    }

    private boolean testPopInStartPosition() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(4);
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.pop(0);

        return linkedList.getStart().getValue() == linkedList1.getStart().getValue() && linkedList.getSize() == linkedList1.getSize();
    }


}
