class FactorialClass{

    public static int calcFactorial(int start) {
        if(start == 1){
            return 1;
        }
        return start * calcFactorial(start - 1);
    }
}
/**
 * Factorial
 */
public class Factorial {
    
    public static void main(String[] args) {
        int firstArg = Integer.parseInt(args[0]);
        System.out.println("Factorial of "+ args[0] + " is: " + FactorialClass.calcFactorial(firstArg));
    }
}