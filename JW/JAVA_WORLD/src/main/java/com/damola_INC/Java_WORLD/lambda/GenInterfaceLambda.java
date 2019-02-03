package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * GenInterfaceLambda
 */
public class GenInterfaceLambda {
    public static void main(String[] args) {
    GenFunc<String> strFunc;
    GenFunc<Integer> factorialFunc;
    PrintWriter pw = new PrintWriter(System.out, true);
    strFunc = (str) -> {
        String result = "";
        for (int i = str.length()-1; i > -1; i--) {
            result += str.charAt(i);
        }
        return result;
    };
    factorialFunc = (intVar) -> {
        int factTotal = 1;
        for (int i = intVar; i > 0; i--) {
            factTotal *= i;
        }
        return factTotal;
    };
    pw.println("Rev lambda func result: " + strFunc.getValue("Damola"));
    pw.println("Fact lambda func result: " + factorialFunc.getValue(6));
    }
    
}

interface GenFunc<T>{
    T getValue(T t);
}