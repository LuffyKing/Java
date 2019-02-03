package collections;
import java.util.*;
/**
 * ArrList
 */
public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: "+al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("J");
        al.add(1, "A2");
        System.out.println("The arr size is "+ al.size());
        
        System.out.println("The array al contains" + al);
        al.remove("C");
        System.out.println("The array al contains" + al);
        al.remove(0);
        System.out.println("The array al contains" + al);
    }
    
}