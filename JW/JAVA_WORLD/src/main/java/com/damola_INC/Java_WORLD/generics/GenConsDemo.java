package com.damola_INC.Java_WORLD.generics;

import java.io.PrintWriter;

/**
 * GenConstructors
 */
public class GenConsDemo {
    public static void main(String[] args) {
        GenCons gc = new GenCons(100);
        GenCons gc2 = new GenCons(135.6F);
        gc.showVal();
        gc2.showVal();
    }
}

class GenCons{
    private double val;
    <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }

    void showVal(){
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("val: " +val);
    }
}