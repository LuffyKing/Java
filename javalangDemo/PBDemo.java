package javalangDemo;
/**
 * PBDemo
 */
public class PBDemo {

    public static void main(String[] args) {
        try{
            ProcessBuilder proc = new ProcessBuilder("/Applications/TextEdit.app/Contents/MacOS/TextEdit", "/Users/Damola/Desktop/fix1000.txt");
            proc.start();
        } catch(Exception e){
            System.out.println("Error executing method");
        }

    }
}