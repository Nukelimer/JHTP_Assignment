package Chapter_7_Exercises.Exercises.Seven_dot_18;

import java.util.Random;

public class GameOfCrap {
/*(Game of Craps) Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
answers the following questions:
a) How many games are won on the first roll, second roll, ..., twentieth roll and after the
twentieth roll?
b) How many games are lost on the first roll, second roll, ..., twentieth roll and after the
twentieth roll?
c) What are the chances of winning at craps? [Note: You should discover that craps is one
of the fairest casino games. What do you suppose this means?]
d) What is the average length of a game of craps?
e) Do the chances of winning improve with the length of the game?*/

    public static void main(String[] args) {
        final int NUM_GAMES = 1_000_000;
        Random random = new Random();

        int[] winsByRoll = new int[21];
        int[] lossesByRoll = new int[21];
        int winsAfter20 = 0;
        int lossesAfter20 = 0;

        long totalWins = 0;
        long totalLosses = 0;
        long totalRolls = 0;


        for (int i = 0; i < NUM_GAMES; i++) {
            GameResult result = playOneGame(random);
            totalRolls += result.rollsUsed;

            if (result.rollsUsed <= 20) {
                if (result.isWin) {
                    winsByRoll[result.rollsUsed]++;
                    totalWins++;
                } else {
                    lossesByRoll[result.rollsUsed]++;
                    totalLosses++;
                }
            } else {
                if (result.isWin) {
                    winsAfter20++;
                    totalWins++;
                } else {
                    lossesAfter20++;
                    totalLosses++;
                }
            }
        }


        System.out.printf("%-10s%-15s%-15s%n", "Roll", "Wins", "Losses");
        System.out.println("-----------------------------------");

        for (int r = 1; r <= 20; r++) {
            System.out.printf("%-10d%-15d%-15d%n", r, winsByRoll[r], lossesByRoll[r]);
        }
        System.out.printf("%-10s%-15d%-15d%n", ">20", winsAfter20, lossesAfter20);


        double winRate = (double) totalWins / NUM_GAMES * 100;
        double averageGameLength = (double) totalRolls / NUM_GAMES;

        System.out.println("\n--- Summary ---");
        System.out.printf("Total games: %,d%n", NUM_GAMES);
        System.out.printf("Total Wins: %,d%n", totalWins);
        System.out.printf("Total Losses: %,d%n", totalLosses);
        System.out.printf("Winning Percentage: %.2f%%%n", winRate);
        System.out.printf("Average Rolls per Game: %.4f%n", averageGameLength);
    }


    private static class GameResult {
        boolean isWin;
        int rollsUsed;

        GameResult(boolean isWin, int rollsUsed) {
            this.isWin = isWin;
            this.rollsUsed = rollsUsed;
        }
    }


    private static GameResult playOneGame(Random random) {
        int rollCount = 0;
        int die1 = rollDie(random);
        int die2 = rollDie(random);
        int sum = die1 + die2;
        rollCount++;


        if (sum == 7 || sum == 11) {
            return new GameResult(true, rollCount);
        } else if (sum == 2 || sum == 3 || sum == 12) {
            return new GameResult(false, rollCount);
        }

        int point = sum;


        while (true) {
            rollCount++;
            die1 = rollDie(random);
            die2 = rollDie(random);
            sum = die1 + die2;

            if (sum == point) {
                return new GameResult(true, rollCount);
            } else if (sum == 7) {
                return new GameResult(false, rollCount);
            }
        }
    }

    private static int rollDie(Random random) {
        return 1 + random.nextInt(6);
    }

}
