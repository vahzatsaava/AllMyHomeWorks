package com.company.book_without_spring;

public interface BooksDao {
    void getAllBooks();
    Book add(String name, String author);
}
