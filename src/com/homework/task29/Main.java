package com.homework.task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import static com.homework.task29.Manager.*;

public class Main {
    static BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    static String input;
    public static void main(String[] args) throws IOException {
        System.out.println("To stop program print something, to start(after each action) press enter");
        while (bR.readLine().equals("")) {
            System.out.println("Choose the operation (add, delete, get)");
            switch (bR.readLine().toUpperCase(Locale.ROOT)) {
                case "ADD":
                    System.out.println("What u want to add? (book, author or genre)");
                    input = bR.readLine().toUpperCase(Locale.ROOT);
                    if (input.equals("BOOK")){
                        addBook();
                    }else if (input.equals("AUTHOR")){
                        addAuthor();
                    }else if (input.equals("GENRE")){
                        addGenre();
                    }
                    break;
                case "GET":
                    System.out.println("What u want to get? (book, author or genre)");
                    input = bR.readLine().toUpperCase(Locale.ROOT);
                    if (input.equals("BOOK")){
                        getBooks();
                    }else if (input.equals("AUTHOR")){
                        getAuthors();
                    }else if (input.equals("GENRE")){
                        getGenres();
                    }
                    break;
                case "DELETE":
                    System.out.println("What u want to delete? (book, author or genre)");
                    input = bR.readLine().toUpperCase(Locale.ROOT);
                    if (input.equals("BOOK")){
                        deleteBook();
                    }else if (input.equals("AUTHOR")){
                        deleteAuthor();
                    }else if (input.equals("GENRE")){
                        deleteGenre();
                    }
                    break;

                default:
                    System.out.println("something wrong, try again");

            }
        }
    }
}
