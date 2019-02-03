package collections;
import java.util.*;


/**
 * ForEachDemo
 */
public class ForEachDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        for (String s : al) {
            System.out.println(s);
        }
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(1);
        ai.add(2);
        ai.add(3);
        ai.add(4);
        ai.add(5);
        int total = 0;
        for (int var : ai) {
            total += var;
        }
        System.out.println("Sum total: "+total);
    }
}