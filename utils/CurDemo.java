package utils;
import java.util.*;

class CurDemo{
    public static void main(String[] args) {
        Currency c;
        c = Currency.getInstance(Locale.US);
        System.out.println("Symbol: "+ c.getSymbol());
        System.out.println("Default franctional digits: "+ c.getDefaultFractionDigits());
        
        c = Currency.getInstance(Locale.KOREA);
        System.out.println("Symbol: "+ c.getSymbol());
        System.out.println("Default franctional digits: "+ c.getDefaultFractionDigits());

    }
}