/**
 * Client
 */
package InterfacePrac;
public class Client implements Callback{
    public void callback(int p){
        System.out.println("callback called with " + p);
    }
}