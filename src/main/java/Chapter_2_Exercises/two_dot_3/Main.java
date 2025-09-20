package Chapter_2_Exercises.two_dot_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        A
        int c = 0;
        int thisIsAVariable = 0;
        int q76354, number = 0;

//        B
        Scanner  userInput = new Scanner(System.in);
        System.out.print(" Enter a number ");
//        C
        int value = userInput.nextInt();

//        D
        System.out.println("This is a Java program.");
//        E
        System.out.println("This is a Java \n program");
        System.out.printf("%s%n%s", "This is a Java", "program ");
        System.out.println();
        System.out.println();

//        F

        if (number != 7){

            System.out.println("The variable number is not equal to 7.");
        }


        userInput.close();

    }
}
