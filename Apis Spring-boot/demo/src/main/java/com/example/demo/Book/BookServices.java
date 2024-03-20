package com.example.demo.Book;

import com.example.demo.Author.Author;
import com.example.demo.Author.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServices {
    private final BookRepository bookRepository;

    //constructor
    @Autowired
    public BookServices(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    //methods
    public List<Book> getAllBooks(){
        return this.bookRepository.findAll();

    }

    public void createBook(Book book){
        this.bookRepository.save(book);
    }
}
