package com.lenguajeProgram.proyect.controllers;

import com.lenguajeProgram.proyect.models.Language;
import com.lenguajeProgram.proyect.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LanguageController {
    private final LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/languages")
    @CrossOrigin(origins = "*")
    public List<Language> getAllLanguages(){
        return languageService.getAllLanguages();
    }


    @PostMapping("/languages")
    @CrossOrigin(origins = "*")
    public Language createLanguage(@RequestBody Language language){
        return this.languageService.createLanguage(language);
    }

    @DeleteMapping("/languages/{id}")
    @CrossOrigin(origins = "*")
    public String deleteLanguage(@PathVariable Integer id){
        return this.languageService.deleteOne(id);
    }


}
