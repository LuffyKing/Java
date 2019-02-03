package collections;
import java.util.*;


/**
 * LinkedListDemo
 */
public class LinkedListDemo {
 public static void main(String[] args) {
     
    LinkedList<String> li = new LinkedList<String>();
    String a = "a";
    String str;
    for (int i = 0; i < 40; i++) {
        if (i%2 == 0) {
            str = a +" "+ i;
            li.addFirst(str);
        } else{
            str = a +" "+ i;
            li.addLast(str);
        }
    }
    System.out.println(li);
 }
    
}