package Chapter_6_Exercises.Six_dot_14;

import java.util.Scanner;

public class Custom_Floor_And_Ceil {

/*(Floor and Ceil) Write two methods myFloor and myCeil that take a positive double num
variable int myFloor(double num) and int myCeil(double num).
The myFloor method takes num and returns the largest integer number that is less than or equal to x.
The myCeil function takes num and finds the smallest number that is greater than or equal to x. Do
not use any Math class methods. Incorporate this method into an application that sends a double
value to the functions and tests their ability to calculate the required output.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number that is an double: ");
        double userNum = scanner.nextDouble();

        System.out.printf("Ceil: %d%n", myCeil(userNum));
        System.out.printf("Floor: %d", myFloor(userNum));

    }

    private static int myCeil( double number){

        double result;
        if (number != (int) number){
            result = number + 1;
        } else {
            result = number;
        }
        return (int) result;
    }

    private static int myFloor( double number){

        int result = (int) number;
        return result;
    }
}
