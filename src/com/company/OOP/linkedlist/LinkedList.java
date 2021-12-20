package com.company.OOP.linkedlist;

import java.io.FileNotFoundException;

public class LinkedList {
    // первый элемент ссылается на null
    private Node start = null;
    private int size = 0;

    public void add(int value) {
        Node newNode = new Node(value);
        size++;
        if (start == null) {
            start = newNode;
        } else {
            getLast().setNext(newNode);
            // last.setNext(newNode);
        }
    }

    public void add(int value, int position) throws IndexOutOfBoundsException {
        if (position > size) {
            throw new IndexOutOfBoundsException("Введенная позиция больше длины !");
        }

        Node node = new Node(value);
        size++;

        if (position == 0) {
            node.setNext(start);
            start = node;
            return;
        }
        Node current = start;
        int count = 0;
        while (current != null) {
            if (position - 1 == count) {
                break;
            }
            current = current.getNext();
            count++;
        }
        node.setNext(current.getNext());
        current.setNext(node);

    }


    public Node pop() throws IndexOutOfBoundsException {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Нет элементов для удаления !");
        }
        Node current = start;
        int count = 0;
        while (current != null) {
            if (count == size - 2) {
                break;
            }
            current = current.getNext();
            count++;
        }
        current.setNext(null);

        return current;
    }


    public Node pop(int position) throws IndexOutOfBoundsException {
        if (position > size) {
            throw new IndexOutOfBoundsException("Введенное значение больше длинны Листа");
        }
        if (position == 0){
            start = start.getNext();
        }
        Node current = start;
        int count = 0;
        while (current != null) {
            if (position - 1 == count) {
                break;
            }
            current = current.getNext();
            count++;
        }
        current.setNext(current.getNext().getNext());

        return current;
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

    public int getSize() {
        return size;
    }
}
