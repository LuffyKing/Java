package threads;
class NewThread implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;
    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, threadName);
        System.out.println("New thread: "+t);
        suspendFlag =false;
    }
    public void run() {
        try{
            for (int i = 15; i > 0; i--) {
                System.out.println(name+ ": "+i);
                Thread.sleep(200);
                synchronized(this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        } catch(InterruptedException e){
            System.out.println(name+" interrupted.");
        }
        System.out.println(name + " exiting.");
    }
    synchronized void mysuspend(){
        suspendFlag =false;
    }
    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
    public static NewThread createAndStart(String name) {
        NewThread newT = new NewThread(name);
        newT.t.start();
        return newT;
    }
}
/**
 * SuspendResume
 */
public class SuspendResume {

    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        ob1.t.start();
        ob2.t.start();
        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread One");
            ob2.mysuspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
            //TODO: handle exception
            System.out.println("Main thread Interrupted");
        }
        try{
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob1.t.join();

        }   catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}