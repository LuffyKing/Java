package Algos.data_abstraction;
import edu.princeton.cs.algs4.StdDraw;
public class VisualCounter {
    private int absoluteMax;
    private int maxNoOperations;
    private int tally;
    private int opCount;
    private String name;

    VisualCounter(int N, int max, String id){
        absoluteMax = max;
        maxNoOperations = N;
        tally = 0;
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(0.0, N+1);
        StdDraw.setYscale(0.0, absoluteMax);
        StdDraw.setPenRadius(0.020);
        name = id;
    }

    public void increment(){
        if ((tally + 1 <= absoluteMax) && (opCount + 1 <= maxNoOperations)) {
            tally++;
            System.out.println(tally);
            opCount++;
            StdDraw.point(opCount, tally);
        }
        else{
            if (tally + 1 > absoluteMax) {
                System.out.println("Max value " + absoluteMax +" for tally reached");  
            }

            if (opCount + 1 > maxNoOperations) {
                System.out.println("Max number of operations "+ maxNoOperations +" reached"); 
            }
            
        }
        
    }

    public void decrement(){
        if ((tally - 1 >= 0) && (opCount + 1 <= maxNoOperations)) {
            tally--;
            opCount++;
            System.out.println(tally);
            StdDraw.point(opCount, tally);
        }
        else{
            if (tally - 1 < 0) {
                System.out.println("Min value 0 for tally reached");  
            }

            if (opCount + 1 > maxNoOperations) {
                System.out.println("Max number of operations "+maxNoOperations+" reached"); 
            }
            
        }
        
    }

    public String toString(){
        return tally+" "+name+" "+opCount+" operations";
    }

}