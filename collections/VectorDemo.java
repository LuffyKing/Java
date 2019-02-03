package collections;

import java.util.Vector;
import java.util.Enumeration;;
/**
 * VectorDemo
 */
public class VectorDemo {
    public static void main(String[] args) {
       Vector<Integer> v = new Vector<Integer>(3,2);
       System.out.println("Initial size: "+v.size());
       System.out.println("Initial capacity: "+v.capacity());
       v.addElement(1);
       v.addElement(2);
       v.addElement(3);
       capDisplay(v);
       v.addElement(4);
       v.addElement(5);
       capDisplay(v);
       v.addElement(6);
       v.addElement(7);
       capDisplay(v);
       v.addElement(8);
       v.addElement(9);
       capDisplay(v);
       v.addElement(10);
       
       v.addElement(11);
       capDisplay(v);
       v.addElement(12);
       capDisplay(v);
       display("The first element: "+ v.firstElement());
       display("The last element: "+v.lastElement());
       if (v.contains(3)) {
        display("contains 3");
       }
       Enumeration<Integer> vEnum = v.elements();
       System.out.println("\nElements in vector: ");
       while (vEnum.hasMoreElements()) {
           System.out.println(vEnum.nextElement()+" ");
       }
    }
    static void capDisplay(Vector v){
        System.out.println("The capacity is "+v.capacity());
    }
    static void display(String text){
        System.out.println(text);
    }
}