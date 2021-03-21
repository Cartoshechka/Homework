package com.homework.task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

import static com.homework.task29.Operations.*;

public class Manager {
    static BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    private static final ArrayList<Book> books = new ArrayList<Book>();
    private static final ArrayList<Genre> genres = new ArrayList<Genre>();
    private static final ArrayList<Author> authors = new ArrayList<Author>();

    static boolean addBook(){
        System.out.println("Print books name");
        String name = null;
        try {
            name = bR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Print books author");
        String author = null;
        try {
            author = bR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Print books description");
        String description = null;
        try {
            description = bR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Print books year");
        int year = 0;
        try {
            year = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Print books genre");
        String genre = null;
        try {
            genre = bR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Book book = new Book(name, author, description, year, genre);
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) == null) {
                books.add(book);
                return true;
            }
        }
        return false;
    }

    static boolean addGenre() {
        System.out.println("Print genre name");
        String name = null;
        try {
            name = bR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Print genre desriprion");
        String description = null;
        try {
            description = bR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Genre genre = new Genre(name, description);
        for (int i = 0; i < genres.size(); i++) {
            if (genres.get(i) == null) {
                genres.add(genre);
                return true;
            }
        }
        return false;
    }

    static boolean addAuthor() {
        System.out.println("Print authors name");
        String name = null;
        try {
            name = bR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Print authors surname");
        String surname = null;
        try {
            surname = bR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Print authors books");
        String books = null;
        try {
            books = bR.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Author author = new Author(name, surname, books);
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i) == null) {
                authors.add(author);
                return true;
            }
        }
        return false;
    }

    static boolean deleteBook() {
        System.out.println("Print index");
        int index = 0;
        try {
            index = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        books.remove(index);
        return true;
    }

    static boolean deleteGenre() {
        System.out.println("Print index");
        int index = 0;
        try {
            index = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        genres.remove(index);
        return true;
    }

    static boolean deleteAuthor()  {
        System.out.println("Print index");
        int index = 0;
        try {
            index = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        authors.remove(index);
        return true;
    }

    static boolean getBooks() {
        System.out.println(books);
        return true;
    }

    static boolean getGenres() {
        System.out.println(genres);
        return true;
    }

    static boolean getAuthors() {
        System.out.println(authors);
        return true;
    }
}
