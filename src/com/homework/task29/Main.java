package com.homework.task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import static com.homework.task29.Classes.*;
import static com.homework.task29.Manager.*;
import static com.homework.task29.Operations.*;

public class Main {
    static BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    static String input;
    public static void main(String[] args) throws IOException {
        System.out.println("To stop program print something, to start(after each action) press enter");
        while (bR.readLine().equals("")) {
            working();
        }
    }

    private static void working() throws IOException {
        System.out.println("Choose with what u want to work (book, author, genre)");
        Classes input = Classes.valueOf(bR.readLine().toUpperCase(Locale.ROOT));
        switch (input) {
            case BOOK -> {
                System.out.println("What u want to do? (add, delete or get)");
                Operations op1 = Operations.valueOf(bR.readLine().toUpperCase(Locale.ROOT));
                if (op1.equals(ADD)) {
                    addBook();
                } else if (op1.equals(DELETE)) {
                    deleteBook();
                } else if (op1.equals(GET)) {
                    getBooks();
                }else {
                    System.out.println("We don't have such function");
                }
            }
            case AUTHOR -> {
                System.out.println("What u want to do? (add, delete or get)");
                Operations op1 = Operations.valueOf(bR.readLine().toUpperCase(Locale.ROOT));
                if (op1.equals(ADD)) {
                    addAuthor();
                } else if (op1.equals(DELETE)) {
                    deleteAuthor();
                } else if (op1.equals(GET)) {
                    getAuthors();
                }else {
                    System.out.println("We don't have such function");
                }
            }
            case GENRE -> {
                System.out.println("What u want to do? (add, delete or get)");
                Operations op1 = Operations.valueOf(bR.readLine().toUpperCase(Locale.ROOT));
                if (op1.equals(ADD)) {
                    addGenre();
                } else if (op1.equals(DELETE)) {
                    deleteGenre();
                } else if (op1.equals(GET)) {
                    getGenres();
                }else {
                    System.out.println("We don't have such function");
                }
            }
            default -> System.out.println("something wrong, try again");
        }
    }

}
