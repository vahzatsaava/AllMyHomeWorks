package com.company.OOP.linkedlist;

public class LinkedList {
    // первый элемент ссылается на null
    Node start = null;
    private  int size = 0;

    public void add(int value) {
        Node newNode = new Node(value);
        if (start == null) {
            start = newNode;
        } else {
            getLast().setNext(newNode);
            // last.setNext(newNode);
        }

    }

    public void add(int value, int position) {

    }

    // первый метод нахождения длины нашего списка
    // колличество ссылок которые не равны null ищем их и прибавляем size++
    // current = current.getNext(); меняем текущую ссылку
    //возвращаем size + 1,тк последняя ссылка всегда будет (null)
    /*
    public int length() {
        Node current = start;
        while (current.getNext() != null) {
            size++;
            current = current.getNext();
        }
        return size + 1;
    }

     */


    public int length() {
        Node current = start;
        while (current != null){
        size++;
        current = current.getNext();
        }

        return size;
    }




    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = start;
        //пока последний элемент не равен (null)
        while (current != null) {
            builder.append(current.getValue() + " ");
            current = current.getNext();
        }
        return builder.toString();
    }

    public Node getLast() {
        Node current = start;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }
}
