package Chapter_6_Exercises.Six_dot_16;

import java.util.Scanner;

public class MultiplesChecker {
/*(Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
second integer is a multiple of the first. The method should take two integer arguments and return
true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.]
Incorporate this method into an application that inputs a series of pairs of integers (one pair at a
time) and determines whether the second value in each pair is a multiple of the first.*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
       while (isRunning){

           System.out.print("Enter the first number or -1 to exit: ");
           int firstNumber = scanner.nextInt();


           if (firstNumber == 0){
               System.out.println("you cannot perform this operation with 0");
               continue;
           }
           if (firstNumber == -1){
               break;

           }
           System.out.print("Enter the second number -1 to exit: ");
           int secondNumber = scanner.nextInt();
           if (secondNumber == 0){
               System.out.println("you cannot perform this operation with 0");
               continue;
           }
           if ( secondNumber == -1){
               break;

           }
           System.out.println(isMultiple(firstNumber, secondNumber));
       }
    }

    public static boolean isMultiple(int firstNum, int secondNum){

        boolean isMultiple;
        if ( secondNum % firstNum  == 0){
            isMultiple = true;
        } else {
            isMultiple = false;
        }

        return isMultiple;
    }
}
