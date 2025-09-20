package Chapter_2_Exercises.two_dot_26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter first number: ");
        int number2 = scanner.nextInt();

        if ((number1 * 3) % (number2 * 2) == 0){
            System.out.println("boom");
        }

    }
}
