package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * GenMyClass
 */
public class GenMyClassDemo {
 public static void main(String[] args) {
    MyGenFunc<Integer> myClass = MyGenClass<Integer>::new;
    MyGenClass<Integer> mc = myClass.func(100);
    PrintWriter pw = new PrintWriter(System.out, true);
    pw.println("I is: "+mc.getVal());
 }
    
}

interface MyGenFunc<T>{
    MyGenClass<T> func(T n);
}

class MyGenClass<T>{

    private T val;
    MyGenClass(T v){
        val = v;
    }

    MyGenClass(){
        val =null;
    }

    T getVal(){
        return val;
    }
}