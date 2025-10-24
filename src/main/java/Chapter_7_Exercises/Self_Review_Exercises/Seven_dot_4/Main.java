package Chapter_7_Exercises.Self_Review_Exercises.Seven_dot_4;

public class Main {

/*Perform the following tasks for an array called table:
a) Declare and create the array as an integer array that has three rows and three columns.
[int[][] threeColumnsAndRows = new int[3][3];]

Assume that the constant ARRAY_SIZE has been declared to be 3.
b) How many elements does the array contain?
[9]
c) Use a for statement to initialize each element of the array to the sum of its indices.
 Assume that the integer variables x and y are declared as control variables.



 */

    public static void main(String[] args) {


        final int ARRAY_SIZE = 3;
        int[][] threeColumnsAndRows = new int[ARRAY_SIZE][ARRAY_SIZE];

        for (int i = 0; i < threeColumnsAndRows.length; i++) {
            for (int j = 0; j < threeColumnsAndRows[i].length; j++) {
                threeColumnsAndRows[i][j] = i + j;
            }
        }


        for (int i = 0; i < threeColumnsAndRows.length; i++) {
            for (int j = 0; j < threeColumnsAndRows[i].length; j++) {
                System.out.print( threeColumnsAndRows[i][j] + " ");
            }
            System.out.println();
        }


    }

}
