package InterfacePrac;

import InterfacePrac.FixedStack;

/**
 * IFTest
 */
public class IFTest {

    public static void main(String[] args) {
        FixedStack fs  =  new FixedStack(10);
        for (int i = 1; i <= 10; i++) {
            fs.push(i);
        }
        fs.push(11);
        System.out.println(fs.pop());
        fs.push(11);
    }
}