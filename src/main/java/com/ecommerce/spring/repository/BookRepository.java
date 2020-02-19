package com.ecommerce.spring.repository;

import com.ecommerce.spring.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAllByTags_Name(String tagName);
    List<Book> finAllByPublisher_Name(String publisherName);
}
