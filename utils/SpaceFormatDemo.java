package utils;
import java.util.*;

/**
 * SpaceFormatDemo
 */
public class SpaceFormatDemo {

    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("% d",100);
        System.out.println(f);
        f.close();
        f = new Formatter();
        f.format("%d", -100);
        System.out.println(f);
        f.close();
        
    }
}