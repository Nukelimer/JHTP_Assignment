package Chapter_5_Exercises.Five_dot_10;

import java.util.Scanner;

public class Five_dot_10 {

    public static void main( String[] args ) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 5; j++)
                System.out.print('*');
            System.out.println("\n#####");
        } // end outer for loop
    }
}
