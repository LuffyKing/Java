package javalangDemo;
/**
 * SystemDemo
 */
public class SystemDemo {

    public static void main(String[] args) {
        long start, end;
        System.out.println("Timing a for loop from 0 to 100,000,000");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000001; i++) {
        
        }
        end = System.currentTimeMillis();
        System.out.println("Time for loop to complete: "+(end-start));
    }
}