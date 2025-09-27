package Chapter_4_Exercises.four_dot_17;

import java.util.Scanner;

public class Gas_Mileage {


//    (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//    kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//    a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//    The program should calculate and display the miles per gallon obtained for each trip and print the
//    combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//    produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
//    from the user.

//    ALGORITHM
//    1. ask for user input to get the mile the driver has driven.
//    2. ask for user input to get the gallon of gas that the driver has used for the trip.
//    3. use scanner and sentinel controlled iteration to obtain the data from the user.
//    4. calculate the numbers of gallon of gas and miles for each trip, then.
//    5. then give the total for the miles and gallon. cast it into floating point numbers.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int miles = 0;
        float gas = 0;
        int gasVal= 0;
        int milesVal= 0;


        while (gasVal != -1){
            System.out.print("Gas, or -1 to exit: ");
           gasVal = scanner.nextInt();
            if (gasVal == -1) return;
            System.out.print("Miles: ");
            milesVal = scanner.nextInt();

            gas = gas  + gasVal;
            miles = miles + milesVal;

            System.out.println("Gas for this trip "  + gasVal );
            System.out.println("Gas total as at now "  + gas );

            System.out.println("Miles for this trip "  + milesVal );
            System.out.println("Miles total as at now "  + miles );


        }




    }






}
