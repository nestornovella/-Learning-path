package com.example.demo.Author;

import java.util.UUID;

public class RelationateBookAuthor {
    private UUID book_UUID;
    private UUID author_UUID;

    public RelationateBookAuthor() {
    }

    public UUID getBook_UUID() {
        return book_UUID;
    }

    public void setBook_UUID(UUID book_UUID) {
        this.book_UUID = book_UUID;
    }

    public UUID getAuthor_UUID() {
        return author_UUID;
    }

    public void setAuthor_UUID(UUID author_UUID) {
        this.author_UUID = author_UUID;
    }
}
