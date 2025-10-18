package Chapter_6_Exercises.Six_dot_31;

import java.util.Random;
import java.util.Scanner;

public class ModGuessNumberGame {
    /*(Guess-the-Number Modification) Modify the program of Exercise 6.30 to count the num-
ber of guesses the player makes. If the number is 10 or fewer, display Either you know the secret
or you got lucky! If the player guesses the number in 10 tries, display Aha! You know the secret!
If the player makes more than 10 guesses, display You should be able to do better! Why should it
take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate
half of the numbers, then half of the remaining numbers, and so on.*/
    static int secretRandomNumber;
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        randomNumGen();
        System.out.println(secretRandomNumber);

        int counter =0;
        while (counter>-1){
            System.out.print("Guess a number between 1 and 1000: ");
            int userEnteredGuess = scanner.nextInt();
            if (secretRandomNumber == userEnteredGuess){
                System.out.println("Congratulations, you guessed right!!");
                if ( counter < 10){
                    System.out.println("Either you know the secret " + "or you got lucky!");
                } else if (counter == 10) {
                    System.out.println("Aha! You know the secret!");
                } else {
                    System.out.println("ou should be able to do better! Why should it take no more than 10 guesses?");
                }

                System.out.print("do you want to play again? enter 1 for YES and 2 for NO ");
                int playAgain = scanner.nextInt();
                if (playAgain == 1){
                    System.out.println("This is a new round!");
                    randomNumGen();
                    counter = 0;
                } else {
                    break;

                }
            } else if (secretRandomNumber < userEnteredGuess) {
                System.out.println("oops, the number is greater than the secret number. "  );
            } else {
                System.out.println("oops, the number is smaller than the secret number. " );
            }


            counter++;

        }
    }
    public static void randomNumGen(){
        Random random = new Random();
        secretRandomNumber = random.nextInt(1000)+ 1;
        System.out.println(secretRandomNumber);
    }

}
