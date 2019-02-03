/**
 * MultiDimArrays
 */
public class MultiDimArrays {

    public static void main(String[] args) {
        String twoD[][] = new String[4][5];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = "row: " + i + ", column: " + j;
            }
        }
        for (String strRow[] : twoD) {
            for (String element : strRow) {
                System.out.println(element);
            }
            
        }
    }
}