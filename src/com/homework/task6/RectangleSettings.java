package com.homework.task6;

public class RectangleSettings {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(28, 59 ,67 ,37);
        Rectangle rectangle1 = new Rectangle(28,59);
        Rectangle rectangle2 = new Rectangle(28, 59, 67);
        Rectangle rectangle3 = new Rectangle(rectangle);


        Rectangle.PrintRectangle(rectangle);
        Rectangle.PrintRectangle(rectangle1);
        Rectangle.PrintRectangle(rectangle2);
        Rectangle.PrintRectangle(rectangle3);

    }



}
