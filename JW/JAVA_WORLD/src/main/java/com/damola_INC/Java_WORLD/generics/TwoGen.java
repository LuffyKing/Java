package com.damola_INC.Java_WORLD.generics;
import java.io.PrintWriter;

/**
 * TwoGen
 */
public class TwoGen {
 public static void main(String[] args) {
     PrintWriter pw = new PrintWriter(System.out, true);
     TwoGenClass<Integer, String> tgObj = new TwoGenClass<Integer, String>(88, "Generics");
     tgObj.showTypes();
     int t = tgObj.getob1();
     String v = tgObj.getob2();
     pw.println("The integer value is :"+t+" and String value is " + v);
 }
    
}

/**
 * TwoGenClass
 */
class TwoGenClass<T,V> {
    T ob1;
    V ob2;
    TwoGenClass(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }
    void showTypes(){
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Type of T is " + ob1.getClass().getName());
        pw.println("Type of V is "+ ob2.getClass().getName());
    }
    T getob1(){
        return ob1;
    }
    V getob2(){
        return ob2;
    }
    
}