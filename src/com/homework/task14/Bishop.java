package com.homework.task14;

public class Bishop extends ChessItem {
    public Bishop(String x, String y, String value) {
        super(x, y, value);
    }

    @Override
    public String draw() {
        return String.format("Draw Bishop on chess board with pos x= %s ; y= %s",x,y);
    }
}
