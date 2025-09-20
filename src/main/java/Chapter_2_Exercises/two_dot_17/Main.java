package Chapter_2_Exercises.two_dot_17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first Int: ");
        int userInput1 = scanner.nextInt();
        System.out.print("Enter second Int: ");
        int userInput2 = scanner.nextInt();
        System.out.print("Enter third Int: ");
        int userInput3 = scanner.nextInt();


        int totalSum = userInput1 + userInput2 + userInput3;


        int totalAverage = (userInput1 + userInput2 + userInput3) / 3;


        int totalProduct = userInput1 * userInput2 * userInput3;


        int biggestNumber = Math.max(userInput1, Math.max(userInput2, userInput3));

        int smallestNumber = Math.min(userInput1, Math.min(userInput2, userInput3));

        System.out.printf(" Sum %d%n", totalSum);
        System.out.printf(" Average %d%n", totalAverage);
        System.out.printf(" Product %d%n", totalProduct);
        System.out.printf(" Min Number %d%n", smallestNumber);
        System.out.printf(" Max Number %d%n", biggestNumber);




        int[] numbers = new int[3];





        scanner.close();


    }
}
