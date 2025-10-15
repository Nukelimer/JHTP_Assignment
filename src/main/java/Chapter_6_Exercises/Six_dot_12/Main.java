package Chapter_6_Exercises.Six_dot_12;

import java.security.SecureRandom;

public class Main {

/*Write statements that assign random integers to the variable n in the following ranges:
a) 2 ≤ n ≤ 6.
b) 4 ≤ n ≤ 50.
c) 0 ≤ n ≤ 7.
d) 1000 ≤ n ≤ 1030.
e) –5 ≤ n ≤ 1.
f) –2 ≤ n ≤ 9.
*/

    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();


        for (int i = 0; i < 1000; i++) {

       int  randomNumber1 = secureRandom.nextInt(2, 7) ;
        int  randomNumber2 = secureRandom.nextInt(4, 51) ;
        int  randomNumber3 = secureRandom.nextInt(0, 8) ;
        int  randomNumber4 = secureRandom.nextInt(1000, 1031);
        int  randomNumber5 = secureRandom.nextInt(-5, 2);
        int  randomNumber6 = secureRandom.nextInt(-2, 10);

            System.out.printf("2 ≤ n ≤ 6:: -> random number: %d %n ", randomNumber1);
            System.out.printf("4 ≤ n ≤ 50: -> random number: %d %n",
                    randomNumber2);
            System.out.printf("0 ≤ n ≤ 7: -> random number: %d %n",randomNumber3);
            System.out.printf("1000 ≤ n ≤ 1030:-> random number: %d %n", randomNumber4);
            System.out.printf("–5 ≤ n ≤ 1: -> random number: %d %n", randomNumber5);
            System.out.printf("–2 ≤ n ≤ 9:  -> random number: %d %n",
                    randomNumber6);

        }




    }
}
