package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * MethodRefDemo2
 */
public class MethodRefDemo2 {
    static String stringOp(StringIntRef sif, String str){
        return sif.func(str);
    }
    public static void main(String[] args) {
        String inStr = "Damola The Great";
        String outStr;
        PrintWriter pw = new PrintWriter(System.out, true);
        StrRevClass src = new StrRevClass();
        outStr = stringOp(src::strRevString, inStr);
        pw.println("Original String: "+inStr);
        pw.println("Reversed String: "+outStr);
    }
}

interface StringIntRef{
    String func(String s);
}

class StrRevClass{
    String strRevString(String s){
        String result ="";
        for (int i = s.length()-1; i > -1; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
