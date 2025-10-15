package Chapter_6_Exercises.Six_dot_9;

import java.util.Scanner;

public class RoundingNumberWithFloor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s", "Enter a number that is double based, i.e, 3.5, 33.01 etc: " );

        double userNumberInput = scanner.nextDouble();
        int flooredResult = (int) Math.floor(userNumberInput + 0.5);

        System.out.printf("Double that you entered: %f%nInt that was returned: %d", userNumberInput, flooredResult);



    }

}
