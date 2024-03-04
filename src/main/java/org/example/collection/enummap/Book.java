package org.example.collection.enummap;

public class Book {
    private int id;
    String name, author, publisher;
    private int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
