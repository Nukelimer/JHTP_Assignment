package Chapter_5_Exercises.Five_dot_25;

import java.util.Scanner;

public class ModDiamondPrinting {
    public static void main(String[] args) {

/*(Modified Diamond Printing Program) Modify the application you wrote in Exercise 5.24
to read an odd number in the range 1 to 19 to specify the number of rows in the diamond. Your
program should then display a diamond of the appropriate size.*/

        Scanner input = new Scanner(System.in);
        int numberOfRows;


        do {

            System.out.print("Enter an odd number between and 19: ");
            numberOfRows = input.nextInt();


            if (numberOfRows < 1 || numberOfRows > 19 || numberOfRows % 2 == 0){
                System.out.println("Invalid input! Please enter an ODD number between 1 and 19.\n");
            }

        } while (numberOfRows < 1 || numberOfRows > 19 || numberOfRows % 2 == 0);


        int middle = numberOfRows / 2 + 1;

        System.out.println(middle);

        for (int row = 1; row <= middle; row++){

            for (int space = row; space < middle; space++){
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * row - 1); star++){
                System.out.print("*");
            }

            System.out.println();

        }


        for (int row = middle -1; row >= 1; row--){

                for (int space = middle; space > row; space--){
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * row - 1); star++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
