package com.ecommerce.spring.controller;

import com.ecommerce.spring.model.Author;
import com.ecommerce.spring.model.Book;
import com.ecommerce.spring.model.FindForm;
import com.ecommerce.spring.service.AuthorService;
import com.ecommerce.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/all")
    public List<Book> getAllAuthors() {
        return bookService.getAll();
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PostMapping(value = "/all")
    public List<Book> findAllByTagoOrPublisher(@RequestBody FindForm findForm) {
        return Optional.ofNullable(findForm.getPublisher())
                .map(publisher -> bookService.findAllByPublisher(publisher))
                .orElse(bookService.findAllByTag(findForm.getTag()));
    }
}
