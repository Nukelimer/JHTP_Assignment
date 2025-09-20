package Chapter_4_Exercises.Playground;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int counter =1;


        while (counter <= 10){
            System.out.println("Hello, enter the next grade: ");
            int grade = scanner.nextInt();

            total = total + grade;
            counter = counter + 1;

        }

            int average = total / 10;
            System.out.printf("%n Total of all  10 grades is %d%n", total);
            System.out.printf("The average is %d%n", average);
    }
}
