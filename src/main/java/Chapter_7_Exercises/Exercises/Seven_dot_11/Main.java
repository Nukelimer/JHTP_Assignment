package Chapter_7_Exercises.Exercises.Seven_dot_11;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final Random random = new Random();
    public static void main(String[] args) {

/*Write statements that perform the following one-dimensional-array operations:
a) Set elements of index 10–20, both inclusive, of integer array counts to zero.
b) Multiply each of the twenty elements of integer array bonus by 2.*/

        int [] array = new int[100];
        populateArrayWithValue(array, 200);
        System.out.println(Arrays.toString(array));
        for (int i = 10; i <= 20; i++) {
            array[i] = 0;

        }


        int[] bonus = new int[20];
        populateArrayWithValue(bonus, 200);

        System.out.println(Arrays.toString(bonus));

        for (int i = 0; i < bonus.length; i++) {
          bonus[i] = bonus[i] * 2;
        }
        
        
        System.out.println(Arrays.toString(bonus));


        int[] bestScores = new int[10];
        populateArrayWithValue(bestScores, 20);
        for (int bestScore : bestScores) {
            System.out.println(bestScore);
        }


    }

    private static void populateArrayWithValue(int[] rawArray, int bound){
        for (int i = 0; i < rawArray.length; i++) {
            rawArray[i] = 1 + random.nextInt(bound);
        }
    }

}


