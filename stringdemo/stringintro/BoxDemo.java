package stringintro;
/**
 * BoxDemo
 */
public class BoxDemo {

    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Box b: "+b;
        System.out.println(b);
        System.out.println(s);
    }
}
/**
 * Box
 */
class Box {

    double width;
    double height;
    double depth;
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    public String toString(){
        return "The Dimensions are "+ width +" by " + depth+" by "+
        height+"."; 
    }
}