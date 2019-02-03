package Enumerations;
/**
 * TypeWrappers
 */
public class TypeWrappers {

    public static void main(String[] args) {
        char a = 'a';
        Character aChar = Character.valueOf(a);
        char b = aChar.charValue();
        System.out.println(b);
        Boolean aBool = Boolean.valueOf("true");
        boolean newBool = aBool.booleanValue();
        Integer newInteger = Integer.valueOf(600);
        int i = newInteger.intValue();


        System.out.println(newBool);
        System.out.println(i);
    }
}