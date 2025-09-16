package Chapter_2.two_dot_8;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        (A)
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int b = userInput.nextInt();
        System.out.print("Enter another integer: ");
        int c = userInput.nextInt();

//        (B)
        int a = b*c;

        System.out.println(a);


        userInput.close();







    }
}
