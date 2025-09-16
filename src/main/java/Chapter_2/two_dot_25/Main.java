package Chapter_2.two_dot_25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number to check its divisibility :");
        int userInterger = scanner.nextInt();

        try {
            if (userInterger % 3 == 0){
                System.out.println(userInterger + " is divisible by 3." );

            } else {
                System.out.println(userInterger + " is not divisible by 3." );

            }


        } catch (Exception e){

            System.out.println(e);
        }



        scanner.close();
    }
}
