package threads;
/**
 * CurrentThread
 */
public class CurrentThread {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("My Thread");
        System.out.println("New name  for thread: " + t);
        try {
            for(int i=5; i>0; i--){
                System.out.println(i);
                Thread.sleep(1000);             
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }      
    }
}