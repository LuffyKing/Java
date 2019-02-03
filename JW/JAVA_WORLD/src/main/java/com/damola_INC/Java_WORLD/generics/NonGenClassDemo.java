package com.damola_INC.Java_WORLD.generics;

import java.io.PrintWriter;

/**
 * NonGenClassDemo
 */
public class NonGenClassDemo {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        GenSub<String> w =  new GenSub<String>("HEllo", 47);
        pw.println("Subclass GenSub w integer "+ w.getnum());
        pw.println("Subclass GenSub w String "+ w.getOb());
    }
}

class NonGen{
    int num;
    NonGen(int i){
        num = i;
    }

    int getnum(){
        return num;
    }
}

class GenSub<T> extends NonGen{
    T ob;
    GenSub(T o, int i){
        super(i);
        ob = o;
        
    }
    /**
     * @return the ob
     */
    public T getOb() {
        return ob;
    }

}