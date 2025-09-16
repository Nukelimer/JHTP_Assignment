package Chapter_2.two_dot_16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number of your choice: ");
        int userInput = scanner.nextInt();

        int checkerNumber = 100;

        if (userInput > checkerNumber ){
            System.out.printf("%d > %d%n", checkerNumber, userInput);
        }

        if (userInput  == checkerNumber ){
            System.out.printf("%d == %d%n", checkerNumber, userInput);
        }

        if (userInput  != checkerNumber ){
            System.out.printf("%d != %d%n", checkerNumber, userInput);
        }

        if (userInput  < checkerNumber ){
            System.out.printf("%d < %d%n", checkerNumber, userInput);
        }





        scanner.close();
    }
}
