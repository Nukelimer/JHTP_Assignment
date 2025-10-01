package Chapter_4_Exercises.four_dot_39;

import java.util.Scanner;

public class Encrpt_Cryptography {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4 digits number: ");
        int number = scanner.nextInt();

       while (number < 1000 || number > 9999){
           if (number < 1000 || number > 9999){

               System.out.print("Enter a valid 4 digit number. " + number + " is invalid ");
               number = scanner.nextInt();
           }
       }

       int n1 = number/1000;
       int n2 = (number/100) % 10;
       int n3 = (number/10) % 10;
       int n4 = number % 10;

//        System.out.printf("%d %d %d %d",  n1, n2,n3,n4);



        n1 = (n1 + 7) % 10;
        n2 = (n2 + 7) % 10;
        n3 = (n3 + 7) % 10;
        n4 = (n4 + 7) % 10;

        System.out.println();
//        System.out.printf("%d %d %d %d",  n1, n2,n3,n4);


        int temp = n1; n1 = n3; n3 = temp;
        temp = n2; n2 = n4; n4 = temp;

        int encrypted = n1 * 1000 + n2 * 100 + n3 * 10 + n4;


        System.out.println(encrypted);

    }
}
