package com.ecommerce.spring.repository;

import com.ecommerce.spring.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
    List<Author> findAuthorsByBooks_Tags_Name(String tagName);
    List<Author> findAuthorsByBooks_Publisher_Name(String publisherName);

}
