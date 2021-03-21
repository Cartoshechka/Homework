package com.homework.task29;

public class Book {
    private final String author;
    private final String title;
    private final String description;
    private final int publishYear;
    private final String genre;

    Book(String bookName, String bookAuthor, String description, int year, String genre) {
        this.author = bookAuthor;
        this.title = bookName;
        this.description = description;
        this.publishYear = year;
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publishYear=" + publishYear +
                ", genre='" + genre + '\'' +
                '}';
    }
}
