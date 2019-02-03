package com.damola_INC.Java_WORLD.generics;

import java.io.PrintWriter;

/**
 * GenDemo
 */
public class GenDemo {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
       
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getob();
        pw.println("value: " + v);
        pw.println();
        Gen<String> strOb = new Gen<String> ("Generic Test");
        strOb.showType();
        String str = strOb.getob();
        pw.println("value: "+ str);
    }
}

/**
 * Gen
 */
class Gen<T> {
    T ob;
    
    Gen(T o){
        ob =o;
    }
    T getob(){
        return ob;
    }
    void showType(){
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Type of T is "+ ob.getClass().getName());
    }
}
