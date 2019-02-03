package collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * CompDemo
 */
public class CompDemoReverse {
    public static void main(String[] args) {
        MyComparatorReversed mc = new MyComparatorReversed();
        TreeSet<String> ts = new TreeSet<String>(mc.reversed());
        ts.add("a");
        ts.add("b");
        ts.add("c");
        for (String a : ts) {
            System.out.println("  "+a);
        }

    }
    
}

class MyComparatorReversed implements Comparator<String>{
    public int compare(String a, String b){
       return a.compareTo(b);

    }
}