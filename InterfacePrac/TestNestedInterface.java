package InterfacePrac;

import InterfacePrac.NestedInterface;
class B implements NestedInterface.NesIF{
    public boolean isNotNegative(int x){
        if (x>=0) {
            return true;
        }
        return false;
    }
}
/**
 * TestNestedInterface
 */
public class TestNestedInterface  {
    public static void main(String[] args) {
        B newInfClass = new B();
        System.out.println("Here we go : " + newInfClass.isNotNegative(-9));
    }
}