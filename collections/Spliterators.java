package collections;
import java.util.*;
/**
 * Spliterators
 */
public class Spliterators {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("E");
        al.add("D");
        al.add("C");
        al.add("B");
        al.add("A");
        Spliterator<String> split = al.spliterator();
        while(split.tryAdvance((n) -> System.out.println(n)));
        Spliterator<String> mod = al.spliterator();
        ArrayList<String> as = new ArrayList<String>();
        while (mod.tryAdvance((n)->{as.add(n+"x");}));
        Spliterator<String> last = as.spliterator();
        last.forEachRemaining((n) -> System.out.println(n)); 

    }
}