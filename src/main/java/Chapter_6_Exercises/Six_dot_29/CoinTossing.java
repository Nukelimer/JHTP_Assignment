package Chapter_6_Exercises.Six_dot_29;

import java.util.Random;
import java.util.Scanner;
/*(Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
the coin appears. Display the results. The program should call a separate method flip that takes no
arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
simulates coin tossing, each side of the coin should appear approximately half the time.]*/
public class CoinTossing {
   private enum COIN { HEAD, TAIL }
    private static int totalHead = 0;
    private static int totalTail = 0;


    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

       while (true){
           System.out.println();
           System.out.println();
           System.out.print("Type 1 to Toss Coin: \nType 2 to exit: ");
           int userEnteredNumber = scanner.nextInt();
           if (userEnteredNumber == 2 || (totalHead == 10 || totalTail== 10)){
               System.out.println("Bye!!");
               break;

           }
           System.out.println("Result: " + flip());
           System.out.println();
           System.out.printf("Total HEADS: %d %n", totalHead);
           System.out.printf("Total TAILS: %d %n", totalTail);


       }
    }

    private static COIN flip () {
        Random random = new Random();
        int randomToss = random.nextInt(2) + 1;
        COIN choice = null;

        switch (randomToss) {
            case 1 ->{
               choice = COIN.HEAD;
               totalHead = totalHead + 1;
            }
            case 2 -> {
               choice= COIN.TAIL;
               totalTail = totalTail + 1;
            }

        };


        return choice;
    }
}
