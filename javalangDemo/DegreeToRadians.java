package javalangDemo;
/**
 * DegreeToRadians
 */
public class DegreeToRadians {

    public static void main(String[] args) {
        double theta = 120.0;
        double radTheta = Math.toRadians(theta);
        System.out.println("Theta 120 degrees to radians is: "+radTheta );
        theta =1.312;
        System.out.println(theta+" rads to degress "+ Math.toDegrees(theta));
    }
}