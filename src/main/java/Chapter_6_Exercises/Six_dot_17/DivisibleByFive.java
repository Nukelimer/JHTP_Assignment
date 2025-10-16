package Chapter_6_Exercises.Six_dot_17;

import java.util.Scanner;

public class DivisibleByFive {
    /*(Divisible by 5) Write a method isDivisible that uses the remainder operator (%) to deter-
    mine whether ten input integers are divisible by 5 or not. The method should take an integer argu-
    ment and return true if the integer is divisible by 5 and false otherwise. Incorporate this method
    into an application that inputs a sequence of integers (one at a time) and determines the result.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {

            System.out.print("Enter any numerical number to compare if it is divisible by 5: ");
            int number = scanner.nextInt();
            isDivisible(number);


        }
    }

    public static boolean isDivisible(int number) {


            if (number % 5 == 0) {
                System.out.println(number + " is divisible by 5.");
                return true;
            } else {
                System.out.println(number + " is not divisible by 5.");
                return false;


    }

}}
