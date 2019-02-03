package Algos.introduction;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
import Algos.introduction.Counter;
class BinarySearch {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage /filepath/to/database.txt searchTerm");
            return;
        }

        int i;
        Scanner scan;
        int searchTerm = 0;
        ArrayList<Integer> intList = new ArrayList<Integer>();
        try(FileInputStream fin = new FileInputStream(args[0])) {
            scan = new Scanner(args[1]);
            if (scan.hasNextInt()) {
                searchTerm = scan.nextInt();
                scan.close();
                scan = new Scanner(fin);
            
                while(scan.hasNextInt()){
                    intList.add(scan.nextInt());
                }
                scan.close();
            }
            else{
                System.out.println("Argument 2 has to be an integer");
                return;
            }
            
            
            
        } catch (FileNotFoundException e) {
            //TODO: handle exception
            System.out.println("File not found: "+e.getMessage());
            return;
        } catch(IOException e){
            System.out.println("File access error: "+e);
        }
        Integer[] intArr = new Integer[intList.size()];
        intArr = intList.toArray(intArr);
        Counter c = new Counter("keys examined");
        String result = binSearch(intArr, searchTerm, c);
        System.out.println(result);
    }
    public static String binSearch(Integer[] intArr, int searchTerm, Counter keysExaminedCounter){
        int high = intArr.length - 1;
        int low = 0;
       
        Arrays.sort(intArr);
        while (low < high) {
            int mid = (low + high)/2;
            if(intArr[mid] > searchTerm){
               high= mid-1;
               keysExaminedCounter.increment();
            } else if (intArr[mid] < searchTerm) {
                low = mid+1;
                keysExaminedCounter.increment();
            } else if(intArr[mid] == searchTerm) {
                keysExaminedCounter.increment();
                return String.format("%d was found at %d, %s.",intArr[mid], mid, keysExaminedCounter);
                
            }
        
        }
        return String.format("%d was not found, %s.", searchTerm, keysExaminedCounter);
    }
}