package com.ecommerce.spring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private long releaseYear;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="publisher_id")
    @JsonManagedReference
    private Publisher publisher = new Publisher();

    @ManyToMany(cascade = CascadeType.MERGE)
    @JsonManagedReference
    @JoinTable(name = "authors_books",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "authors_id", referencedColumnName = "id"))
    private List<Author> authors = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.MERGE)
    @JsonManagedReference
    @JoinTable(name = "books_tags",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tags_id", referencedColumnName = "id"))
    private List<Tag> tags = new ArrayList<>();

    public Book(String name, long releaseYear, Publisher publisher, List<Author> authors, List<Tag> tags) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.publisher = publisher;
        this.authors = authors;
        this.tags = tags;
    }
}
