package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * LamsArgs
 */
public class LamsArgs {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Damola the great";
        String outStr;
        PrintWriter pw = new PrintWriter(System.out, true);
        StringFunc reverse = (str)->{
            String result ="";
            for (int i = str.length() - 1; i > -1; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        outStr = stringOp((str)->str.toUpperCase(), inStr);
        pw.println("String: "+inStr+" to upper case "+outStr);
        outStr = stringOp( (str)->{
            String result = "";

            for (int i = 0; i < str.length() ; i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
                
            }
            return result;
        }, outStr);
        pw.println("Spaces removed text: " + outStr);
        pw.println("Reversed text: " +reverse.func(outStr));

    }
}
interface StringFunc{
    String func(String n);
}

