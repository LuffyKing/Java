package javalangDemo;
/**
 * infandnan
 */
public class InfAndNan {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(1/0.);
        Double d2 = Double.valueOf(0/0.);
        System.out.println("Infinite:- "+d1.isInfinite()+" "+d2.isInfinite());
        System.out.println("Nan:- "+d1.isNaN()+" "+d2.isNaN());
    }
    
}