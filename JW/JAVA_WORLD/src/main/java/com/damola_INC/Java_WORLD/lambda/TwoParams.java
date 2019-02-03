package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * TwoParams
 */
public class TwoParams {

    public static void main(String[] args) {
        TwoParamsInterface isFactor;
        PrintWriter pw = new PrintWriter(System.out, true);
        isFactor = (a, b) -> a % b == 0;
        pw.println("Is number 2 a factor of 8? "+Reply.provideAnswer(isFactor.test(8, 2)));
        pw.println("Is number 2 a factor of 7? "+Reply.provideAnswer(isFactor.test(7, 2)));
    }
}

interface TwoParamsInterface{
    boolean test(int n, int d);
}
class Reply{
    static String provideAnswer(Boolean b){
        return b ? "Yes" : "No";
    }
}