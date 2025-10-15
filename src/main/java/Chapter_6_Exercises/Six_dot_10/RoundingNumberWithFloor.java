package Chapter_6_Exercises.Six_dot_10;

import java.util.Scanner;

public class RoundingNumberWithFloor {
/*(Rounding Numbers) To round numbers to specific decimal places, use a statement like
double y = Math.floor(x * 10 + 0.5) / 10;
which rounds x to the tenths position (i.e., the first position to the right of the decimal point), or
double y = Math.floor(x * 100 + 0.5) / 100;
which rounds x to the hundredths position (i.e., the second position to the right of the decimal
point). Write an application that defines four methods for rounding a number x in various ways:
a) roundToInteger(number)
b) roundToTenths(number)
c) roundToHundredths(number)
d) roundToThousandths(number)
For each value read, your program should display the original value, the number rounded to the
nearest integer, the number rounded to the nearest tenth, the number rounded to the nearest hun-
dredth and the number rounded to the nearest thousandth.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s", "Enter a number that is double based, i.e, 3.5, 33.01 etc: " );

        double userNumberInput = scanner.nextDouble();

        roundToInteger(userNumberInput);
        roundToTenths(userNumberInput);
        roundToHundredths(userNumberInput);
        roundToThousandths(userNumberInput);

    }

    private static void roundToThousandths(double userNumberInput) {
        double y = Math.floor(userNumberInput * 1000 + 0.5) / 1000;
        System.out.printf("Your entered double value: " +
                "%f%n Rounded to 1000s result: %.3f%n", userNumberInput,  y);
    }

    private static void roundToHundredths(double userNumberInput) {
        double y = Math.floor(userNumberInput * 100 + 0.5) / 100;
        System.out.printf("Your entered double value: " +
                "%f%n Rounded to 100s result: %.2f%n", userNumberInput,  y);
    }

    private static void roundToTenths(double userNumberInput) {
        double y = Math.floor(userNumberInput * 10 + 0.5) / 10;
        System.out.printf("Your entered double value: " +
                "%f%n Rounded to 10s result: %.1f%n", userNumberInput,  y);

    }

    private static void roundToInteger(double userNumberInput) {

        double y = Math.floor(userNumberInput * 1 + 0.5) / 1;
        System.out.printf("Your entered double value: " +
                "%f%n Rounded to int result: %d%n", userNumberInput, (int) y);
    }

}
