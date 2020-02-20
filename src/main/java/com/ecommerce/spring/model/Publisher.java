package com.ecommerce.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(mappedBy = "book")
    @Transient
    private List<Book> books = new ArrayList<>();

    public Publisher(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public void setBooks(List<Book> books) {
        this.books.addAll(books);
    }
}
