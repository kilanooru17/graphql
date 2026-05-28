package com.graphql.demo;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {
    private final Map<String, Book> books = new HashMap<>();

    public BookService() {
        // Sample data
        books.put("1", new Book("1", "Spring in Action", "Craig Walls"));
        books.put("2", new Book("2", "GraphQL for Java", "John Doe"));
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(String id) {
        return books.get(id);
    }

    public Book addBook(String title, String author) {
        String id = UUID.randomUUID().toString();
        Book book = new Book(id, title, author);
        books.put(id, book);
        return book;
    }
}
