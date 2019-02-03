package InterfacePrac;
import java.util.Random;
/**
 * ConstInt
 */
public interface ConstInt {

    int NO = 1;
    int YES = 2;
    int MAYBE =3;
    int LATER = 4;
    int SOON = 5;
    int NEVER = 6;
}
class Question implements ConstInt{
    Random rand = new Random();
    int ask(){
        int prob  = (int) (100* rand.nextDouble());
        if (prob < 30) {
            return NO;
        } else if(prob<60){
            return YES;
        } else if(prob<75){
            return MAYBE;
        } else if(prob<98){
            return SOON;
        } else{
            return NEVER;
        }
    }
}