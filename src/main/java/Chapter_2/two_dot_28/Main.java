package Chapter_2.two_dot_28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to calculate Diameter, Circumference and Area of a Circle:");
        int userNumber = scanner.nextInt();



        System.out.printf("%s%f%n%s%f%n%s%f", "Diameter:", 2 * userNumber,
                "Circumference:", 2 * Math.PI * userNumber,"Area: ", Math.PI * userNumber * userNumber );


    }
}
