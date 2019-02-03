package project_euler;

import java.util.*;
/**
 * SumMultiples
 */

public class SumMultiples {
    public static void main(String[] args) {
       int sum5 = calcMultipleSum(5, 999, 1);
       int sum3 = calcMultipleSum(3, 999, 1);
       int sum15 = calcMultipleSum(15, 999, 1);
       int total = sum3 + sum5 - sum15;
       System.out.println(sum3+" "+sum5+" "+sum15);
       System.out.println("Result is "+total);
    }

    public static int calcMultipleSum(int multiple, int end, int start) {
        int[] startAndEndArr = getStartAndEnd(multiple, start, end);
        int noOfMultiples = 1  + (startAndEndArr[1] - startAndEndArr[0])/multiple;
        System.out.println(noOfMultiples+" "+startAndEndArr[1]+" "+startAndEndArr[0]);
        int ans = (int) (Double.valueOf(noOfMultiples)/2.0 * (Double.valueOf(startAndEndArr[1])+Double.valueOf(startAndEndArr[0])));
        return ans;
    }

    public static int[] getStartAndEnd(int multiple, int start, int end) {
        int[] intArr = new int[2];
        double min = Double.valueOf(start)/Double.valueOf(multiple);
        intArr[0] = (int) (Math.ceil(min) * Double.valueOf(multiple));
        intArr[1] = Math.floorDiv(end,multiple)*multiple;
        System.out.println(Arrays.toString(intArr));
        return intArr;
    }
      
}