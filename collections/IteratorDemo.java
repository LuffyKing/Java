package collections;
import java.util.*;
/**
 * Iterator
 */
public class IteratorDemo {
 public static void main(String[] args) {
    ArrayList<String> as = new ArrayList<String>();
    as.add("C");
    as.add("A");
    as.add("P");
    as.add("F");
    Iterator<String> i = as.iterator();
    while (i.hasNext()) {
        System.out.println(i.next());
    }
    ListIterator<String> l = as.listIterator();
    l = as.listIterator();
    while (l.hasNext()) {
        l.next();

    }

    while (l.hasPrevious()) {
        String e = l.previous();
        l.set(e+"+");
    } 
    
    // l = as.listIterator();
    // while (l.hasPrevious()) {
    //     String e = l.previous();
    //     l.set(e);

    // }
    i = as.iterator();
    while (i.hasNext()) {
        System.out.println(i.next());
    }

 }
    
}