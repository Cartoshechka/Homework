package com.homework.task14;

public abstract class AbstractItem {
    private String x;
    private String y;
    private String value;

    public AbstractItem(String x,String y, String value){
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public String toString() {
        return "Item{"
                + "x='" + x + '\''
                + ", y='" + y
                + "', value='" + value + "'"
                + "} \n";
    }
}
