package com.damola_INC.Java_WORLD.generics;

import java.io.PrintWriter;

/**
 * MinMax
 */
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T>{
    T[] vals;
    MyClass(T[] o){
        vals = o;
    }
    public T min(){
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(v) < 0){
                v = vals[i];
            }
        }
        return v;
    }
    public T max(){
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
         if (vals[i].compareTo(v) > 0) {
             v = vals[i];
         }   
        }
        return v;
    }
}
public class GenInterfaceDemo{
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'p','b','t','d','x'};
        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);
        pw.println("The min of inums is "+ iob.min());
        pw.println("The max of inums is "+ iob.max());
        pw.println("The min of chs is "+ cob.min());
        pw.println("The max of chs is "+ cob.max());
    }
}