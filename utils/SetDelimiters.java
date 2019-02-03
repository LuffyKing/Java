package utils;
import java.util.*;
import java.io.*;
/**
 * SetDelimiters
 */
public class SetDelimiters {

    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("delim.txt");
        fw.write("1, 2, 3,   4, 5,  6, 9, 10, done");
        fw.close();
        FileReader fin = new FileReader("delim.txt");
        Scanner sin = new Scanner(fin);
        sin.useDelimiter(", *");
        int sum = 0;
        while(sin.hasNextInt()){
            sum += sin.nextInt();
        }
        if (sin.hasNext("done")) {
            System.out.println("Sum: "+sum);
        } else {
            System.out.println("File format error");
        }
        sin.close();
    }
}