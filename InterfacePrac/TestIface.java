package InterfacePrac;

import interfacePrac.AnotherClient;

/**
 * TestIface
 */
public class TestIface {

    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob;
        c.callback(42);
    }
}