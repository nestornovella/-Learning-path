package com.lenguajeProgram.proyect.models;

import jakarta.persistence.*;

@Entity
@Table
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(unique = true)
    String name;

    Integer users;


    String description;

    public Language() {
    }

    public Language(Integer id, String name, Integer users, String description) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.description = description;
    }

    public Language(String name, Integer users, String description) {
        this.name = name;
        this.users = users;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUsers() {
        return users;
    }

    public void setUsers(Integer users) {
        this.users = users;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
