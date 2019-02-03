package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * BloackLambdaDemo
 */
public class BlockLambdaDemo {

    public static void main(String[] args) {
        NumFunc factorial;
        PrintWriter pw = new PrintWriter(System.out, true);
        factorial = (n) -> {
            int total = 1;
            for (int i = n; i > 0; i--) {
                total *= i;
            }
            return total;
        };
        pw.println("The factorial of 6 is: "+factorial.run(6));
        pw.println("The factorial of 3 is: "+factorial.run(3));
    }
}

interface NumFunc{
    int run(int n);
}