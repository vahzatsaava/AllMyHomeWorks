package com.company.book_without_spring;

import java.util.LinkedList;
import java.util.List;


public class BooksListDao implements BooksDao {
    private LinkedList<Book> books = new LinkedList();

    public List<Book> getBooks() {
        return this.books;
    }

    public void remove(String name) {
        this.books.removeIf((s) -> s.getName().equals(name));
    }
    public void showLastElement(){
        System.out.println(books.getLast());
    }

    public int booksLength(){
        return books.size();
    }
    @Override
    public void getAllBooks() {
        System.out.println(this.books);
    }

    @Override
    public Book add(String name, String author) {
        Book book = new Book(name, author);
        this.books.add(book);
        return book;
    }

}


