package Chapter_7_Exercises.Playground;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[2];
        array[1] = 3;
        array[0] = 22;
        int a[] = new int[100];
//        System.out.println(Arrays.toString(array));

        boolean [] booleans = new boolean[3];

//        System.out.println(Arrays.toString(a));

        int[] numbers = {1, 2, 3, 4, 5};
        int[][] number = {{1, 2, 3, 4, 5}, {2,4,2,1,6,5}};

        for (int numb: number[1]){
            System.out.println(numb);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;   // ✅ modify each element
        }
//        System.out.println(Arrays.toString(numbers));




























    }

}
