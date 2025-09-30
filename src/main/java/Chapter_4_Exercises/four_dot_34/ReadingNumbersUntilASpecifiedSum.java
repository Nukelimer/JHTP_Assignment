package Chapter_4_Exercises.four_dot_34;

import java.util.Scanner;

public class ReadingNumbersUntilASpecifiedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total Sum of numbers: ");
        int overallTarget = scanner.nextInt();
        int total = 0;


        int newNumber;
        while (total <= overallTarget) {

            System.out.print("Enter a number:");
            newNumber = scanner.nextInt();

            total += newNumber;

        }

        System.out.println(total);


    }
}
