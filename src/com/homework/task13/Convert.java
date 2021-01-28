package com.homework.task13;

public interface Convert {

    static double farengeit(double cels) {
       double res = (cels * 9 / 5) + 32;
       return res;
    }
    static double calvin(double cels){
        double res = cels + 273.15;
        return res;
    }
}
