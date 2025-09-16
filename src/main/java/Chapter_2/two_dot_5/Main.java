package Chapter_2.two_dot_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        (A)
//        THIS PROGRAM WILL CALCULATE THE PRODUCT OF THREE INTEGERS.
//        (B)
        Scanner input = new Scanner(System.in);
//        (C)
        System.out.print("Enter the first integer:");
//        (D)
        int x = input.nextInt();
//        (F)
        System.out.print("Enter the second integer:");
//        (G)
        int y = input.nextInt();
//        (H)
        System.out.print("Enter the third integer:");
        int z = input.nextInt();
//        (I)
        int result = x*y*z;

//        (J)
        System.out.printf("%s%s" , "Product is ", result );


        input.close();
    }
}
