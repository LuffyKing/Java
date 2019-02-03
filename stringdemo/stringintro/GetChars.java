package stringintro;
/**
 * GetChars
 */
public class GetChars {

    public static void main(String[] args) {
        String s = "This is a demo of the getChars method.";
        int start = 10;
        int stop = 14;
        char[] c = new char[stop - start];
        s.getChars(start, stop, c, 0);
        System.out.println(c); 
    }
}