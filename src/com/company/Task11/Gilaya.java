package com.company.Task11;

public class Gilaya {

    public int square;
    public int subsidii;
    public int tax;


    public void Calculate(int square, int subsidii, int tax){

       int res = square * tax;
       int res2 = res / 100 * tax;
       int oplata = res - res2;


    }
}
