package InputOutput;
import java.io.*;
public class ShowFileAuto{
    public static void main(String[] args) {
        int i;
        PrintWriter pw = new PrintWriter(System.out,true);
        if (args.length != 1) {
            pw.println("USAGE: ShowFile filename");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])){
            do {
                i =fin.read();
                if (i != -1) {
                    pw.println((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            pw.println("File Not Found.");
        } catch(IOException e){
            pw.println("An I/O Error Occured");
        }
    }
}