package com.ecommerce.spring.service;

import com.ecommerce.spring.model.Author;
import com.ecommerce.spring.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAll() {

        return  StreamSupport.stream(authorRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> findAuthorsByTag(String tagName) {
        return authorRepository.findAuthorsByBooks_Tags_Name(tagName);
    }

    public List<Author> findAuthorsByPublisher(String publisherName) {
        return authorRepository.findAuthorsByBooks_Publisher_Name(publisherName);
    }
}
