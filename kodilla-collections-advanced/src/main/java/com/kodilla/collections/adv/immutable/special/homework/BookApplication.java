package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager book1 = new BookManager();
        book1.createBook("tytuł", "autor");
        BookManager book2 = new BookManager();
        book2.createBook("tytuł", "autor");
        BookManager book3 = new BookManager();
        book3.createBook("bla", "bla");

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
    }
}