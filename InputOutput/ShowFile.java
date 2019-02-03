package InputOutput;
import java.io.*;
/**
 * ShowFile
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        PrintWriter pw = new PrintWriter(System.out,true);
        if (args.length != 1){

            pw.println("Usage: ShowFile filename");
            return;
        }
        try{
            fin = new FileInputStream(args[0]);

        } catch(FileNotFoundException e){
            pw.println("Cannot open file");
            return;
        }
        try{
            do {
                i = fin.read();
                if (i != -1) {
                    pw.println((char) i);
                }
            } while (i != -1);
        } catch(IOException e){
            pw.println("Error Reading File");
        } finally{
            try {
                fin.close();
            } catch (IOException e) {
                //TODO: handle exception
                pw.println("Error closing file");
            }
        }
        
    }
}