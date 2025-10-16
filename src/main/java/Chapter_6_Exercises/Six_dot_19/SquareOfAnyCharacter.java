package Chapter_6_Exercises.Six_dot_19;

import java.util.Scanner;

public class SquareOfAnyCharacter {
/*(Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to
receive a second parameter of type char called fillCharacter. Form the square using the char provided as an argument. Thus, if side is 5 and fillCharacter is #, the method should display Use the following statement (in which input is a Scanner object) to read a character from the user
at the keyboard:
// next() returns a String and charAt(0) gets the String's first character
char fill = input.next().charAt(0);.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any numerical number displays a solid " +
                "square: ");
        int number = scanner.nextInt();
        System.out.print("Enter any read a character to display: ");
        char fill = scanner.next().charAt(0);
        squareOfAsterisks(number, fill);
    }

    private static void squareOfAsterisks(int number, char fill){

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number; j++) {
                System.out.printf(" %c ", fill);
            }
                System.out.println();
        }
    }
}
