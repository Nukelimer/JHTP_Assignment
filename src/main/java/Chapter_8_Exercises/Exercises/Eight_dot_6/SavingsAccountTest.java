package Chapter_8_Exercises.Exercises.Eight_dot_6;

public class SavingsAccountTest {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        System.out.println(saver1.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.04);

        saver1.show12MonthsInterest();
        saver2.show12MonthsInterest();

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nAfter changing rate to 5% for one month:");
        System.out.printf("Saver1: $%.2f | Saver2: $%.2f%n",
                saver1.getSavingsBalance(), saver2.getSavingsBalance());
    }
}
