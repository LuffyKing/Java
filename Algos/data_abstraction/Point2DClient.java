package Algos.data_abstraction;
import java.util.ArrayList;
import edu.princeton.cs.algs4.*;
class Point2DClient {
    public static void main(String[] args) {
        int n = 0;
        
        try {
            if (args.length  != 1) {
                throw new RuntimeException("Error improper usage: correct example usage -> Point2DClient 90");
            } 
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            //TODO: handle exception
            System.out.println("Please enter an integer! "+ e.getMessage());
            return;
        } 
        
        
        catch (RuntimeException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
            return;
        } 
        ArrayList<Point2D> pointArr = new ArrayList<Point2D>();
        for (int i = 0; i < n ; i++) {
            double x = Math.random();
            double y = Math.random();
            pointArr.add(new Point2D(x, y));

        }

        double min = 0;
        for (Point2D p : pointArr) {
            for (int i = 0; i < n ; i++) {
                if (p != pointArr.get(i) && (p.distanceTo(pointArr.get(i)) < min || min == 0.0) ) {
                    min = p.distanceTo(pointArr.get(i));
                }
            }
        }
        System.out.println("The distance between the two closest points is: "+ min);
    }
}