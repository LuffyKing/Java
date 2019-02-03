package InterfacePrac;
import InterfacePrac.DynStack;
/**
 * IFTest2
 */
public class IFTest2 {

    public static void main(String[] args) {
        DynStack ds = new DynStack(10);
        for (int i = 0; i < 10; i++) {
            ds.push(i);
        }
        for (int i = 10; i < 22; i++) {
            ds.push(i);
        }
        for (int i = 0; i < 22; i++) {
            System.out.println(ds.pop());
        }
        for (int i = 0; i < 3; i++) {
            ds.pop();
        }
    }
}