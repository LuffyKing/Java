package Enumerations;
enum Apple{
    Johnathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;
    Apple(int p){
        price =p;
    }
    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }
}
/**
 * AppleEnumClassDemo
 */
public class AppleEnumClassDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.Johnathan;
        System.out.println("The apple " +ap +" costs "+ap.getPrice());
        for (Apple a : Apple.values()) {
            System.out.println(a +" costs "+a.getPrice());
            
        }
    }
    

}