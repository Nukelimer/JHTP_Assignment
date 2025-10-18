package Chapter_6_Exercises.Six_dot_30;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
/*(Guess the Number) Write an application that plays “guess the number” as follows: Your
program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
user for the next guess. When the user enters the correct answer, display Congratulations. You
guessed the number!, and allow the user to choose whether to play again. [Note: The guessing tech-
nique employed in this problem is similar to a binary search, which is discussed in Chapter 19,
Searching, Sorting and Big O.]*/
    static int secretRandomNumber;
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        randomNumGen();
        System.out.println(secretRandomNumber);
        while (true){
            System.out.print("Guess a number between 1 and 1000: ");
            int userEnteredGuess = scanner.nextInt();
            if (secretRandomNumber == userEnteredGuess){
                System.out.println("Congratulations, you guessed right!!");
                System.out.print("do you want to play again? enter 1 for YES and 2 for NO ");
                int playAgain = scanner.nextInt();
                if (playAgain == 1){
                    System.out.println("This is a new round!");
                    randomNumGen();
                } else {
                   break;

                }
            } else if (secretRandomNumber < userEnteredGuess) {
                System.out.println("oops, the number is greater than the secret number. "  );
            } else {
                System.out.println("oops, the number is smaller than the secret number. " );
            }

        }
    }
    public static void randomNumGen(){
        Random random = new Random();
        secretRandomNumber = random.nextInt(1000)+ 1;
        System.out.println(secretRandomNumber);
    }

}
