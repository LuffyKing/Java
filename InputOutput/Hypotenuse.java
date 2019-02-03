package InputOutput;
import java.io.PrintWriter;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Hypotenuse
 */
public class Hypotenuse {
    
    public static void main(String[] args) {
        double side1;
        double side2;
        double hypo;
        side1 = 4.0;
        side2 = 3.0;
        PrintWriter pw = new PrintWriter(System.out, true);
        hypo = sqrt(pow(side1, 2)+ pow(side2, 2));    
        pw.println(hypo);
    }
}