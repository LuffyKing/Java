package project_euler;
/**
 * EvenFibSum
 */
public class EvenFibSum {

    public static void main(String[] args) {

        System.out.println("Sum: "+calcFibSum(Double.valueOf(args[0])).intValue());
    }
    public static Double calcFibSum(double limit){
        double currFib = 0;
        double index = 0;
        double sumTotal = 0;
        while (currFib < limit) {
            
            System.out.println(currFib+" "+currFib %2);
            if(currFib % 2 == 0){
                sumTotal += currFib; 
            }
            index++;
            currFib = Math.floor(getFibNum(index));
        }
        return sumTotal;  
    }

    public static double getFibNum(double index){
        double phiPos = (1+Math.pow(5.0, 0.5))/2;
        double phiNeg = (1-Math.pow(5.0, 0.5))/2;
        return 1.0/Math.pow(5.0, 0.5)*(Math.pow(phiPos, index)-Math.pow(phiNeg, index));
    }
}