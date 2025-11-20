package Chapter_9_Exercises.Exercises.Nine_dot_8;

public class VehicleLoan extends Loan{

    public VehicleLoan(double principalAmount, int tenure){
        super(principalAmount, tenure);
    }

    public void getEMI(){

        double interestRate = 33;
      double emi = calculateEMI(interestRate);

     String  isMoreThanOne = tenure > 1 ? "months": "month";

        System.out.printf("Monthly EMI for Vehicle Loan is: $%,.2f" +
                " for %d %s on a %.0f%% interest rate.",
                emi, tenure, isMoreThanOne, interestRate);

    }



}
