package Chapter_4_Exercises.four_dot_21;

import java.util.Scanner;

public class LargestNumber {


//(Find the Largest Number) The process of finding the largest value is used frequently in com-
//    puter applications. For example, a program that determines the winner of a sales contest would input
//    the number of units sold by each salesperson. The salesperson who sells the most units wins the con-
//    test. Write a pseudocode program, then a Java application that inputs a series of 10 integers and deter-
//    mines and prints the largest integer. Your program should use at least the following three variables:
//    a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
//    input and to determine when all 10 numbers have been processed).
//    b) number: The integer most recently input by the user.
//    c) largest: The largest number found so far.




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int number;
        int largest = 0;

        while ( counter < 10){
            System.out.println("Enter any number: ");
          number = scanner.nextInt();
            if (number > largest){
                largest = number;
            }
           counter++;
        }

        System.out.println(largest);
    }
}
