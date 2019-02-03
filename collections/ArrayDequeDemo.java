package collections;
import java.util.*;
/**
 * ArrayDequeDemo
 */
public class ArrayDequeDemo {

    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<String>();
        ad.push("A");
        ad.push("B");
        ad.push("C");
        ad.push("D");
        ad.push("E");
        ad.push("F");
        System.out.println("Popping the stack: ");
        while(ad.peek() != null){
            System.out.println("Current head of the queue is: "+ad.pop());
        }
    }
}