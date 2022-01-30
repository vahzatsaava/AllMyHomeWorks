package com.company.spring;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BooksView {
    private static final BooksListDao bookSaver = new BooksListDao();

    /*
        public static void repeatInput() {
            while (true) {
                //вызов панели информации для пользователя
                showPanel();
                int result = enterPosition();
                if (result == 3) {
                    break;
                }
            }
        }

        public static int enterPosition() {
            Scanner scanner = new Scanner(System.in);
            //название книга
            String name = "";
            //имя автора
            String author = "";
            //цифровое значение вводимое пользователем
            int res = 0;
            try {
                res = scanner.nextInt();
            } catch (InputMismatchException i) {
                System.out.println("Введите цифру !");
            }
            switch (res) {
                case 1:
                    System.out.println("Введите пожалуйста книгу и автора !");
                    name = scanner.next();
                    author = scanner.next();
                    bookSaver.add(name, author);
                    return 1;
                case 2:
                    System.out.println("Введите какую книгу или автора необходимо удалить !");
                    name = scanner.next();
                    bookSaver.remove(name);
                    return 2;
                case 3:
                    System.out.println("Выйти из программы и вывести все книги на полку !");
                    bookSaver.getAllBooks();
                    return 3;
            }
            scanner.close();
            return 0;
        }

     */
    public static void start() {
        while (true) {
            State state = enterPosition();
            if (state == State.INPUT_MISMATCH){
                System.out.println("Ошибка");
            }
            if (state == State.LoopBreakExit){
                break;
            }
//            if (bookEnum.equals(BreakBook.InputMismatch)){
//                System.out.println(" null");
//            }
//            else if (bookEnum.equals(BreakBook.LoopBreakExit)){
//                break;
//            }
        }
    }

    static Scanner scanner = new Scanner(System.in);

    public static State enterPosition() {

        //int a = 1;
        //цикл имеен свое имя
        //loop:
        showPanel();
        String name = "";
        String author = "";
        int res = 0;
        try {

            res = scanner.nextInt();
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
                return State.LoopBreakExit ;
        }
//            if (a == -1){
//                break;
//            }



        return State.CONTINUE;
    }

    private static void showPanel() {
        System.out.println("Выберите позицию !");
        System.out.println("Добавить книгу - 1");
        System.out.println("Удалить книгу - 2");
        System.out.println("Выйти из программы и вывести все книги на полку - 3!");
    }


}



