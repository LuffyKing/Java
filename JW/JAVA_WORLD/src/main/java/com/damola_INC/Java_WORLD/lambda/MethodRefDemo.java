package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * MethodRefDemo
 */
public class MethodRefDemo {

    public static void main(String[] args) {
        String inStr = "Damola the great";
        String outStr;
        outStr = stringOp(MyStringOps::StringReverse, inStr);
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Original String: "+inStr);
        pw.println("Reversed String: "+outStr);
    }
    static String stringOp(StringFuncInt sfunc, String str){
        return sfunc.func(str);
    }
}

interface StringFuncInt{
    String func(String n);
}

class MyStringOps{
    static String StringReverse(String str){
        String result = "";
        for (int i = str.length()-1; i > -1; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}