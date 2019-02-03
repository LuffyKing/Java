package utils;
import java.util.*;

class MyTimerTask extends TimerTask{
    public void run(){
        System.out.println("Timer task executed.");
    }

}

/**
 * TTest
 */
public class TTest {

    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();
        myTimer.schedule(myTask, 1000, 500);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            //TODO: handle exception
        }
        myTimer.cancel();
    }
}