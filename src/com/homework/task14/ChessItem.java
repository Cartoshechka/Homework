package com.homework.task14;

public abstract class ChessItem implements Drawable {

        String x;
        String y;
        private String value;

        public ChessItem(String x,String y, String value){
                this.x = x;
                this.y = y;
                this.value = value;
        }

}
