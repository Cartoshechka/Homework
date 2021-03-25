package com.homework.task29;

public class Book {
    private final String name;
    private final Author author;
    private final String description;
    private final int publishYear;
    private final Genre genre;

    Book(String bookName, Author bookAuthor, String description, int year, Genre genre) {
        this.author = bookAuthor;
        this.name = bookName;
        this.description = description;
        this.publishYear = year;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", description='" + description + '\'' +
                ", publishYear=" + publishYear +
                ", genre=" + genre +
                '}';
    }
}
