package collections;

import java.util.*;

/**
 * TreeMapCompDemo
 */
public class TreeMapCompDemoThenComp {

    public static void main(String[] args) {
        MyComparatorNewThen mc = new MyComparatorNewThen();
        Comparator<String> mcs = mc.thenComparing((A,B)->A.compareToIgnoreCase(B));
        TreeMap<String, Double> tm = new TreeMap<String, Double>(mcs);
        tm.put("John Doe", 600.00);
        tm.put("Tim Kali", 800.00);
        tm.put("Skip Bayless", 90.00);
        tm.put("David Bayless", 1900.00);
        tm.put("Aaron Jones", 10000.00);
        tm.put("Carlos Soler", 500.00);
        tm.put("Aaron Soler", 500.00);
        Set<Map.Entry<String, Double>> s = tm.entrySet();
        for (Map.Entry<String, Double> me : s) {
            System.out.println(me.getKey()+":");
            System.out.println(me.getValue());
        }
    }
}


class MyComparatorNewThen implements Comparator<String>{
    public int compare(String A, String B){
        String[] namesArrA = A.split(" ");
        String[] namesArrB = B.split(" ");
        int res = namesArrA[namesArrA.length-1].compareToIgnoreCase(namesArrB[namesArrB.length-1]);
        return res;
    }
}