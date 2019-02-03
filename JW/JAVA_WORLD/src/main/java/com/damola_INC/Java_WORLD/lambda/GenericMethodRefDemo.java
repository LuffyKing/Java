package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * GenericMethodRefDemo
 */
public class GenericMethodRefDemo {
    static <T> int arrOpMeth(ArrFuncInt<T> arf, T[] vals, T v){
        return arf.func(vals, v);
    }
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        Integer[] intArr = {1, 2, 3, 4, 1, 6, 7, 1, 9, 10};
        Integer target = 1;
        String[] strArr = {"Damola", "Steven","Damola","Sexy"};
        String tarStr = "Damola";
        int count = arrOpMeth(MyArrayOps::<Integer>countMatching, intArr, target);
        pw.println("vals contains "+ count+" "+ target+"s");
        count = arrOpMeth(MyArrayOps::<String>countMatching, strArr, tarStr);
        pw.println("Damola was found: "+count+" times");
    }
}

interface ArrFuncInt<T>{
    int func(T[] vals, T v);
}

class MyArrayOps{
    static <T> int countMatching (T[] vals, T v){
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            count += vals[i] == v ? 1 : 0;
        }
        return count;
    }
}