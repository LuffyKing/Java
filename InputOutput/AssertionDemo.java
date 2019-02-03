package InputOutput;

import java.io.PrintWriter;

/**
 * AssertionDemo
 */
public class AssertionDemo {
    static int val = 3;
    static int getnum(){
        return val--;
    }
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        int n;
        for (int i = 0; i < 10; i++) {
            n = getnum();
            assert n > 0;
            pw.println("n is " + n);
        }
    }
}