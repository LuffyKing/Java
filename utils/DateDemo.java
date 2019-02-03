package utils;
import java.util.Date;
/**
 * DateDemo
 */
public class DateDemo {
    public static void main(String[] args) {
       Date date = new Date();
       System.out.println(date);
       long msec = date.getTime();
       System.out.println("Millisecnods since Jan 1, 1970: " + msec);
    }
    
}