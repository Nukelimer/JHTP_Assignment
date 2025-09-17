package Chapter_3.three_dot_15;

import java.util.Scanner;
public class AccountRefactoredTest {
    public static void main(String[] args) {
        AccountRefactored account1 = new AccountRefactored("Jane Green", 50.00);
        AccountRefactored account2 = new AccountRefactored("Bob Izua", 930.00);

// display initial balance of each object
//        System.out.printf("%s balance: $%.2f%n",
//                account1.getName(), account1.getBalance());

        account1.displayAccount();
        displayAccount(account1);
//        System.out.printf("%s balance: $%.2f%n%n",
//                account2.getName(), account2.getBalance());
        account2.displayAccount();
        displayAccount(account2);
// create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount); // add to account1’s balance
// display balances
//        System.out.printf("%s balance: $%.2f%n",
//                account1.getName(), account1.getBalance());
        account1.displayAccount();
        displayAccount(account1);
//        System.out.printf("%s balance: $%.2f%n%n",
//                account2.getName(), account2.getBalance());
        account2.displayAccount();
        displayAccount(account2);
        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount); // add to account2 balance
// display balances
//        System.out.printf("%s balance: $%.2f%n",
//                account1.getName(), account1.getBalance());
        account1.displayAccount();
        displayAccount(account1);
//        System.out.printf("%s balance: $%.2f%n%n",
//                account2.getName(), account2.getBalance());
        account2.displayAccount();
        displayAccount(account2);
    }


    public static void displayAccount(AccountRefactored accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
