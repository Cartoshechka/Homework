package com.classwork.lesson5.MiddlePart;

import java.util.List;

public class ChessMain {

    public static void main(String[] args) {
         //Drawable item = new ChessItem();
        Drawable board = new ChessBoard();

        List<Drawable> drawables = List.of(board, new Queen(), new Bishop());

        Drawer drawer = new Drawer();
        for (Drawable drawable : drawables) {
            drawer.draw(drawable);
        }


    }


}
