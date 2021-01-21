package com.classwork.lesson5.MiddlePart;

public interface HasValue {
    int getValue();

}
interface Element extends Drawable, HasValue{
    int getX();

    int getY();
}