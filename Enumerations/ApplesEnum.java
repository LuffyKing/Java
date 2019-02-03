package Enumerations;
/**
 * Apples
 */
enum Apple{
    Jonathan, GoldenDel, RedDel , WineSap, Cortland
}
public class ApplesEnum {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.WineSap;
        System.out.println("The value of ap is: "+ ap);
        System.out.println();
        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel) {
            System.out.println("ap contains GoldenDel.\n");
        }
        switch (ap) {
            case Jonathan:{
                System.out.println("ap contains Jonathan.\n");
                break;
            }
            case GoldenDel:{
                System.out.println("ap contains GoldenDel.\n");
                break;}
            case RedDel:{
                System.out.println("ap contains RedDel.\n");
                break;}
            case WineSap:{
                System.out.println("ap contains WineSap.\n");
                break;}
            case Cortland:{
                System.out.println("ap contains Cortland.\n");
                break;}
            default:
                break;
        }
    }
    
}