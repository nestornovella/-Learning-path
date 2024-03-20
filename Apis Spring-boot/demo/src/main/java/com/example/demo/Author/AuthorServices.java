package com.example.demo.Author;

import com.example.demo.Book.Book;
import com.example.demo.Book.BookRepository;
import com.example.demo.seed.SeedData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AuthorServices {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    //constructor
    @Autowired
    public AuthorServices(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public List<Author> getAllAuthors(){
        return this.authorRepository.findAll();
    }

    //methods
    public List<Author> findAllAuthors(){
        return this.authorRepository.findAll();
    }

    public void createAnAuthor(Author author){
        this.authorRepository.save(author);
    }

    public void relationate(RelationateBookAuthor relationate){
        Optional<Book> book = bookRepository.findById(relationate.getBook_UUID());
        Optional<Author> author = authorRepository.findById(relationate.getAuthor_UUID());
        if(book.isPresent() && author.isPresent()){
//            book.ifPresent(book1 -> book1.setAuthor(author.get().));
            book.get().setAuthor(author.get());
            bookRepository.save(book.get());
        }else{
            System.out.println("no se encontro el autor");
        }
    }

    public String seedData(){
        SeedData seedDataClass = new SeedData(authorRepository, bookRepository);
        seedDataClass.GnerateData();
        return "generado con exito";
    }
}
