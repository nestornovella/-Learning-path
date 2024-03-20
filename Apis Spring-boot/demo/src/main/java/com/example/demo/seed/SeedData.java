package com.example.demo.seed;

import com.example.demo.Author.Author;
import com.example.demo.Author.AuthorRepository;
import com.example.demo.Book.Book;
import com.example.demo.Book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class SeedData {
    private  AuthorRepository authorRepository;
    private  BookRepository bookRepository;


    public SeedData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public void GnerateData(){
        ArrayList<Author> listOfAuthors = new ArrayList<>();
        listOfAuthors.add(new Author("Nestor Novella", "terror"));
        listOfAuthors.add(new Author("Javier Castillo", "terror"));
        listOfAuthors.add(new Author("Nestor", "terror"));

        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Sementerio de Animales","terror"));
        listOfBooks.add(new Book("It (la cosa)", "terror"));
        listOfBooks.add(new Book("Fredy vs Json", "terror"));

        listOfAuthors.forEach(authors -> authorRepository.save(authors));
        listOfBooks.forEach(books -> bookRepository.save(books));
    }




}
