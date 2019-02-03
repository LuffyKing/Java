package collections;
import java.util.*;
/**
 * AlgosDemo
 */
public class AlgosDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(22);
        ll.add(-8);
        ll.add(90);
        ll.add(67);
        ll.add(156);
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll, r);
        for(int i: ll){
            System.out.println(i);
        }
        Collections.shuffle(ll);
        System.out.println("List Shuffled: ");
        for(int i: ll){
            System.out.println(i);
        }
        System.out.println("Min: "+Collections.min(ll));
        System.out.println("Max: "+Collections.max(ll));
        
    }
}