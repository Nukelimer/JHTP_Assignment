package Chapter_7_Exercises.Playground.Seven_dot_5;

import java.util.Arrays;

public class SummingTheElementsOfAnArray {

    public static void main(String[] args) {

        final Integer ARRAY_LENGTH = 20;
        int[] array = {2,1,43,7,8,7,1,92};

        int sum = 0;

        for (int i = 0; i < array.length ; i++) {
           sum += array[i];
        }

        System.out.printf("Sum of array elements: %d%n", sum);

    }
}
