package InputOutput;
import java.io.*;
class CopyFileAuto{
    public static void main(String[] args) {
        int i;
        PrintWriter pw = new PrintWriter(System.out, true);
        if (args.length != 2) {
            pw.println("Usage: CopyFileAuto from to");
            return;
        }
        try(FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if(i != -1){
                    fout.write(i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            //TODO: handle exception
            pw.println("File not found error: "+e);

        } catch(IOException e){
            pw.println("File access error: "+e);
        }
    }
}