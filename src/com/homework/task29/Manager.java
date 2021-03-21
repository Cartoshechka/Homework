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

        System.out.println("Print books author");
        String author = bR.readLine();

        System.out.println("Print books description");
        String description = bR.readLine();

        System.out.println("Print books year");
        int year = 0;
        try {
            year = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            System.out.println("Print books year in numbs (like 123)");
        }
        System.out.println("Print books genre");
        String genre = null;
        try {
            genre = bR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Book book = new Book(name, author, description, year, genre);
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
        System.out.println("Count of books (first starts with 0" + books.size());
        System.out.println("Print index");
        int index = 0;
        try {
            index = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            System.out.println("Print index in numbs (like 123)");
            index = Integer.parseInt(bR.readLine());
        }
        try {
            books.remove(index);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("I remember u that indexing starts with 0 plz include it and try again");
            System.out.println("Print index");
            try {
                index = Integer.parseInt(bR.readLine());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    static void deleteGenre() throws IOException {
        System.out.println("Count of genres (first starts with 0" + genres.size());
        System.out.println("Print index");
        int index = 0;
        try {
            index = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            System.out.println("Print index in numbs (like 123)");
            index = Integer.parseInt(bR.readLine());
        }
        try {
            genres.remove(index);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("I remember u that indexing starts with 0 plz include it and try again");
            System.out.println("Print index");
            try {
                index = Integer.parseInt(bR.readLine());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    static void deleteAuthor() throws IOException {
        System.out.println("Count of authors (first starts with 0" + authors.size());
        System.out.println("Print index");
        int index = 0;
        try {
            index = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            System.out.println("Print index in numbs (like 123)");
            index = Integer.parseInt(bR.readLine());
        }
        try {
            authors.remove(index);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("I remember u that indexing starts with 0 plz include it and try again");
            System.out.println("Print index");
            try {
                index = Integer.parseInt(bR.readLine());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    static void getBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    static void getGenres() {
        for (Genre genre : genres) {
            System.out.println(genre);
        }
    }

    static void getAuthors() {
        for (Author author : authors) {
            System.out.println(author);
        }
    }
}
