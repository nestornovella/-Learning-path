package com.example.demo.Author;

import com.example.demo.Book.Book;
import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column
    private String name;
    @Column
    private String genre;
    @OneToMany(mappedBy = "author")
    private List<Book> bookList;

    //constructors
    public Author() {
    }

    public Author(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }


    //getters and setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
