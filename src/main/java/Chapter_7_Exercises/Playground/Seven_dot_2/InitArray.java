package Chapter_7_Exercises.Playground.Seven_dot_2;

import java.util.Arrays;
import java.util.Random;

public class InitArray {

    public static void main(String[] args) {
        int[] newArray = new int[10];


        System.out.printf("%2s %12s%n", "Index", "Value");

        for (int i = 0; i < newArray.length; i++) {

            newArray[i] = i*2;
            System.out.printf("%3d %12s %n", i , newArray[i]);
        }
    }
}
