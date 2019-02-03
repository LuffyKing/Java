/**
 * NewThreadExtDemo
 */
public class NewThreadExtDemo {

    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.start();
        try{
            for(int i =5; i>0;i--){
                System.out.println("Main Thread: "+i);
            }
        } catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main Thread exiting");
    }
}