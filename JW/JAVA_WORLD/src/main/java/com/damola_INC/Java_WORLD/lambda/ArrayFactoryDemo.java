package com.damola_INC.Java_WORLD.lambda;

/**
 * ArrayFactoryDemo
 */
public class ArrayFactoryDemo {

    public static void main(String[] args) {
        ArrayFactoryInt<CoolClass[]> arrFact = CoolClass[]::new; 
        CoolClass[] a = arrFact.func(3);
        a[0] = new CoolClass(5);
        

    }
    
}

interface ArrayFactoryInt<T>{
    T func(int n);
}

class CoolClass{
    int val;
    CoolClass(int v){
        val = v;
    }
    /**
     * @return the val
     */
    public int getVal() {
        return val;
    }
}

