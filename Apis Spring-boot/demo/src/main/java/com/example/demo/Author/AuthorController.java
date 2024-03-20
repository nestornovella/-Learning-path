package com.example.demo.Author;

import com.example.demo.seed.SeedData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    private final AuthorServices authorServices;

    //constructor
    @Autowired
    public AuthorController(AuthorServices authorServices) {
        this.authorServices = authorServices;
    }

    @GetMapping
    public List<Author> getAllAuthors(){
        return this.authorServices.getAllAuthors();
    }

    @PostMapping
    public void createAnAuthor(@RequestBody Author author){
        this.authorServices.createAnAuthor(author);
    }

    @PostMapping("/relationate")
    public void relationateBook(@RequestBody RelationateBookAuthor relationate){
        this.authorServices.relationate(relationate);
    }

    @PostMapping("/seeds")
    public String seedData(){
        return this.authorServices.seedData();
    }


}
