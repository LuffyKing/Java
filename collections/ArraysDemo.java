package collections;
import java.util.*;

/**
 * ArraysDemo
 */
public class ArraysDemo {

    public static void main(String[] args) {
        int[] intArr = new int[10];
        for (int i = 0; i < 10; i++) {
            intArr[i] = i * -3;
        }
        System.out.println("Original contents: ");
        display(intArr);
        Arrays.sort(intArr);
        display(intArr);
        Arrays.fill(intArr, 2, 6, -1);
        display(intArr);
        Arrays.sort(intArr);
        display(intArr);
        System.out.println("The value of -9 is at loaction: ");
        int index = Arrays.binarySearch(intArr, -9);
        System.out.println(index);
    }
    static void display(int array[]){
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println("");
    }
}