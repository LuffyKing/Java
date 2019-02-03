package collections;

import java.util.*;

/**
 * TreeMapCompDemo
 */
public class TreeMapCompDemo {

    public static void main(String[] args) {
        MyComparatorNew mc = new MyComparatorNew();
        TreeMap<String, Double> tm = new TreeMap<String, Double>(mc);
        tm.put("John Doe", 600.00);
        tm.put("Tim Kali", 800.00);
        tm.put("Skip Bayless", 900.00);
        tm.put("Aaron Jones", 10000.00);
        tm.put("Carlos Soler", 500.00);
        Set<Map.Entry<String, Double>> s = tm.entrySet();
        for (Map.Entry<String, Double> me : s) {
            System.out.println(me.getKey()+":");
            System.out.println(me.getValue());
        }
    }
}


class MyComparatorNew implements Comparator<String>{
    public int compare(String A, String B){
        String[] namesArrA = A.split(" ");
        String[] namesArrB = B.split(" ");
        int res = namesArrA[namesArrA.length-1].compareToIgnoreCase(namesArrB[namesArrB.length-1]);
        if (res == 0) {
            return A.compareToIgnoreCase(B);
        }
        return res;
    }
}