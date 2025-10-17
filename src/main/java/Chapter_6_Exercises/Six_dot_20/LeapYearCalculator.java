package Chapter_6_Exercises.Six_dot_20;

import java.util.Scanner;

public class LeapYearCalculator {
/*(Test for Leap Year) Write an application that prompts the user to enter an year and uses a
method called isLeapYear to check whether it is a leap year.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any year to check if it's a leap year i.e 2002, 1982: ");
        int userYear = scanner.nextInt();


        if (userYear < 1852){
            System.out.printf("Oops, our current calendar" +
                    " wasn't introduced by: %d, %n use a year after 1852.", userYear);
            return;
        }

//        for (int userYear = 1853; userYear <= 10_000; userYear++) {

        if (userYear % 400 == 0 || (userYear % 4 == 0  && userYear % 100 != 0)){
     System.out.printf("Yaaaayyy year %d is a leap year \uD83C\uDF8A \uD83C\uDF8A! %n", userYear);
        } else {
            System.out.printf("Oops, year %d is not a leap year \uD83D\uDE10\uFE0F! %n", userYear);
        }
//        }
    }


}
