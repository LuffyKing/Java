package javalangDemo;
/**
 * LaunchKindle
 */
public class LaunchKindle {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try{
            p = r.exec("open /Applications/Kindle.app");
            p.waitFor();
        } catch(Exception e){
            System.out.println("Error executing mehtod");
        }
        System.out.println("Notepad Returned "+p.exitValue());
    }
    
}