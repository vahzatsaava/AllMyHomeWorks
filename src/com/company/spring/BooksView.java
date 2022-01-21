package com.company.spring;

import java.util.Scanner;

public class BooksView {
    private static final BooksListDao bookSaver = new BooksListDao();

    public static void enterPosition() {
        while (bookSaver.booksLength() < 10) {

            System.out.println("Выберите позицию !");
            System.out.println("Добавить книгу - 1");
            System.out.println("Удалить книгу - 2");
            System.out.println("Показать имеющиеся книги - 3");
            String name = "";
            String author = "";
            Scanner scanner = new Scanner(System.in);
            int res = Integer.parseInt(scanner.next());
            switch (res) {
                case 1:
                    System.out.println("Введите пожалуйста книгу и автора !");
                    name = scanner.next();
                    author = scanner.next();
                    bookSaver.add(name, author);
                    System.out.println("Добавленная книга ");
                    System.out.println(bookSaver.showAddedBook(name, author));
                    break;
                    /*
                    System.out.println("Выберите дальшейшее действие !");
                    System.out.println("Добавить книгу - 1");
                    System.out.println("Удалить книгу - 2");
                    res = scanner.nextInt();
                    break;

                        switch (res) {
                            case 1:
                                System.out.println("Введите пожалуйста книгу и автора !");
                                name = scanner.next();
                                author = scanner.next();
                                bookSaver.add(name, author);
                                System.out.println("Добавленная книга ");
                                System.out.println(bookSaver.showAddedBook(name, author));

                            case 2:
                                System.out.println("Введите какую книгу или автора необходимо удалить !");
                                name = scanner.next();
                                bookSaver.remove(name);
                                System.out.println(bookSaver.getBooks());

                        }

                         */
                case 2:
                    System.out.println("Введите какую книгу или автора необходимо удалить !");
                    name = scanner.next();
                    bookSaver.remove(name);
                    break;
                    /*
                    System.out.println("Выберите дальшейшее действие !");
                    System.out.println("Добавить книгу - 1");
                    System.out.println("Удалить книгу - 2");


                switch (res) {
                    case 1:
                        System.out.println("Введите пожалуйста книгу и автора !");
                        bookSaver.add(scanner.next(), scanner.next());
                        System.out.println("Добавленная книга ");
                        System.out.println(bookSaver.getBooks());

                    case 2:
                        System.out.println("Введите какую книгу или автора необходимо удалить !");
                        bookSaver.remove(scanner.next());
                        System.out.println(bookSaver.getBooks());

                }

                 */
                case 3:
                    System.out.println("Вывести все книги на полку !");
                    bookSaver.getAllBooks();
                    break;
                default:
            }

            scanner.close();
        }
    }
}



