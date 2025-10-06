package Chapter_5_Exercises.Five_dot_11;

import java.util.Scanner;

public class ExtremesBetweenTwoNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbersCount = 0;


        boolean isValidNumber = true;

       while (isValidNumber){
        System.out.print("What is the numbers of number you want to enter: ");
        numberOfNumbersCount = scanner.nextInt();

       if (numberOfNumbersCount > 1){
         isValidNumber = false;

       }


       }

        System.out.print("First Number: ");
        int usersEntry = scanner.nextInt();

        int smallest = usersEntry;
        int biggest = usersEntry;


        int  count = 1;

        while (count < numberOfNumbersCount){
            count++;
            System.out.print("Enter number " + count + ": ");
            usersEntry = scanner.nextInt();

            if (usersEntry > biggest){
                biggest = usersEntry;
            }

            if (usersEntry < smallest){

                smallest = usersEntry;
            }


        }

            int total = smallest + biggest;

            System.out.println("Largest: " + biggest);
            System.out.println("Small: " + smallest);
            System.out.println("total: " + total);

    }


}
