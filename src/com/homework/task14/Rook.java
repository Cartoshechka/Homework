package com.homework.task14;

public class Rook extends ChessItem{

    public Rook(String x, String y, String value) {
        super(x, y, value);
    }

    @Override
    public String draw() {
        return String.format("Draw Rook on chess board with pos x= %s ; y= %s",x,y);
    }
}
