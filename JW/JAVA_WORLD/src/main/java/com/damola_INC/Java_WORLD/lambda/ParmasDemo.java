package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * ParmasDemo
 */
public class ParmasDemo {

    public static void main(String[] args) {
        NumericTest isEven;
        PrintWriter pw = new PrintWriter(System.out, true);
        isEven = (n) -> (n % 2)==0;
        pw.println("Is the number 3 even? " + provideAnswer.boolReply(isEven.test(3)));
        NumericTest isNonNeg;
        isNonNeg = (n) -> n > -1;
        pw.println("Is the number -1 non negative? "+ provideAnswer.boolReply(isNonNeg.test(-1)));
    }
}
interface NumericTest{
    boolean test(int n);
}

class provideAnswer{
    static String boolReply(boolean b){
        return b ? "Yes." : "No.";
    }
}