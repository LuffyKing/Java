package threads;
import threads.MultiThread;
/**
 * MultiThreadDemo2
 */
public class MultiThreadDemo2 {

    public static void main(String[] args) {
        MultiThread mt1 = new MultiThread("Thread 1");
        MultiThread mt2 = new MultiThread("Thread 2");
        MultiThread mt3 = new MultiThread("Thread 2");
        mt1.t.start();
        mt2.t.start();
        mt3.t.start();
        System.out.println("Thread One is alive: " + mt1.t.isAlive());
        System.out.println("Thread Two is alive: " + mt2.t.isAlive());
        System.out.println("Thread Three is alive: " + mt3.t.isAlive());
        try {
            System.out.println("Waiting for threads to finish.");
            mt1.t.join();
            mt2.t.join();
            mt3.t.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
            System.out.println("Main thread was interrupted");
        }
        System.out.println("Thread one is alive: "+mt1.t.isAlive());
        System.out.println("Thread Two is alive: " + mt2.t.isAlive());
        System.out.println("Thread Three is alive: "+mt3.t.isAlive());
        System.out.println("Main thread exiting.");
    }
}