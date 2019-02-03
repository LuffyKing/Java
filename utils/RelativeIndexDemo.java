package utils;
import java.util.*;
/**
 * RelativeIndexDemo
 */
public class RelativeIndexDemo {

    public static void main(String[] args) {
        Formatter f = new Formatter();
        Calendar c = Calendar.getInstance();
        f.format("Today is day %te of %<tB, %<tY", c);
        System.out.println(f);
        f.close();
    }
}