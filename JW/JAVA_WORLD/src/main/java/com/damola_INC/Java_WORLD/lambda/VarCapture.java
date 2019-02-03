package com.damola_INC.Java_WORLD.lambda;

import java.io.PrintWriter;

/**
 * VarCapture
 */
public class VarCapture {
    
    public static void main(String[] args) {
        int num = 10;
        MyFunc mf;
        mf = (n)->{
            return n*num;
        };
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("The value of mf(10): " + mf.func(10));
        VarCap2 vc2 = new VarCap2();
        pw.println("The value of vc2.multiply(10): " + vc2.multiply(10)+ " use:"+vc2.use);
    }
}

interface MyFunc{
    int func(int n);
}
class VarCap2{
    int use;
    VarCap2(){
        use = 0; 
    }
    public int multiply(int a){
        MyFunc testFunc;
        testFunc = (n)->{
            use++;
            return a*n;
        };
        return testFunc.func(10);
       
    }
}