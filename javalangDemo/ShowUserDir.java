package javalangDemo;
/**
 * ShowUserDir
 */
public class ShowUserDir {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        System.out.println("The current user dir is"+userDir);
    }
    
}