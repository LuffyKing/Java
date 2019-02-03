package InterfacePrac;
import InterfacePrac.ConstInt;;
/**
 * TestConstInt
 */
public class TestConstInt {

    public static void main(String[] args) {
        Question question = new Question();
        for (int i = 0; i < 10; i++) {
            System.out.println(question.ask());
        }
    }
}