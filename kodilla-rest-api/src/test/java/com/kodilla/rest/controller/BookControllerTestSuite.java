package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BookControllerTestSuite {

    BookService bookServiceMock = Mockito.mock(BookService.class);
    BookController bookController = new BookController(bookServiceMock);

    @Test
    public void shouldFetchBooks() {
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBooks() {
        //given
        BookDto book1 = new BookDto("First Title", "First Author");
        BookDto book2 = new BookDto("Second Title", "Second Author");
        //when
        bookController.addBook(book1);
        bookController.addBook(book2);
        //then
        Mockito.verify(bookServiceMock).addBook(book1);
        Mockito.verify(bookServiceMock).addBook(book2);
    }
}