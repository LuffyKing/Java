package utils;
import java.util.*;
/**
 * LeftJustify
 */
public class LeftJustify {

    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("|%10.2f|", 123.123);
        System.out.println(f);
        f.close();
        f = new Formatter();
        f.format("|%-10.2f|", 123.123);
        System.out.println(f);
        f.close();
    }
}