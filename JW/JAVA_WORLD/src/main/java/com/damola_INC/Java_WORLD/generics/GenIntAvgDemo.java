package com.damola_INC.Java_WORLD.generics;

import java.io.PrintWriter;

/**
 * GenIntAvgDemo
 */
public class GenIntAvgDemo {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        Integer[] i = {1,2,3,4,5};
        Double[] d = {1.0,2.0,3.0,4.0,5.0};
        NewNumClass<Integer> n =  new NewNumClass<Integer>(i);
        NewNumClass<Double> nDouble = new NewNumClass<Double>(d);
        pw.println("The average of i integer list:- "+n.avg());
        pw.println("The average of d double list:- "+nDouble.avg());
    }
}

interface NumInterface<T extends Number>{
 double avg();
}

class NewNumClass<T extends Number> implements NumInterface<T>{
    private T[] numVar;
    NewNumClass(T[] o){
        numVar = o;
    }
    public double avg(){
        double sum = 0.0;
        for (int i = 0; i < numVar.length; i++) {
            sum += numVar[i].doubleValue();
        }
        return sum/numVar.length;
    }

}