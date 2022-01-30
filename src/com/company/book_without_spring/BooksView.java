package com.company.book_without_spring;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BooksView {
    private static final BooksListDao bookSaver = new BooksListDao();
    private static final Scanner scanner = new Scanner(System.in);

    public static void start() {
        while (true) {
            State state = enterPosition();
            if (state == State.INPUT_MISMATCH){
                System.out.println("Ошибка ввода значений !");
            }
            if (state == State.LOOP_BREAK_EXIT){
                break;
            }
        }
        scanner.close();
    }
    public static State enterPosition() {
        int res = 0;
        //int a = 1;
        //цикл имеен свое имя
        //loop:
        showPanel();
        String name = "";
        String author = "";
        try {if (scanner.hasNextInt()) {
            res = scanner.nextInt();
        }
        } catch (InputMismatchException i) {
            System.out.println("введите цифру !");
            // continue;//гонять пока не введет элемент
            return State.INPUT_MISMATCH;

        }
        switch (res) {
            case 1:
                System.out.println("Введите пожалуйста книгу и автора !");
                name = scanner.next();
                author = scanner.next();
                Book book = bookSaver.add(name, author);
                System.out.println(book + " созданная книга ");
                break;
            case 2:
                System.out.println("Введите какую книгу или автора необходимо удалить !");
                name = scanner.next();
                bookSaver.remove(name);
                break;

            case 3:
                System.out.println("Выйти из программы и вывести все книги на полку !");
                bookSaver.getAllBooks();
                // a = -1;
                return State.LOOP_BREAK_EXIT;
        }

        return State.CONTINUE;
    }

    private static void showPanel() {
        System.out.println("Выберите позицию !");
        System.out.println("Добавить книгу - 1");
        System.out.println("Удалить книгу - 2");
        System.out.println("Выйти из программы и вывести все книги на полку - 3!");
    }


}



