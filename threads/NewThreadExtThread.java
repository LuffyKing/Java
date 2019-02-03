package threads;
/**
 * NewThreadExtThred
 */
public class NewThreadExtThread extends Thread{
    NewThread(){
        super("Demo Thread");
        System.out.println("Child thread: " +this);
    }
    public void run() {
        try {
         for (int i = 5; i < 0; i--) {
             System.out.println("Child Thread: "+ i);
             Thread.sleep(500);
         }
        } catch (InterruptedException e) {
            //TODO: handle exception
            System.out.println("Child Interrupted.");
        }
        System.out.println("Exiting child thread.");
    }

}