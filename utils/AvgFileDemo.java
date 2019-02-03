package utils;
import java.util.*;
import java.io.*;

/**
 * AvgFileDemo
 */
public class AvgFileDemo {

    public static void main(String[] args) throws IOException{
        int count = 0;
        double sum = 0.0;
        FileWriter fout = new FileWriter("test.txt");
        fout.write("2 3.4 5 6 7.4 9.1 10.5 done");
        fout.close();
        FileReader fin = new FileReader("test.txt");
        Scanner sin = new Scanner(fin);
        
        while (sin.hasNextDouble()) {
            sum += sin.nextDouble();
            count++;
        }
        if (sin.hasNext("done")) {
            System.out.println("Average: "+sum/count);
        } else{
            System.out.println("File format error");
            
        }
        sin.close();
        
    }
}