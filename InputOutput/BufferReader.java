package InputOutput;
/**
 * BufferReader
 */
import java.io.*;
public class BufferReader {

    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter chracter '/exit' to quit !");
        try{
            do{
                
                str = br.readLine();
                System.out.println(str);
            } while(!str.equals("/exit"));
        } catch (IOException e){
            System.exit(0);
        }
        
    }
}
