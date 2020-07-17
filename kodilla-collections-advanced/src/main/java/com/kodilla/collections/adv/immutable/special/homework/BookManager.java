package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        System.out.println("-----------------------------------------------------");
        List<Book> books = new ArrayList<>();
        books.add(book);
        Book anotherBook = new Book("bla", "bla");
        System.out.println("Dane książki: " + book.getTitle() + " " + book.getAuthor());
        for (Book newBook : books) {
            if (anotherBook.equals(book)) {
                System.out.println("The book you are tryinjg to add is already on the list");
            } else {
                System.out.println("The book you are trying to add is not on the list");
                return book;
            }
        }
    return null;
    }
}