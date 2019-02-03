package collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * CompDemo
 */
public class CompDemoReverseLambda {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr)->bStr.compareTo(aStr));
        ts.add("a");
        ts.add("b");
        ts.add("c");
        for (String a : ts) {
            System.out.println("  "+a);
        }

    }
    
}

