package Algos.data_abstraction;

class CircularRotation {
    public static void main(String[] args) {
     System.out.println("Are "+args[0]+" and "+args[1] +" circular? "+ isCircular(args[0], args[1]) );

    }
    public static boolean isCircular(String str1, String str2){
        return str1.length() == str2.length() && (str1+str1).indexOf(str2) != -1;
        
    }
}