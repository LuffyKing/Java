package Enumerations;

enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
/**
 * AppleEnumDemo4
 */
public class AppleEnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        ap = Apple.RedDel;
        ap2 = Apple.Jonathan;
        ap3 = Apple.RedDel;
        Apple ap4 = Apple.Winesap;
        if(ap.compareTo(ap2) > 0 ){
            System.out.println(ap+ "comes after "+ap2);

        }
        if (ap.equals(ap3)) {
            System.out.println(ap+ " equals "+ap3);
        }
        System.out.println("Ordninal of "+ ap +" is  "+ap.ordinal());
    }
    
}
