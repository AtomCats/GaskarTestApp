package com.ecommerce.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToMany(mappedBy = "tags")
    @Transient
    List<Book> books = new ArrayList<>();

    public Tag(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }
}
