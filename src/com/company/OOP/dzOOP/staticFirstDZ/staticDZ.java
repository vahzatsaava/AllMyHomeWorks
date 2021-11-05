package com.company.OOP.dzOOP.staticFirstDZ;

public class staticDZ {
    //Нужно сделать так чтобы объекты класса нумеровались автоматически без использования нас
    //при этом id не должны повторяться

    //    Book b1 = new Book();
//    sout(b1.getId()); // 1;
//    Book b2 = new Book():
//    sout(b2.getId()); // 2
//}
    public static void main(String[] args) {
        Books books = new Books();
        Books books1 = new Books();
        Books books2 = new Books();
        Books books3 = new Books();
        System.out.println(books.getId());
        System.out.println(books1.getId());
        System.out.println(books2.getId());
        System.out.println(books3.getId());
        System.out.println(books.getId());





    }
}
