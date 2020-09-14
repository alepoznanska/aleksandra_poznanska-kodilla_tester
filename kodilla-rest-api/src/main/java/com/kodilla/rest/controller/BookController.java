package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookservice;

    public BookController(BookService bookService) {
        this.bookservice = bookService;
    }
    
    @GetMapping
    public List<BookDto> getBooks() {
        return bookservice.getBooks();
    }

    @PostMapping
    public void addBook(@RequestBody BookDto bookDto) {
        bookservice.addBook(bookDto);
    }

    @DeleteMapping
    public void removeBook(@RequestBody BookDto bookDto) {
        bookservice.removeBook(bookDto);
    }
}
