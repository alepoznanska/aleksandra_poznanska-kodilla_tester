package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    List<Book> books = new ArrayList<>();

    public Book createBook(String title, String author) {
        return new Book(title, author);
    }

    public List<Book> createBookList(Book book) {
        if(!books.contains(book)){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ": this book is not on the list yet, let's add it!");
            books.add(book);} else {
            System.out.println("This book is already on the list, cannot add it");
        }
        return books;
    }
}