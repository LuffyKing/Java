package utils;
import java.util.*;

/**
 * FormatterDemo2
 */
public class FormatterDemo2 {

    public static void main(String[] args) {
        Formatter f = new Formatter();
        for (double i = 1.23; i < 1.0e+6; i*=100) {
            f.format("%f %e", i, i);
            System.out.println(f);
        }
        f.close();
    }
}