package threads;
import threads.NewThread;
/**
 * NewThreadDemo
 */
public class NewThreadDemo {

    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            //TODO: handle exception
            System.out.println("Main thread interruptted");
        }
        System.out.println("Main thread exiting");
    }
}