package Chapter_8_Exercises.Exercises.Eight_dot_6;
/*(Savings Account Class) Create class SavingsAccount. Use a static variable annualInter-
estRate to store the annual interest rate for all account holders. Each object of the class contains a
private instance variable savingsBalance indicating the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
savingsBalance by annualInterestRate divided by 12—this interest should be added to savings-
Balance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new
value. Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, sav-
er1 and saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to
4%, then calculate the monthly interest for each of 12 months and print the new balances for both
savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and print the
new balances for both savers.*/


public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    private double savings;


   public SavingsAccount( double savingsBalance){

        savings = savingsBalance;
        this.savingsBalance = savingsBalance;

    }
     void calculateMonthlyInterest(){
        double interest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += interest;


    }
    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void show12MonthsInterest(){
        System.out.printf("Balances for 12 months at %.0f%% interest:%n", annualInterestRate * 100);
        for (int month = 1; month <= 12; month++) {
            this.calculateMonthlyInterest();
            System.out.printf("Month %2d: Saver with %.0f savings: $%.2f%n",
                    month,  this.savings, this.getSavingsBalance());

        }
        System.out.println();
    }
}
