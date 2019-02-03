package stringintro;
import java.io.*;

/**
 * UseStream
 */
public class UseStream {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter 'stop' to quit");
        System.out.println("Enter State: ");
        do {
            str = br.readLine();
            str = str.trim();
            if(str.equals("Lagos")){
                System.out.println("Lagos");
            } else{
                System.out.println("I do not know the capital of " +str);
            }
        } while (!str.equals("stop"));

    }
}