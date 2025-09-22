package Chapter_4_Exercises.four_dot_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

// a) Use one statement to assign the sum of x and y to z, then increment x by 1.
        int x = 1;
        int y = 1;
        int z = x + y;
        x++;
        x = x + 1;






// b) Test whether variable count is greater than 10. If it is, print "Count is greater than 10".
        System.out.println("Enter a number: ");
        int count = scanner.nextInt();



        if (count > 10){

            System.out.println("Count is greater than 10.");

        }





//        c) Use one statement to decrement the variable x by 1, then subtract it from
//        variable total and store the result in variable total.

//        int x = 5;
//
//        int total = 20;
//
//        total -= --x;
//
//        System.out.println(total);







//       d) Calculate the remainder after q is divided by divisor, and assign the result to q. Write
//        this statement in two different ways.

        int q = 20%101;
        System.out.println(q );



    }
}
