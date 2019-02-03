package com.damola_INC.Java_WORLD.generics;

import java.io.PrintWriter;

/**
 * GenHierachy
 */
public class GenHierachy {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        Gen2<Integer> g2 = new Gen2<Integer>(10);
        Gen3<String, Integer> g3 = new Gen3<String, Integer>( "Damola", 10);
        pw.println("Gen2 integer " + g2.getOb());
        pw.println("Gen3 string "+ g3.getOv());
        pw.println("Gen3 integer "+ g3.getOb());
    }

}

class Gen1<T>{
    T ob;
    Gen1(T o){
        ob = o;
    }
    /**
     * @return the ob
     */
    public T getOb() {
        return ob;
       }
}

class Gen2<T> extends Gen1<T>{
    Gen2(T o){
        super(o);
    }
}

class Gen3<T,V> extends Gen1<T>{
    V ov;
    Gen3(T t, V v){
        super(t);
        ov = v;
    }
    /**
     * @return the ov
     */
    public V getOv() {
        return ov;
    }
}