package stringintro;
/**
 * String
 */
public class StringWork {

    public static void main(String[] args) {
        String s = new String();
        char chars[] = {'a', 'b', 'c'};
        String charStr = new String(chars);
        char[] char2 = {'a', 'b','c','d','e','f','g','h'};
        String charStr2 = new String(char2, 3, 3);
        String strCopy = new String(charStr2);
        byte[] bArr = {65, 66, 67, 68, 69, 70};
        String s1 = new String(bArr);
        System.out.println(s1);
        String s2 = new String(bArr ,2 ,3);
    }
}