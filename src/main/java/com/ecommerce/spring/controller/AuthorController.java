package com.ecommerce.spring.controller;

import com.ecommerce.spring.model.Author;
import com.ecommerce.spring.model.FindForm;
import com.ecommerce.spring.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping(value = "/all")
    public List<Author> getAllAuthors() {
        return authorService.getAll();
    }

    @PostMapping
    public Author saveAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @GetMapping(value = "/all")
    public List<Author> findAllByTag(@RequestBody FindForm findForm) {
        return Optional.ofNullable(findForm.getPublisher())
                .map(publisher -> authorService.findAuthorsByPublisher(publisher))
                .orElse(authorService.findAuthorsByTag(findForm.getTag()));
    }
}
