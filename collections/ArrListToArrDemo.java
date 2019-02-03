package collections;
import java.util.*;
/**
 * ArrListToArrDemo
 */
public class ArrListToArrDemo {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        Object[] objArr = al.toArray();
        for (int i = 0; i < objArr.length; i++) {
            System.out.println("ObjArr:"+objArr[i]);            
        }
        Integer[] iObArr = new Integer[al.size()];
        iObArr = al.toArray(iObArr);
        for (Integer iOb : iObArr) {
            System.out.println(iOb);
        }
        System.out.println(iObArr.length);
    }
}