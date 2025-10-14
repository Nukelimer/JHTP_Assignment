package Chapter_6_Exercises.Playground.Six_dot_1;

import java.security.SecureRandom;
import java.util.Random;

public class SecuredRandomNumber {


    public static void main(String[] args) {
        Random secureRandom = new Random();


        int one = 1;
        int two;
        int three;


        for (int i = 1; i <= 90; i++) {
   int randomNumber = 2 + 7 * secureRandom.nextInt(6);
            System.out.printf("%2d  ", randomNumber);

            if (i %5 == 0){
                System.out.println();
            }
        }


    }
}
