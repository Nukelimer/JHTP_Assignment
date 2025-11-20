package Chapter_9_Exercises.Exercises.Nine_dot_8;

import java.util.Scanner;

public class InstallmentCalculator {

/*CInstallment Calculator) Write a Java application that reads two values, the principal
amount of a loan and the tenure of the loan from the user and calculates the monthly installment
payable for different types of loans and returns the results. Use an inheritance hierarchy to design
your application. Create a superclass Loan that is extended by the subclasses HomeLoan, VehicleLoan
and PersonalLoan.
Each type would have a predefined interest rate. Your application should instantiate each type of subclass after reading the input from the user.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();


        System.out.print("Enter tenure in month: ");
        int tenure = scanner.nextInt();

        HomeLoan homeLoan = new HomeLoan(principal, tenure);
        PersonalLoan personalLoan = new PersonalLoan(principal, tenure);
        VehicleLoan vehicleLoan = new VehicleLoan(principal, tenure);
        System.out.println();
        System.out.println();
        System.out.println();
      homeLoan.getEMI();

        System.out.println();
        System.out.println("--------------------------------------");


      vehicleLoan.getEMI();


        System.out.println();
        System.out.println("--------------------------------------");


        personalLoan.getEMI();

    }


}
