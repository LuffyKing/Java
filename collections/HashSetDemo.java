package collections;
import java.util.*;
/**
 * HashSet
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < 90; i++) {
            hs.add(i);
        }
        System.out.println("The contents of hs is: "+hs);
        System.out.println("I tried to add "+1+" but the result was "+hs.add(1));
        
    }
    
}