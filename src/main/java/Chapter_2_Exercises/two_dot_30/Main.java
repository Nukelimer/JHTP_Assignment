package Chapter_2_Exercises.two_dot_30;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4 different numbers between 1000 and 9999:  ");
       int  userNumber = scanner.nextInt();
        printSpacedNumber(userNumber);
    }

    public static void printSpacedNumber(int number) {

        if (number/10 > 0){
            printSpacedNumber(number/10);


        }
        System.out.printf("%d ", number % 10);
    }
}
