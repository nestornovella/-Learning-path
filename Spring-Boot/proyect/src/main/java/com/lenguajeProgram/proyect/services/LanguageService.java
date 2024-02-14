package com.lenguajeProgram.proyect.services;

import com.lenguajeProgram.proyect.models.Language;
import com.lenguajeProgram.proyect.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    private final LanguageRepository languageRepository;

    @Autowired
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public List<Language> getAllLanguages (){
        return this.languageRepository.findAll();
    }

    public Language createLanguage(Language language){
        return this.languageRepository.save(language);
    }


    public String deleteOne(Integer id){
        this.languageRepository.deleteById(id);
        return "eliminado";
    }

}
