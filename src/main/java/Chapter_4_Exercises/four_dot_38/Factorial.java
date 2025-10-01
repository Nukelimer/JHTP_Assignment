package Chapter_4_Exercises.four_dot_38;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to get its factorial: ");
        double factorial = scanner.nextDouble();
         double factorialTotal = 1;
        while (factorial > 0){
        factorialTotal = factorialTotal * factorial;
        factorial--;

        }

        System.out.println(factorialTotal);



    }
}
