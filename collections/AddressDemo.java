package collections;
import java.util.*;
/**
 * Address
 */
public class AddressDemo {

    public static void main(String[] args) {
        LinkedList<Address> addy = new LinkedList<Address>();
        addy.add(new Address(
            "J.W, West", 
            "11 Oak Ave", 
            "Urbana",
            "IL",
            "618801")
        );
        addy.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        addy.add(new Address("Tom Carlton","867 Elm St", "Champaign", "IL", "61820"));
        for (Address a : addy) {
            System.out.println(a+"\n");
        }
        System.out.println();
    }
}

class Address{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;
    Address(
        String n, 
        String s, 
        String c,
        String st,
        String cd
    ){
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }
    public String toString(){
        return name+"\n"+street+"\n"+city+" "+state+" "+code;
    }
}