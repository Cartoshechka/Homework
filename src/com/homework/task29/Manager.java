package com.homework.task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Manager {
    static BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    private static final ArrayList<Book> books = new ArrayList<Book>();
    private static final ArrayList<Genre> genres = new ArrayList<Genre>();
    private static final ArrayList<Author> authors = new ArrayList<Author>();


    static void addBook() throws IOException {
        System.out.println("Print books name");
        String name = bR.readLine();

        System.out.println("Choose books author");
        getAuthors();
        System.out.println("Print author number (1 or 2 etc.)");
        Integer author = Integer.parseInt(bR.readLine());
        Author author1 = authors.get(author);

        System.out.println("Print books description");
        String description = bR.readLine();

        System.out.println("Print books year");
        int year = 0;
        try {
            year = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            System.out.println("Print books year in numbs (like 123)");
        }
        System.out.println("Choose books genre");
        getGenres();
        System.out.println("Print genre number (1 or 2 etc.)");
        Integer genre = null;
        try {
            genre = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            System.out.println("Print author number (1 or 2 etc.)");
            System.out.println("Try again");
            genre = Integer.parseInt(bR.readLine());
        }

        Genre genre1 = genres.get(genre);

        Book book = new Book(name, author1, description, year, genre1);
        books.add(book);
    }

    static void addGenre() throws IOException {
        System.out.println("Print genre name");
        String name = bR.readLine();

        System.out.println("Print genre description");
        String description = bR.readLine();

        Genre genre = new Genre(name, description);
        genres.add(genre);
    }

    static void addAuthor() throws IOException {
        System.out.println("Print authors name");
        String name = bR.readLine();

        System.out.println("Print authors surname");
        String surname = bR.readLine();

        System.out.println("Print authors books");
        String books = bR.readLine();

        Author author = new Author(name, surname, books);

        authors.add(author);
    }

    static void deleteBook() throws IOException {
        System.out.println("All books u have:");
        getBooks();
        System.out.println("Print books name");
        String name = bR.readLine();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().contains(name)){
                books.remove(i);
            }
        }
    }

    static void deleteGenre() throws IOException {
        System.out.println("All genres u have:");
        getGenres();
        System.out.println("Print genres name");
        String name = bR.readLine();
        for (int i = 0; i < genres.size(); i++) {
            if (genres.get(i).getName().contains(name)){
                genres.remove(i);
            }
        }
    }

    static void deleteAuthor() throws IOException {
        System.out.println("All authors u have:");
        getAuthors();
        System.out.println("Print authors name");
        String name = bR.readLine();
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).getName().contains(name)){
                authors.remove(i);
            }
        }
    }

    static void getBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println("№ " + i + ": " + books.get(i));

        }
    }

    static void getGenres() {
        for (int i = 0; i < genres.size(); i++) {
            System.out.println("№ " + i + ": " + genres.get(i));

        }
    }

    static void getAuthors() {
        for (int i = 0; i < authors.size(); i++) {
            System.out.println("№ " + i + ": " + authors.get(i));

        }
    }
}
