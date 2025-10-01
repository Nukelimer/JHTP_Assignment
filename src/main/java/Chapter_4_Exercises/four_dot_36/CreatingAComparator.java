package Chapter_4_Exercises.four_dot_36;

import java.util.Scanner;

public class CreatingAComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber =scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber =scanner.nextInt();


        if (firstNumber == secondNumber){

            System.out.println(0);
            System.out.println(firstNumber + " " + secondNumber);

        } else if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " " + secondNumber);
            System.out.println(1);
        } else {

            System.out.println(1);
            System.out.println(firstNumber + " " + secondNumber);

        }

    }
}
