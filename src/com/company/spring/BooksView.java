package com.company.spring;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BooksView {
    private static final BooksListDao bookSaver = new BooksListDao();

    public static void enterPosition() {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        while (true) {
            showPanel();
            String name = "";
            String author = "";
            int res = 0;
            try {
                res = scanner.nextInt();
            } catch (InputMismatchException i) {
                System.out.println("введите цифру !");
                break;
            }
            switch (res) {
                case 1:
                    System.out.println("Введите пожалуйста книгу и автора !");
                    name = scanner.next();
                    author = scanner.next();
                    bookSaver.add(name, author);
                    System.out.println("Добавленная книга ");
                    bookSaver.showLastElement();
                    break;
                case 2:
                    System.out.println("Введите какую книгу или автора необходимо удалить !");
                    name = scanner.next();
                    bookSaver.remove(name);
                    break;

                case 3:
                    System.out.println("Выйти из программы и вывести все книги на полку !");
                    bookSaver.getAllBooks();
                    a = -1;
                    break;
            }
            if (a == -1){
                break;
            }
        }

        scanner.close();

    }
    public static void showPanel() {
        System.out.println("Выберите позицию !");
        System.out.println("Добавить книгу - 1");
        System.out.println("Удалить книгу - 2");
        System.out.println("Выйти из программы и вывести все книги на полку - 3!");
    }


}



