/**
 * Average
 */
class Average {
    public static void main( String args[]) {
        double[] doubleArgsList = {20.5, 60.5, 70.5};
        double total = 0;
        for (double arg : doubleArgsList) {
            total += arg;
        }
        System.out.println( total / doubleArgsList.length) ;
    }
    
}