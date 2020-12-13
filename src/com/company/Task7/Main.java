package com.company.Task7;

public class Main {
    static class Util{
        private static double getDistance(double x1, double y1, double x2, double y2) {
            return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));


        }
    }




    public static void main(String[] args) {

        System.out.println("Distance among points: " + Util.getDistance(24.7, 46.7, 83.5, 48.97));

    }


}
