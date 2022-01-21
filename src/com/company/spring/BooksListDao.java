package com.company.spring;

import java.util.LinkedList;
import java.util.List;


public class BooksListDao implements BooksDao {
    public LinkedList<Books> books = new LinkedList();

    public BooksListDao() {
    }

    public void add(String name, String author) {
        this.books.add(new Books(name, author));
    }

    public List<Books> getBooks() {
        return this.books;
    }

    public void remove(String name) {
        this.books.removeIf((s) -> {
            return s.getName().equals(name);
        });
    }

    @Override
    public void getAllBooks() {
        System.out.println(this.books);
    }
}


