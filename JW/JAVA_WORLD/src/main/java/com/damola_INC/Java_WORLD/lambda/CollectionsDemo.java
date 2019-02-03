package com.damola_INC.Java_WORLD.lambda;
import java.util.*;
import java.io.*;
/**
 * CollectionsDemo
 */
public class CollectionsDemo {
    static int compFunc(MyClass a ,MyClass b){
        return a.getVal() - b.getVal();
    }
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        ArrayList<MyClass> al = new ArrayList<MyClass>();
        al.add(new MyClass(1));
        al.add(new MyClass(2));
        al.add(new MyClass(3));
        MyClass maxValObj = Collections.max(al, CollectionsDemo::compFunc);
        pw.println("Maximum value is: "+ maxValObj.getVal());
    }
}
class MyClass{
    private int val;
    MyClass(int v){
        val = v;
    }
    int getVal(){
        return val;
    }
}
