package javalangDemo;
import java.io.*;
/**
 * ParseDemo
 */
public class ParseDemo {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int a = 1;
        int sum = 0;
        System.out.println("Enter 0 to quit!");
        while (a != 0) {
            try {
                str = br.readLine();
            } catch (IOException e) {
                //TODO: handle exception
                System.out.println("Error: "+e);
                continue;
            }
            
            try {
                a = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                //TODO: handle exception
                System.out.println("Error: "+e);
                continue;
            }
            if (a == 0) {
                break;
            }
            sum += a;
            System.out.println("The current sum is " + sum);

        }
    }
}