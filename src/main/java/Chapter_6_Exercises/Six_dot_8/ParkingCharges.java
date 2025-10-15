package Chapter_6_Exercises.Six_dot_8;

import java.util.Scanner;

public class ParkingCharges {

/*(Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time. Write an application that calculates and displays the parking charges
for each customer who parked in the garage yesterday. You should enter the hours parked for each
customer. The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts. It should use the method calculateCharges to
determine the charge for each customer.*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0;

        while (true) {
            System.out.print("Enter hours parked (-1 to quit): ");
            int hours = scanner.nextInt();
            if (hours == -1)
                break;

            double charge = calculateCharges(hours);
            totalReceipts += charge;
            System.out.printf("Current total receipts: $%.2f%n", totalReceipts);
        }


    }

    private  static double calculateCharges(int hoursParked){

        double totalCharge= 0;
        double minimumHourCharge;
        double chargeAfterMinimumHrs;



        if(hoursParked == 24){
            totalCharge = 10.0;
            System.out.println(totalCharge);

        }
        else if (hoursParked > 3 ) {
            minimumHourCharge = 2.0;
          int extraHour = hoursParked - 3;

            totalCharge = extraHour* 0.5 + 2.0;
        } else {
            totalCharge = 2;
        }
        if (totalCharge > 10.0){
            totalCharge = 10;

        }
        System.out.printf("Hours Parked: %d%nTotal Parking Charge: %.2f%n ", hoursParked, totalCharge);



        return totalCharge;
    }
}
