package com.homework.task6;

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    Rectangle(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    Rectangle(int left, int top){
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }
    Rectangle(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle rectangle) {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }
    public String toString(){
        return "Rectangle{ " + System.lineSeparator()+
                " top= " + top + System.lineSeparator()
                +  "  left= " + left + System.lineSeparator() +
                " width= " + width  + System.lineSeparator() +
                " height= " + height +  "}";

    }
    public static void PrintRectangle(Rectangle rectangle){
        System.out.println(rectangle.toString());
    }

}
