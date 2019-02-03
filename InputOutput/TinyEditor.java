package InputOutput;
/**
 * TinyEditor
 */
import java.io.*;
public class TinyEditor {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[100];
        System.out.println("Enter lines of text.");
        System.out.println("Enter '/exit' to quit.");
        try{
            for (int i = 0; i < 100; i++) {
                str[i] = br.readLine();
                if (str[i].equals("/exit")) {
                    break;
                }   
            }
            System.out.println("\nHere is your file:");
            for (int i = 0; i < str.length; i++) {
                if(str[i].equals("/exit")){
                    break;
                }
                System.out.println(str[i]);
            }
        }
     catch(IOException e){
        System.exit(0);
        }
    }
}