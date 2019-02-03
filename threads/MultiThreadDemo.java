package threads;
import threads.MultiThread;
/**
 * MultiThreadDemo
 */
public class MultiThreadDemo {

    public static void main(String[] args) {
       MultiThread nt1 = new MultiThread("One");
       MultiThread nt2 = new MultiThread("Two");
       MultiThread nt3 = new MultiThread("Three");
       nt1.t.start();
       nt2.t.start();
       nt3.t.start();
       try {
           Thread.sleep(10000);
       } catch (Exception e) {
           //TODO: handle exception
           System.out.println("Main thread Interrupted");
       }
       System.out.println("Main thread exiting");
    }
}