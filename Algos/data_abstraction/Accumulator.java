package Algos.data_abstraction;
import edu.princeton.cs.algs4.*;
/**
 * Accumulator
 */
public class Accumulator {

    private double m;
    private double s;
    private int N;
    public void addDataValue(double x) {
		N++;
		s = s + 1.0 * (N-1) / N * (x - m) * (x - m);
		m = m + (x - m) / N;
	}
	
	public double mean() {
		return m;
	}
	
	public double var() {
		return s / (N - 1);
	}
	
	public double stddev() {
		return Math.sqrt(this.var());
}
    public static void main(String[] args) {
		//Code validation
		Accumulator validation = new Accumulator();
        validation.addDataValue(2);
        StdOut.println("Variance: " + validation.var() + " Expected:  2.333333333333333");
        validation.addDataValue(4);
        StdOut.println("Variance: " + validation.var() + " Expected:  2.333333333333333");
		validation.addDataValue(5);
		
		StdOut.println("Mean: " + validation.mean() + " Expected: 3.6666666666666665");
		StdOut.println("Variance: " + validation.var() + " Expected:  2.333333333333333");
		StdOut.println("Standard Deviation: " + validation.stddev() + " Expected: 1.5275252316519465");
	}

}