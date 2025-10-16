package Chapter_6_Exercises.Six_dot_18;

import java.util.Scanner;

public class SquareOfAsterisks {
/*(Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
square (the same number of rows and columns) of asterisks whose side is specified in integer param-
eter side. For example, if side is 4, the method should display Incorporate this method into an application that reads an integer value for side from the user and
outputs the asterisks with the squareOfAsterisks method.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any numerical number displays a solid " +
                "square: ");
        int number = scanner.nextInt();
        squareOfAsterisks(number);
    }

    private static void squareOfAsterisks(int number){

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number; j++) {
                System.out.print(" * ");
            }
                System.out.println();
        }
    }
}
