package Enumerations;
/**
 * AppleEnumsDemo2
 */
enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class AppleEnumsDemo2 {

    public static void main(String[] args) {
        Apple ap;
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains "+ap);
        Apple[] apList = Apple.values();
        for (Apple a : apList) {
            System.out.println(a);
        }
    }
}