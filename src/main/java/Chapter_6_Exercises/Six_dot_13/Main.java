package Chapter_6_Exercises.Six_dot_13;

import java.security.SecureRandom;

public class Main {

/*Write statements that will display a random number from each of the following sets:
a) 0, 3, 6, 9, 12.
b) 1, 2, 4, 8, 16, 32.
c) 10, 20, 30, 40.
*/
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

            int randomNumber =  3 * secureRandom.nextInt(5);
            int randomNumber2 = (int) Math.pow(2, secureRandom.nextInt(6));
            int randomNumber3 = 10 * (secureRandom.nextInt(4 ) + 1);





            System.out.println(randomNumber3);

    }
}
