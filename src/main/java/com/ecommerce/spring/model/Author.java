package com.ecommerce.spring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String surname;

    private String middleName;

    private Date birthDate;

    @ManyToMany(mappedBy = "authors")
    @JsonBackReference
    private List<Book> books = new ArrayList<>();

    public Author(String name, String surname, String middleName, Date birthDate, List<Book> books) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.books = books;
    }

    public Author(String name, String surname, String middleName, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }
}
