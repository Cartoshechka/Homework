package com.homework.task14;

public class King  extends ChessItem{
    public King(String x, String y, String value) {
        super(x, y, value);
    }


    @Override
    public String draw() {
        return String.format("Draw King on chess board with pos x= %s ; y= %s",x,y);
    }
}
