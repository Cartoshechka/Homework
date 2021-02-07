package com.homework.task14;

public class Queen extends ChessItem{
    public Queen(String x, String y, String value) {
        super(x, y, value);
    }


    @Override
    public String draw() {
        return String.format("Draw Queen on chess board with pos x= %s ; y= %s",x,y);
    }
}
