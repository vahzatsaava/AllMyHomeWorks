package com.company.spring;

import java.util.LinkedList;
import java.util.List;


public class BooksListDao implements BooksDao {
    public LinkedList<Book> books = new LinkedList();

    public List<Book> getBooks() {
        return this.books;
    }

    public void remove(String name) {
        this.books.removeIf((s) -> {
            return s.getName().equals(name);
        });
    }
    public Book showAddedBook(String name, String author){

        return new Book(name, author);
    }
    public int booksLength(){
        return books.size();
    }
    @Override
    public void getAllBooks() {
        System.out.println(this.books);
    }

    @Override
    public void add(String name, String author) {
        this.books.add(new Book(name, author));
    }
}


