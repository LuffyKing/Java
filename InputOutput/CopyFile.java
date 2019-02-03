package InputOutput;
import java.io.*;
class CopyFile{
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        PrintWriter pw = new PrintWriter(System.out, true);
        if (args.length != 2) {
            pw.println("Usage: CopyFile from to");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            //TODO: handle exception
            pw.println("I/O Error: "+e);
        } finally{
            try{
                if (fin !=null) { 
                    fin.close();
                }
            } catch(IOException e2){
                pw.println("Error Closing Input File");
            }
            try{
                if (fout != null) {
                    fout.close();
                }

            } catch(IOException e3){
                pw.println("Error closing input file");
            }
        }
    }
}