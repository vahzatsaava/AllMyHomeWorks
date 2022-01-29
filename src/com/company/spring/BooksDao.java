package com.company.spring;

public interface BooksDao {
    void getAllBooks();
    Book add(String name, String author);
}
