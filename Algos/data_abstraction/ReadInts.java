package Algos.data_abstraction;
import java.util.ArrayList;
import java.util.List;
/**
 * ReadInts
 */
public class ReadInts {

    public static int[] readInts(String arg){
       String argArr[] = arg.split("\\D"); 
       ArrayList<Integer> ansArr = new ArrayList<Integer>();
       for (int i = 0; i < argArr.length; i++) {
           try {
            ansArr.add(Integer.parseInt(argArr[i]));
           } catch (NumberFormatException e) {
               //TODO: handle exception
           }
                  
       }
       List<Integer> nList = ansArr;
       int[] intArr = nList.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        return intArr;
    }
}