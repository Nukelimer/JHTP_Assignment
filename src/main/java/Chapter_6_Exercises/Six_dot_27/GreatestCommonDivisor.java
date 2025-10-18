package Chapter_6_Exercises.Six_dot_27;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();


        int result = gcd(firstNumber, secondNumber);


        System.out.printf("The GCD of %d and %d is %d.%n", firstNumber, secondNumber, result);

    }

    private  static int gcd(int a, int b ){

        while (b != 0){
           int remainder = a % b;
           a = b;
           b = remainder;
        }
        return a;
    }
}
