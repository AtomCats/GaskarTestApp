package com.ecommerce.spring.model;

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

    @ManyToOne
    @JoinColumn(name="publisher_id", nullable=false)
    private Publisher publisher;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "authors_books",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "authors_id", referencedColumnName = "id"))
    private List<Author> authors = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
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
