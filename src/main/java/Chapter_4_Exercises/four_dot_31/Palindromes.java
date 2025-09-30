package Chapter_4_Exercises.four_dot_31;

import java.util.Scanner;

public class Palindromes {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;

        while(number < 10000 || number > 99999){
            System.out.println(" Enter a five-digit integer:");
            number = input.nextInt();

            if (number < 10000 || number > 99999){
                System.out.println("Error: Number must be exact");
            }




        }

        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;


        if (digit1 == digit5 && digit2 == digit4){
            System.out.println(number + " is a palindrome!");
        } else {

            System.out.println(number + " is NOT a palidrome!");
        }
    }
}
