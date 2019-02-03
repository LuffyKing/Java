package Algos.data_abstraction;
import edu.princeton.cs.algs4.Interval1D;


class Point1dIntervalClient {
    public static void main(String[] args) {
        int lengthOfPairs;
        Interval1D[] oneDArr;
        try {
            
            if (!(args.length > 1)) {
                throw new RuntimeException("Error improper usage: correct example usage -> Point1dIntervalClient 2 0.1,9.0 6.0,4.0 ");
            }
            lengthOfPairs = Integer.parseInt(args[0]);
            
            if (lengthOfPairs  != args.length-1) {
                throw new RuntimeException("Error improper usage: the number of pairs must match the first value "+lengthOfPairs);
            }
            oneDArr = new Interval1D[lengthOfPairs];
            
            for (int i = 1; i < args.length; i++) {
                if (args[i].contains(",")) {
                   String[] arrOfSplitStringPairs = args[i].split(",");
                   if (arrOfSplitStringPairs.length > 2) {
                    throw new RuntimeException("Pair of doubles format error: the pairs of doubles must contain only two doubles! ");
                   }
                   double min = Double.parseDouble(arrOfSplitStringPairs[0]);
                   double max = Double.parseDouble(arrOfSplitStringPairs[1]);
                   if (max > min) {
                    oneDArr[i-1] = new Interval1D(min, max);

                   } else {
                    throw new RuntimeException("Pair of doubles format error: the first double must be greater than the second double");
                   }

                }
                else{
                    throw new RuntimeException("Pair of doubles format error: the pairs of doubles must be seperated by a ',' ");

                }
            }
        
        } catch (NumberFormatException e) {
            //TODO: handle exception
            System.out.println("Please enter a valid integer or double "+ e.getMessage());
            return;
        } 
        
        
        catch (RuntimeException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
            return;
        }
        for (int i = 0; i < oneDArr.length ; i++) {
            for (int j = 0; j < oneDArr.length ; j++) {
                if (oneDArr[i] != oneDArr[j] && (oneDArr[i].intersects(oneDArr[j])) ) {

                    System.out.println(oneDArr[i]+" "+ oneDArr[j]);
                }
            }
        }
         
    }
}