package javalangDemo;
/**
 * RtimeVersion
 */
public class RtimeVersion {
     public static void main(String[] args) {
         Runtime.Version ver  = Runtime.version();
         System.out.println("Major Version: "+ ver.major());
         System.out.println("Minor Version: "+ ver.minor());
         System.out.println("Security version: "+ver.security());
     }
    
}