package Chapter_7_Exercises.Playground.Seven_dot_4;

import java.util.Arrays;

public class InitArrayAndCalcValueStoredIn {

    public static void main(String[] args) {


       final int ARRAY_LENGTH = 10;
        int[] arrayEvenNum =new int[ARRAY_LENGTH];

        for (int i = 0; i < arrayEvenNum.length ; i++) {
           arrayEvenNum[i] =  (2) + 2 * i;
        }

        System.out.printf("%5s%15s%n", "Index", "Value");

        for (int i = 0; i < arrayEvenNum.length; i++){
            System.out.printf("%5d%15s%n",i+1, arrayEvenNum[i] );

        }

     }
}
