package com.damola_INC.Java_WORLD.generics;
import java.io.PrintWriter;
/**
 * GenMethDemo
 */
public class GenMethDemo {
    
    public static void main(String[] args) {
        PrintWriter pw =new PrintWriter(System.out, true);
        Integer[] nums = {1,2,3,4,5};
        if(isIn(2,nums)){
            pw.println("2 was found in integer list num");
        }
        if (!isIn(7, nums)) {
            pw.println("7 was not found in the integer list num");
        }
        String[] str = {
            "one",
            "two",
            "three",
            "four",
            "five"
        };
        if (!isIn("seven", str)) {
            pw.println("Seven was not found in the integer list num");
        }
        if (isIn("one", str)) {
            pw.println("One was found in the integer list num");
        }
    }
    static<T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for (int i =0; i<y.length; i++ ){
            if (x.equals(y[i])) {
                return true;
            }
            
        }
        return false;
    }
}