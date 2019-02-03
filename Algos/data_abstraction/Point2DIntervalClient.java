package Algos.data_abstraction;

import java.util.HashSet;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdDraw;;
import java.util.HashMap;
class Point2DIntervalClient {
    static HashMap<Interval2D, Interval1D[]> intervalDict = new HashMap<Interval2D, Interval1D[]>();
    public static void main(String[] args) {
        int n;
        double min;
        double max;

        try {
            if (args.length != 3) {
                throw new RuntimeException("Error improper usage: correct example usage -> Point2DIntervalClient 2 1 2"); 
            }
            n = Integer.parseInt(args[0]);
            min = Double.parseDouble(args[1]);
            max = Double.parseDouble(args[2]);
            if(!(min < max)){
                throw new RuntimeException("Error min: " + min + " has to be less than max: " + max); 

            }

        } catch (NumberFormatException e) {
            //TODO: handle exception
            System.out.println("Please enter a valid integer and double: "+e.getMessage());
            return;
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
            return;
        }
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setPenRadius(0.05);
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        Interval2D[] twoDArr = new Interval2D[n];
        HashSet<HashSet<Interval2D>> noOfIntersectionsPairs = new HashSet<HashSet<Interval2D>>();
        HashSet<HashSet<Interval2D>> noOfPairsContained = new HashSet<HashSet<Interval2D>>();
        for (int i = 0; i < n; i++) {
            double width[] = {StdRandom.uniform(min, max), StdRandom.uniform(min, max)};
            double height[] =  {StdRandom.uniform(min, max), StdRandom.uniform(min, max)};
            Interval1D widthOneD = new Interval1D(Math.min(width[0], width[1]), Math.max(width[0], width[1]));
            Interval1D heightOneD = new Interval1D(Math.min(height[0], height[1]), Math.max(height[0], height[1]));
            Interval2D twoDIntervalElem = new Interval2D(widthOneD, heightOneD);
            twoDArr[i] = twoDIntervalElem;
            intervalDict.put(twoDIntervalElem, new Interval1D[]{widthOneD, heightOneD});
        }
        
        for (int i = 0; i < twoDArr.length; i++) {
           twoDArr[i].draw();
           for (int j = 0; j < twoDArr.length; j++) {
               if (twoDArr[i] != twoDArr[j] && twoDArr[i].intersects(twoDArr[j]) ) {
                   HashSet<Interval2D> pairSet = new HashSet<Interval2D>();
                   pairSet.add(twoDArr[i]);
                   pairSet.add(twoDArr[j]);
                   noOfIntersectionsPairs.add(pairSet);
               }
               if (twoDArr[i] != twoDArr[j] && checkContain(twoDArr[i], twoDArr[j]) ) {
                HashSet<Interval2D> pairSetContains = new HashSet<Interval2D>();
                pairSetContains.add(twoDArr[i]);
                pairSetContains.add(twoDArr[j]);
                noOfPairsContained.add(pairSetContains);
                }
            }
        }
        
        System.out.println("The number of intersections "+noOfIntersectionsPairs.size());
        System.out.println("The number of contains "+noOfPairsContained.size());

       
    }
    
    static boolean checkContain( Interval2D firstInterval2d,  Interval2D secondInterval2d){

        Interval1D[] fInterval1ds = intervalDict.get(firstInterval2d);
        Interval1D[] sInterval1ds = intervalDict.get(secondInterval2d);
        if (
            (
                fInterval1ds[0].min() > sInterval1ds[0].min() && 
                fInterval1ds[0].max() < sInterval1ds[0].max() &&
                fInterval1ds[1].max() < sInterval1ds[1].max() &&
                fInterval1ds[1].min() > sInterval1ds[1].min()

            ) || (
                fInterval1ds[0].min() < sInterval1ds[0].min() && 
                fInterval1ds[0].max() > sInterval1ds[0].max() &&
                fInterval1ds[1].max() > sInterval1ds[1].max() &&
                fInterval1ds[1].min() < sInterval1ds[1].min()
            )

        ) {
            return true;
            
        }
        return false;

        
    }
}