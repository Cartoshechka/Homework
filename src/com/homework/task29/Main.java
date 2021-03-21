package com.homework.task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import static com.homework.task29.Manager.*;
import static com.homework.task29.Operations.*;

public class Main {
    static BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    static Map<Operations, Boolean> map = Map.of(
            ADDBOOK, addBook(),
            DELETEBOOK, deleteBook(),
            GETBOOKS, getBooks(),
            ADDAUTHOR, addAuthor(),
            GETAUTHORS, getAuthors(),
            DELETEAUTHOR, deleteAuthor(),
            ADDGENRE, addGenre(),
            GETGENRES, getGenres(),
            DELETEGENRE, deleteGenre()
    );
    public static void main(String[] args) throws IOException {
        System.out.println("To stop program print something, to start press enter");
        while (bR.readLine().equals("")) {
            System.out.println("Choose the operation");
            for (Operations key : map.keySet()) {
                System.out.println(key);
            }
        }
    }
}
