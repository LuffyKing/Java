package utils;

import java.util.Calendar;
import java.util.GregorianCalendar;/**
 * GregCalDemo
 */
public class GregCalDemo {

    public static void main(String[] args) {
        String months[] = {
            "Jan", "Feb", "Mar", "Apr",
            "May","Jun","Jul","Aug",
            "Sep","Oct","Nov", "Dec"
        };
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.print("Date: ");
        System.out.print(gcal.get(GregorianCalendar.DATE));
        System.out.print("/"+gcal.get(GregorianCalendar.MONTH));
        System.out.println("/"+gcal.get(GregorianCalendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcal.get(GregorianCalendar.HOUR)+":");
        System.out.print(gcal.get(GregorianCalendar.MINUTE)+":");
        System.out.println(gcal.get(GregorianCalendar.SECOND));
        gcal.set(GregorianCalendar.HOUR, 17);
        gcal.set(GregorianCalendar.MINUTE, 30);
        gcal.set(GregorianCalendar.SECOND, 30);
        System.out.print("Time: ");
        System.out.print(gcal.get(GregorianCalendar.HOUR)+":");
        System.out.print(gcal.get(GregorianCalendar.MINUTE)+":");
        System.out.println(gcal.get(GregorianCalendar.SECOND));
        if (gcal.isLeapYear(gcal.get(GregorianCalendar.YEAR))) {
            System.out.println("This year is a leap year");
        } else{
            System.out.println("This year is not a leap year");
        }
    }
}