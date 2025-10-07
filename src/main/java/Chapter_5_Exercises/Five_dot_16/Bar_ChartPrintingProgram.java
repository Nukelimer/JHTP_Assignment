package Chapter_5_Exercises.Five_dot_16;

import java.util.Scanner;

public class Bar_ChartPrintingProgram {
    public static void main(String[] args) {

        /*
     (Bar-Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks. For example, if your program reads the number 7, it should display *******. Display the bars of asterisks after
you read all five numbers.

*/

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;

        Scanner scanner = new Scanner(System.in);
        int userEnteredNumber;

        for (int count = 1; count <=5; count++){
        System.out.print("Enter a number between 1 - 30:");
        userEnteredNumber = scanner.nextInt();

        if (userEnteredNumber < 1 || userEnteredNumber > 30 ){
            System.out.println("Invalid entry. Please enter a number between 1 and 30.");
           count--;
           continue;
        }
        if (count == 1){
            num1 = userEnteredNumber;

        } else if (count == 2) {
            num2 = userEnteredNumber;
        } else if (count == 3) {
            num3 = userEnteredNumber;
        } else if (count == 4) {
            num4 = userEnteredNumber;
        } else {

            num5 = userEnteredNumber;

        }

        }
            System.out.println("\nBar Chart:");

            for (int i = 1; i <= num1; i++) System.out.print("*");
            System.out.println();

            for (int i = 1; i <= num2; i++) System.out.print("*");
            System.out.println();

            for (int i = 1; i <= num3; i++) System.out.print("*");
            System.out.println();

            for (int i = 1; i <= num4; i++) System.out.print("*");
            System.out.println();

            for (int i = 1; i <= num5; i++) System.out.print("*");
            System.out.println();
    }
}
