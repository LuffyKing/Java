package collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * CompDemo
 */
public class CompDemo {
    public static void main(String[] args) {
        MyComparator mc = new MyComparator();
        TreeSet<String> ts = new TreeSet<String>(mc);
        ts.add("a");
        ts.add("b");
        ts.add("c");
        for (String a : ts) {
            System.out.println("  "+a);
        }

    }
    
}

class MyComparator implements Comparator<String>{
    public int compare(String a, String b){
       return b.compareTo(a);

    }
}