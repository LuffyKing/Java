package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * ClassFactory
 */
public class ClassFactoryDemo {
    static <R, T> R myClassFactory(FactoryInt<R,T> cons, T v){
        return cons.genClass(v);
    }
    public static void main(String[] args) {
        FactoryInt<ClassFactory<Double>, Double> myClassCons = ClassFactory<Double>::new;
        ClassFactory<Double> a = myClassFactory(myClassCons, 10.00);
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("The value of a is: "+a.getVal());
        FactoryInt<ClassFactory2, String> myClassCons2 = ClassFactory2::new;
        ClassFactory2 b = myClassFactory(myClassCons2, "damola");
        pw.println("The value of b is: "+b.getStr());
    }
}


interface FactoryInt<R,T>{
    R genClass(T n);
}

class ClassFactory<T>{
    private T val;
    ClassFactory(T v){
        val = v;
    }
    ClassFactory(){
        val = null;
    }
    /**
     * @return the val
     */
    public T getVal() {
        return val;
    }
}

class ClassFactory2{
    String str;
    ClassFactory2(String s){
        str = s;
    }
    ClassFactory2(){
        str = "";
    }
    /**
     * @return the str
     */
    public String getStr() {
        return str;
    }
}