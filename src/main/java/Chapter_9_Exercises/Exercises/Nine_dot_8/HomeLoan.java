package Chapter_9_Exercises.Exercises.Nine_dot_8;

import java.util.Locale;

public class HomeLoan extends Loan{

    public HomeLoan( double principalAmount, int tenure){
        super(principalAmount, tenure);
    }

    public void getEMI(){

        double interestRate = 20;
      double emi =    super.calculateEMI(30);

     String  isMoreThanOne = tenure > 1 ? "months": "month";

        System.out.printf("Monthly EMI for Home Loan is: $%,.2f " +
                "for %d %s on a %.0f%% interest rate.", emi,
                tenure, isMoreThanOne, interestRate);


    }



}
