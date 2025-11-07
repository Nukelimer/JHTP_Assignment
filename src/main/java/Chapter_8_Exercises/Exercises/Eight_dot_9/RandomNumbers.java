package Chapter_8_Exercises.Exercises.Eight_dot_9;

import java.security.SecureRandom;
import java.util.Scanner;
/*Write code that generates n random numbers in the range 10–100. [Note: Only import
the Scanner and SecureRandom classes.]*/
public class RandomNumbers {
    public static void main(String[] args) {

        SecureRandom secureRandom = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of times you want to print random nums:");
        int numbersOfTimesToGenerate = scanner.nextInt();

        for (int i = 1; i <= numbersOfTimesToGenerate; i++) {
            int randomNumbs =  secureRandom.nextInt(10,101);
            System.out.println(randomNumbs);
        }

    }
}
