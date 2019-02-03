package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;
interface DoubleNumericArrayFunc{
    double func(double[] i) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
   EmptyArrayException(){
       super("Array Empty");
   }
}
/**
 * LambdaExceptionDemo
 */
public class LambdaExceptionDemo {

    public static void main(String[] args) {
        DoubleNumericArrayFunc avgCalc;
        PrintWriter pw = new PrintWriter(System.out, true);
        avgCalc = (doubleArr)->{
            double sumTotal = 0.0;
            if(doubleArr.length == 0){
                throw new EmptyArrayException();
            }
                
            for (double d : doubleArr) {
                sumTotal += d;
            }
            return sumTotal / doubleArr.length;
        };
        double[] v = {1.0, 2.0, 3.0, 4.0, 5.0};
        //avgCalc.func(v);
        try {
            pw.println("The average of da is: "+avgCalc.func(v) );
        } catch (EmptyArrayException e) {
            //TODO: handle exception
            pw.println(e);
        }
        try {
            pw.println("The avaerage could not be calculate due to the following error"+ avgCalc.func(new double[0]));
        } catch (Exception e) {
            //TODO: handle exception
            pw.println(e);
        }
    }
}

