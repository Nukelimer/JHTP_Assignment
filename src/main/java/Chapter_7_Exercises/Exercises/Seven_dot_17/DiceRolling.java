package Chapter_7_Exercises.Exercises.Seven_dot_17;

import java.util.Arrays;
import java.util.Random;

public class DiceRolling {

/*(Dice Rolling) Write an application to simulate the rolling of two dice. The application
should use an object of class Random once to roll the first die and again to roll the second die. The
sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
each possible sum appears. Display the results in tabular format.*/

    public static void main(String[] args) {
        Random random = new Random();
        int [] sumStorage = new int[13];

        for (int i = 0; i < 36_000_000; i++) {
            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);
            int sum = die1 + die2;

            sumStorage[sum]++;
        }




        System.out.printf(" %-20s %s %n", "Sum", "Times Rolled");

        for (int i = 2; i < sumStorage.length; i++) {
            System.out.printf("%-20s  %,d %n", i, sumStorage[i]);
        }

    }
}
