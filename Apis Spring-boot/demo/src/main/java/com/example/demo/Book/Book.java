package com.example.demo.Book;

import com.example.demo.Author.Author;
import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column
    private String name;
    @Column
    private String genre;

    @ManyToOne( fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "author_Id")
    private Author author;

    //constructors
    public Book() {
    }

    public Book(String name, String genre) {
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
