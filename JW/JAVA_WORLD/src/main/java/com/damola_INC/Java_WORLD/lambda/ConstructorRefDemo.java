package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * ConstructorRefDemo
 */
public class ConstructorRefDemo {

    public static void main(String[] args) {
        CoolFunc myClassCons = NewClass::new;
        NewClass nc = myClassCons.func(100);
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("val in mc is "+ nc.getVal());
    }
}

interface CoolFunc{
    NewClass func(int n);
}

class NewClass{
    private int val;
    NewClass(int v){
        val = v;
    }
    NewClass(){
        val = 0;
    }

    int getVal(){
        return val;
    }
}