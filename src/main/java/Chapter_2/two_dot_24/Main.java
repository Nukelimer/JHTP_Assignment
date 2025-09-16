package Chapter_2.two_dot_24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest;
        int smallest;
        System.out.print("number 1:");
        int number1 = scanner.nextInt();
        System.out.print("number 2:");
        int number2 = scanner.nextInt();
        System.out.print("number 3:");
        int number3 = scanner.nextInt();
        System.out.print("number 4:");
        int number4 = scanner.nextInt();
        System.out.print("number 5:");
        int number5 = scanner.nextInt();

        largest = number1;
        smallest = number1;

        if (number2 > largest){
          largest = number2 ;

        }

        if (number2 < smallest){
            smallest = number2;
        }
        if (number3 > largest){
           largest = number3 ;

        }
        if (number3 < smallest){
            smallest = number3;
        }
        if (number4 > largest){
          largest = number4;

        }
        if (number4 <smallest){
            smallest = number4;
        }
        if (number5 > largest){
            largest = number5;

        }
        if (number5 < smallest){
            smallest = number5;

        }



        System.out.printf("The largest %d, and the smallest %d%n", largest, smallest);






    }
}
