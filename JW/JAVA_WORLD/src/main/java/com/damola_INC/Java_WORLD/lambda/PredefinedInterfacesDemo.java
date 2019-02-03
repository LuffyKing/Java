package com.damola_INC.Java_WORLD.lambda;

import java.util.function.Function;

import javax.print.attribute.IntegerSyntax;

/**
 * PredefinedInterfacesDemo
 */
public class PredefinedInterfacesDemo {

    public static void main(String[] args) {
          Function<Integer, Integer> factInt;
          factInt = (t)->{
            int total = 1;
            for (int i = t; i > 1; i--) {
                total*=i;
            }
            return total;
          };
        System.out.println("The factorial of 6 is: "+factInt.apply(6));



    }
}


