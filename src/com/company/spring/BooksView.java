package com.company.spring;

import java.util.Scanner;

public class BooksView {
        public static void enterPosition() {
            Scanner scanner;
            System.out.println("Выберите позицию !");
            System.out.println("Добавить книгу - 1");
            System.out.println("Удалить книгу - 2");
            System.out.println("Показать имеющиеся книги - 3");
            BooksListDao listDao = new BooksListDao();
            scanner = new Scanner(System.in);
            int res;
            switch(scanner.nextInt()) {
                case 1:
                    System.out.println("Введите пожалуйста книгу и автора !");
                    listDao.add(scanner.next(), scanner.next());
                    System.out.println("Добавленная книга ");
                    System.out.println(listDao.getBooks());
                    System.out.println("Выберите дальшейшее действие !");
                    System.out.println("Добавить книгу - 1");
                    System.out.println("Удалить книгу - 2");
                    res = Integer.parseInt(scanner.next());
                    switch(res) {
                        case 1:
                            System.out.println("Введите пожалуйста книгу и автора !");
                            listDao.add(scanner.next(), scanner.next());
                            System.out.println("Добавленная книга ");
                            System.out.println(listDao.getBooks());
                            break;
                        case 2:
                            System.out.println("Введите какую книгу или автора необходимо удалить !");
                            listDao.remove(scanner.next());
                            System.out.println(listDao.getBooks());
                        default:
                            break ;
                    }
                case 2:
                    System.out.println("Введите какую книгу или автора необходимо удалить !");
                    listDao.remove(scanner.next());
                    System.out.println("Выберите дальшейшее действие !");
                    System.out.println("Добавить книгу - 1");
                    System.out.println("Удалить книгу - 2");
                    res = Integer.parseInt(scanner.next());
                    switch(res) {
                        case 1:
                            System.out.println("Введите пожалуйста книгу и автора !");
                            listDao.add(scanner.next(), scanner.next());
                            System.out.println("Добавленная книга ");
                            System.out.println(listDao.getBooks());
                            break ;
                        case 2:
                            System.out.println("Введите какую книгу или автора необходимо удалить !");
                            listDao.remove(scanner.next());
                            System.out.println(listDao.getBooks());
                        default:
                            break ;
                    }
                case 3:
                    System.out.println("Вывести все книги на полку !");
                    (new BooksListDao()).getBooks();
            }

            scanner.close();
        }
    }

