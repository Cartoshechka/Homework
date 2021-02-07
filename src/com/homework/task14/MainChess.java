package com.homework.task14;

import java.util.ArrayList;

public class MainChess {
    public static void main(String[] args) {
        Drawable chessBoard = new ChessBoard();
        System.out.println(chessBoard.draw());
        ChessItem king = new King("5", "1 and 8", "king (♔)");
        ChessItem queen = new Queen("4", "1 and 8", "queen (♕)");
        ChessItem bishop = new Bishop("1 and 8","1 and 8","bishop(♗)");
        ChessItem knight = new Knight("2 and 7", "1 and 8","knight (♘)");
        ChessItem  rook = new Rook("3 and 6","1 and 8","rook (♖)");
        ChessItem pawn = new Pawn("From 1 to 8", "2 and 7", "pawn (♙)");

        ArrayList<ChessItem> items = new ArrayList<>();
        items.add(king);
        items.add(queen);
        items.add(bishop);
        items.add(knight);
        items.add(rook);
        items.add(pawn);
        for (ChessItem itm : items ) {
            System.out.println(itm.draw());
        }



    }



}