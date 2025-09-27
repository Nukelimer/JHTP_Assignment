package Chapter_4_Exercises.four_dot_23;

import java.util.Scanner;

public class TwoLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 2;

        System.out.print("Enter first number: ");
        int startingBiggestNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int startingSecondBiggestNumber = scanner.nextInt();

        int largest, secondLargest;

        if (startingBiggestNumber > startingSecondBiggestNumber){

            largest = startingBiggestNumber;
            secondLargest = startingSecondBiggestNumber;

        }else {

            secondLargest = startingBiggestNumber;
          largest = startingSecondBiggestNumber;
        }


        while ( counter < 10){
            counter++;
            System.out.println("Enter number " + counter + ":");
           int number = scanner.nextInt();


                if (number > largest){
                    secondLargest = largest;
                    largest = number;

                }else if (number > secondLargest){
                secondLargest = number;

            }


        }

        System.out.println(largest + "largest");
        System.out.println(secondLargest + "smallest");
    }
}
