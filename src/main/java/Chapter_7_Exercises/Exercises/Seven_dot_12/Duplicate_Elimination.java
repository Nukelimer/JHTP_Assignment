package Chapter_7_Exercises.Exercises.Seven_dot_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_Elimination {

/*(Duplicate Elimination) Use a one-dimensional array to solve the following problem:
Write an application that inputs ten numbers, each between 10 and 100, both inclusive. Save
each number that was read in an array that was initialized to a value of -1 for all elements. Assume
a value of -1 indicates an array element is empty. You are then to process the array, and remove
duplicate elements from the array containing the numbers you input. Display the contents of the
array to demonstrate that the duplicate input values were actually removed. [Note: do not display
the array elements where the value is -1.]*/
    public static void main(String[] args) {

         int [][] table = new int[5][6];

        for (int col = 0; col < 6; col++)
        {
            for (int row = 0; row < 5; row++)
            {
                table[row][col] = 0;
            }
        }


        Scanner scanner = new Scanner(System.in);

        int[] arrayVal = new int[10];
        initArray(arrayVal, -1);

        for (int i = 0; i <arrayVal.length ; i++) {
            System.out.print("Enter a number between 10 - 100:   ");
            int userNumber = scanner.nextInt();
            if (userNumber < 10 || userNumber > 100){
                i--;
                System.out.println("Number out of the range try again!");
            }
            arrayVal[i] = userNumber;


        }

        System.out.println(Arrays.toString(arrayVal));

     int  uniqueCount = 0;


        
        for (int i = 0; i < arrayVal.length; i++){
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (arrayVal[i] == arrayVal[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                arrayVal[uniqueCount] = arrayVal[i];
                uniqueCount++;
            }


        }

        int[] uniqueArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueArray[i] = arrayVal[i];
        }
        System.out.println(Arrays.toString(uniqueArray));




        
        
        
        
        
        
        
        
        
        
        
    }

    private static void initArray( int[] array, int val ) {
        Arrays.fill(array, val);
    }





}
