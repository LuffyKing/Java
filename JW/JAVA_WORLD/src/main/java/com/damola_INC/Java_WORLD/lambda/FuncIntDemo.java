package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * FuncIntDemo
 */
public class FuncIntDemo {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        MyFuncInt myfunc;
        myfunc = () -> 123.45;
        pw.println("The answer is "+ myfunc.getValue());
        myfunc = () -> Math.random() * 100;
        pw.println("A random value is " + myfunc.getValue());
        pw.println("Another random value is " + myfunc.getValue());       
    }
}

interface MyFuncInt{
    double getValue();
}

