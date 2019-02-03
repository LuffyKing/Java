package com.damola_INC.Java_WORLD.generics;

import java.io.PrintWriter;

/**
 * GenOverriddenDemo
 */
public class GenOverriddenDemo {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        GenOverSub<String> gos = new GenOverSub<String>("damola");
        pw.println("Output: "+gos.getOb());
    }
}

class GenOver<T>{
    T ob;
    GenOver(T o){
        ob = o;
    }
    /**
     * @return the ob
     */
    public T getOb() {
        return ob;
    }
}

class GenOverSub<T> extends GenOver<T>{
    GenOverSub(T o){
        super(o);
    }
    @Override
    public T getOb() {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Overridden output!");
        return ob;
    }
}