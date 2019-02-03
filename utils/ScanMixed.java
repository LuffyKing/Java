package utils;
import java.util.*;
import java.io.*;

/**
 * ScanMixed
 */
public class ScanMixed {

    public static void main(String[] args) throws IOException {
        FileWriter fout = new FileWriter("mixed.txt");
        int i;
        boolean b;
        String s;
        double d;
        int[] a = new int[2];
        fout.write("a b true 10 20 50.0 3 90.0 false");
        fout.close();
        FileReader fin = new FileReader("mixed.txt");
        Scanner src = new Scanner(fin);
        while (src.hasNext()) {
            if (src.hasNextInt()) {
                System.out.println("Int: " + src.nextInt());
                
            } else if (src.hasNextDouble()) {
                System.out.println("Double: "+src.nextDouble());
                
            } else if (src.hasNextBoolean()) {
                System.out.println("Boolean: "+src.nextBoolean());
                
            } else {
                System.out.println("String: "+src.next());
                
            }
        }
        src.close();

    }
}