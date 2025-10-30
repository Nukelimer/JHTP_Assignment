package Chapter_7_Exercises.Exercises.Seven_dot_20;

import java.util.Arrays;
import java.util.Random;

public class Archery_Game {

/*(Archery Game) A group of four friends visit a sports club and they decide to practice ar-
chery. Each player gets 3 chances and in every chance they can score between 0 to 10 points. The
player with the maximum score after adding the scores obtained in all 3 chances wins. Write an ap-
plication that simulates this game and prints the scores of all four players in a tabular format and
also prints which player won.
Each line in the table should contain the following:
1) The player number
2) Their first chance score
3) Their second chance score
4) Their third chance score
5) Their score after all three chances
Use multidimensional arrays to store the scores of players in each chance.
Use the secure random-number generation mechanism learnt in the previous chapter to generate
scores between 0 and 10 for each player chance.*/

    public static void main(String[] args) {
        int[][] archeryDataStorage = new int[4][3];
        Random random = new Random();
        int[] totalScores = new int[4];

//        that is 4
        for (int player = 0; player < archeryDataStorage.length; player++) {

            for (int chances = 0; chances < archeryDataStorage[player].length; chances++) {
                archeryDataStorage[player][chances] = random.nextInt(11);
                totalScores[player] += archeryDataStorage[player][chances];

            }
        }

        System.out.printf("%-8s%-12s%-12s%-12s%-12s%n",
                "Player", "Chance 1", "Chance 2", "Chance 3", "Total");
        System.out.println("-----------------------------------------------------");
        int highestScore = 0;
        int winningPlayer = -1;


        for (int player = 0; player < archeryDataStorage.length; player++) {
            System.out.printf("%-8d", (player + 1)); // Player number

            for (int chance = 0; chance < archeryDataStorage[player].length; chance++) {
                System.out.printf("%-12d", archeryDataStorage[player][chance]);
            }

            System.out.printf("%-12d%n", totalScores[player]);


            if (totalScores[player] > highestScore) {
                highestScore = totalScores[player];
                winningPlayer = player + 1;
            }
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("🏆 Winner: Player %d with %d points!%n", winningPlayer, highestScore);






    }
}
