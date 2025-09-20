package Chapter_2_Exercises.two_dot_15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first integer of your choice:");
        int first_number = scanner.nextInt();

        System.out.print("Enter first integer of your choice:");
        int second_number = scanner.nextInt();


        int square_first = first_number * first_number;
        System.out.printf("%s%d%s%d", "The square of your first int -> ",first_number, " is ", square_first  );

        System.out.println();
        int square_second = second_number * second_number;
        System.out.printf("%s%d%s%d", "The square of your second int -> ",second_number, " is ", square_second  );

        int difference =square_first - square_second;
        System.out.println();
        System.out.printf( "%s%d", "difference between both squares: ", difference );



        scanner.close();
    }
}
