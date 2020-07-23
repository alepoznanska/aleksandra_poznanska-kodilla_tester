package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {
        BookManager createBook = new BookManager();
        List<Book> books = new ArrayList<>();
        books.add(createBook.createBook("Harry Potter And The Sorcerer's Stone", "J.K.Rowling"));
        books.add(createBook.createBook("Harry Potter And The Sorcerer's Stone", "J.K.Rowling"));
        books.add(createBook.createBook("Harry Potter And The Sorcerer's Stone", "J.K.Rowling"));
        books.add(createBook.createBook("Harry Potter And The Prisoner of Azkaban", "J.K.Rowling"));

        for (Book book : books) {
            createBook.createBookList(book);
        }
        System.out.println(createBook.books.size());
    }
}