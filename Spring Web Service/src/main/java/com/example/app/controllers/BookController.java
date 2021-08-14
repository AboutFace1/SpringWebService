package com.example.app.controllers;

import com.example.app.entities.Book;
import com.example.app.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> books() {
        return bookService.getAll();
    }

    @PostMapping("/books")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void createBook(@RequestBody Book book) {
        bookService.save(book);
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") Long id) {
        return bookService.getBook(id);
    }
}
