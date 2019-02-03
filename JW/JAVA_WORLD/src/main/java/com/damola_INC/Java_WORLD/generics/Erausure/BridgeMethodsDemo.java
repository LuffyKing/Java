package com.damola_INC.Java_WORLD.generics.Erausure;

import java.io.PrintWriter;
/**
 * BridgeMethodsDemo
 */
public class BridgeMethodsDemo {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        Gen2 genStr = new Gen2("Damola");
        genStr.getOb();
    }
}

class Gen<T>{
    T ob;
    Gen(T o){
        ob = o;
    }

    /**
     * @return the ob
     */
    public T getOb() {
        return ob;
    }
}

class Gen2 extends Gen<String>{
    Gen2(String o){
        super(o);
    }
    @Override
    public String getOb() {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("You called string getOb()");
        return ob;
    }
}
