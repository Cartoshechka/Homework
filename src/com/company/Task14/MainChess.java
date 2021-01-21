package com.company.Task14;

import java.util.List;

public class MainChess {
    public static void main(String[] args) {
        Drawable chessBoard = new ChessBoard();
        System.out.println(chessBoard.draw());
        AbstractItem king = new King("5", "1 and 8", "king (♔)");
        AbstractItem queen = new Queen("4", "1 and 8", "queen (♕)");
        AbstractItem bishop = new Bishop("1 and 8","1 and 8","bishop(♗)");
        AbstractItem knight = new Knight("2 and 7", "1 and 8","knight (♘)");
        AbstractItem  rook = new Rook("3 and 6","1 and 8","rook (♖)");
        AbstractItem pawn = new Pawn("From 1 to 8", "2 and 7", "pawn (♙)");

        List<AbstractItem> items = List.of(king,queen, bishop,pawn,knight,rook);
        System.out.println(items.toString());



    }



}