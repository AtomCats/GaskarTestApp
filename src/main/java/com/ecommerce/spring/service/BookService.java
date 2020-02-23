package com.ecommerce.spring.service;

import com.ecommerce.spring.model.Book;
import com.ecommerce.spring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAll() {

        return  StreamSupport.stream(bookRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllByTag(String tagName) {
        return bookRepository.findAllByTags_Name(tagName);
    }

    public List<Book> findAllByPublisher(String publisherName) {
        return bookRepository.findAllByPublisher_Name(publisherName);
    }
}
