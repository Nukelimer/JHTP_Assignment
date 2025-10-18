package Chapter_6_Exercises.Six_dot_33;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ModCrapGame {

/*(Craps Game Modification) Modify the craps program of Fig. 6.8 to allow wagering. Initialize variable bankBalance to 1000 dollars. Prompt the player to enter a wager. Check that wager
is less than or equal to bankBalance, and if it’s not, have the user reenter wager until a valid wager
is entered. Then, run one game of craps. If the player wins, increase bankBalance by wager and dis-play the new bankBalance. If the player loses, decrease bankBalance by wager, display the new bank-Balance, check whether bankBalance has become zero and, if so, display the message "Sorry. You
busted!" As the game progresses, display various messages to create some “chatter,” such as "Oh,
you're going for broke, huh?" or "Aw c'mon, take a chance!" or "You're up big. Now's the time to cash in your chips!". Implement the “chatter” as a separate method that randomly chooses the
string to display.*/

    private static final Random random = new Random();
        private  static final SecureRandom SECURE_RANDOM = new SecureRandom();
        private enum  Status {RUNNING, WON, LOST};
    private enum  Chatter  {
        BROKE("Oh, you're going for broke, huh?"),
        TAKE_A_CHANCE("Aw c'mon, take a chance!"),
    CASH_IN("You're up big. Now's the time to cash in your chips!");

        private final String message;
        Chatter(String message) {

            this.message = message;
        }
        public String getMessage() {
            return message;
        }
    }

        private  static  final  int SNAKE_EYES = 2;
        private  static  final  int TREY = 3;
        private  static  final  int SEVEN = 7;
        private  static  final  int YO_LEVEN =11;
        private  static  final  int BOX_CARS =12;



        public static void main(String[] args) {
            double bankBalance = 1000;
            double wager;
            Scanner scanner = new Scanner(System.in);


            do {
                System.out.print("Enter a wager or bet: ");
                wager =  scanner.nextDouble();
            } while (!(wager <= bankBalance));




            int myPoint = 0;
        Status gameStatus;


            int sumDice = rollDice();


            switch (sumDice){
                case SEVEN, YO_LEVEN -> {
                    gameStatus = Status.WON;
                    bankBalance += wager;
                }
                case SNAKE_EYES, BOX_CARS, TREY -> {
                    gameStatus = Status.LOST;
                    bankBalance -= wager;
                }
                default->{
                    gameStatus = Status.RUNNING;
                    chatter();
                    myPoint = sumDice;
                    System.out.printf("Point is %d%n", myPoint);


                }

            }
            while (gameStatus == Status.RUNNING){
                sumDice = rollDice();
                chatter();


                if (sumDice == myPoint){
                    gameStatus = Status.WON;
                    bankBalance += wager;

                } else {
                    if (sumDice == SEVEN){
                        gameStatus = Status.LOST;
                        bankBalance -= wager;
                    }
                }
            }

            if (gameStatus == Status.WON) {
                System.out.println("Player win!");
            }
            else {
                System.out.println("Player loses!");
            }

          if (bankBalance < 1){
              System.out.println("Bal: " + bankBalance + ". Sorry you busted!");
          }

        }


        public  static  int rollDice(){

            int die1 = 1 + SECURE_RANDOM.nextInt(6);
            int die2 = 1 + SECURE_RANDOM.nextInt(6);

            System.out.printf("Player rolled %d + %d = %d%n", die1, die2, (die1 + die2));



            return  die1 + die2;
        }

        private static  void chatter (){

            System.out.println(Chatter.values()[random.nextInt(Chatter.values().length)].getMessage());
        }


}
