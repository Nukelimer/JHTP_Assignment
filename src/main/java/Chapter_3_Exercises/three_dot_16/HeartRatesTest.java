package Chapter_3_Exercises.three_dot_16;

import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your f_name:");
        String f_name= scanner.nextLine();

        System.out.println("Enter your l_name:");
        String l_name= scanner.nextLine();

        System.out.println("Enter your day of birth:");
        int day_of_birth= scanner.nextInt();

        System.out.println("Enter your month of birth:");
        int month_of_birth= scanner.nextInt();


        System.out.println("Enter your year of birth:");
        int year_of_birth= scanner.nextInt();





        HeartRates user1 = new HeartRates( f_name, l_name, day_of_birth, month_of_birth, year_of_birth);


        user1.targetHeartRateRange();

        System.out.println(user1.userAge());;
    }



}
