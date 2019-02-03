package com.damola_INC.Java_WORLD.generics;

import java.io.PrintWriter;

/**
 * RawTypes
 */
public class RawTypes {

 public static void main(String[] args) {
     Gen10<Integer> iOb =  new Gen10<Integer>(88);
     Gen10 raw = new Gen10(Double.valueOf(98.6));
     double d = (Double) raw.getOb();
     PrintWriter pw = new PrintWriter(System.out, true);

     pw.println("Value: " + d);
 }    
}

class Gen10<T>{
    T ob;
    Gen10(T o){
        ob = o;
    }
    /**
     * @return the ob
     */
    public T getOb() {
        return ob;
    }
}
