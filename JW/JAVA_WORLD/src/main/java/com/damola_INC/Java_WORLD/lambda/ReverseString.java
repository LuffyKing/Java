package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        StringFuncInterface stringRev;
        PrintWriter pw = new PrintWriter(System.out, true);
        stringRev = (str) -> {
            String revStr = "";
            for (int i = str.length()-1; i > -1; i--) {
                revStr += str.charAt(i);
            }
            return revStr;
        };
        pw.println("The reverse of Damola is "+stringRev.getReverseString("damola"));
        pw.println("The reverse of Football is "+stringRev.getReverseString("Football"));
    }

}

interface StringFuncInterface{
    String getReverseString(String s);
}