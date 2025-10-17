package Chapter_6_Exercises.Six_dot_23;

import java.util.Scanner;

public class Palindrome_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number let's check if it's a palindrome: ");
        int userEnteredNumber = scanner.nextInt();

        palindromeNumber(userEnteredNumber);

    }

    public  static boolean palindromeNumber(int numberToCheck){
        int reversed = 0;
        int temporalNumber = numberToCheck;

        while (temporalNumber != 0){
            int lastDigit = temporalNumber % 10;
            reversed = reversed * 10 + lastDigit;
            temporalNumber /= 10;
        }

        if (reversed == numberToCheck){
            System.out.printf("It is a number palindrome because %n You enter:%d%n R. Version: %d%n",
                    numberToCheck, reversed);
        return  true;

        } else {
            System.out.printf("It is not a number palindrome because %n You enter:%d%n R. Version: %d%n",
                    numberToCheck, reversed);
            return  false;
        }
    }
}
