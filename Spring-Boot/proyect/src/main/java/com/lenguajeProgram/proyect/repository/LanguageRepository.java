package com.lenguajeProgram.proyect.repository;

import com.lenguajeProgram.proyect.models.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
