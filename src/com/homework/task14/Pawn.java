package com.homework.task14;

public class Pawn extends ChessItem{
    public Pawn(String x, String y, String value) {
        super(x, y, value);
    }


    @Override
    public String draw() {
        return String.format("Draw Pawn on chess board with pos x= %s ; y= %s",x,y);
    }
}
