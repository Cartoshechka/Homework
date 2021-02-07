package com.homework.task14;

public class Knight extends ChessItem{
    public Knight(String x, String y, String value) {
        super(x, y, value);
    }


    @Override
    public String draw() {
        return String.format("Draw Knight on chess board with pos x= %s ; y= %s",x,y);
    }
}
