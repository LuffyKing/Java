package stringintro;
/**
 * SubStringDemo
 */
public class SubStringDemo {

    public static void main(String[] args) {
        String org = "The time to win is now, try to win!";
        String search = "win";
        String sub = "be successful";
        int i = 0;
        String result ="";
        while(i != -1){
            i = org.indexOf(search);
            if (i!= -1) {
                result = org.substring(0, i);
                result = result+sub;
                result = result + org.substring(i+search.length());
                org = result;  
            }
            
        }
        System.out.println(org);
    }
}