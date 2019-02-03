package com.damola_INC.Java_WORLD.generics;
import java.io.PrintWriter;
/**
 * Stats
 */
class Stats<T extends Number> {
    T[] nums;
    Stats(T[] o){
        nums = o;
    }
    
    double getAverage(){
        double sum = 0.0;
        for (T num : nums) {
           sum += num.doubleValue();

        }
        return sum/nums.length;
    }

    static boolean isSameAverage(Stats<?> a, Stats<?> b){
        return a.getAverage() == b.getAverage();
    }

}
/**
 * StatsDemo
 */
public class StatsDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        Integer[] i = {1,2,3,4,5};
        Double[] j = {1.0,2.0,3.0};

        Stats<Integer> avg;
        Stats<Double> avgDouble;

        avg = new Stats<Integer>(i);
        pw.println("Average of the list of integers: " + avg.getAverage());
        avgDouble = new Stats<Double>(j);
        pw.println("Average of the list of floats: " + avgDouble.getAverage());
        pw.println("Comparing the avg and avgDouble.... result: "+Stats.isSameAverage(avg, avgDouble));

    }
    
}