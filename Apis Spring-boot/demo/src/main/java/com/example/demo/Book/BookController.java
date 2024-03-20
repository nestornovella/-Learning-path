package com.example.demo.Book;

import com.example.demo.Author.Author;
import com.example.demo.Author.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/book")
public class BookController {

    private final BookServices bookServices;

    //constructor
    @Autowired
    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @GetMapping
    public List<Book> getAllAuthors(){
        return this.bookServices.getAllBooks();
    }

    @PostMapping
    public void createBook(@RequestBody Book book){
        this.bookServices.createBook(book);
    }

}
