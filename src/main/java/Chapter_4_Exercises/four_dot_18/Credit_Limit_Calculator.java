package Chapter_4_Exercises.four_dot_18;

import java.util.Scanner;

public class Credit_Limit_Calculator {

//    (Credit Limit Calculator) Develop a Java application that determines whether any of sev-
//    eral department-store customers has exceeded the credit limit on a charge account. For each cus-
//    tomer, the following facts are available:
//    a) account number
//    b) balance at the beginning of the month
//    c) total of all items charged by the customer this month
//    d) total of all credits applied to the customer’s account this month
//    e) allowed credit limit.
//    The program should input all these facts as integers, calculate the new balance (= beginning balance
//    + charges – credits), display the new balance and determine whether the new balance exceeds the
//    customer’s credit limit. For those customers whose credit limit is exceeded, the program should dis-
//    play the message "Credit limit exceeded".


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("account number: ");
        int accountNumberInput = scanner.nextInt();

        System.out.print("balance at the beginning of the month: ");
        int beginningOfMonthBalInput = scanner.nextInt();

        System.out.print("total of all items charged by the customer this month: ");
        int totalChargeInput = scanner.nextInt();

        System.out.print("total of all credits applied to the customer’s account: ");
        int totalCreditAppliedInput = scanner.nextInt();


        System.out.print("allowed credit limit: ");
        int creditLimit = scanner.nextInt();


        int totalFinancialStatus = (beginningOfMonthBalInput + totalChargeInput) - totalCreditAppliedInput;

        if (totalFinancialStatus > creditLimit){
            System.out.println("Credit limit exceeded");
            System.out.println(totalFinancialStatus);
        } else{
            System.out.println(totalFinancialStatus);
        }




    }
}
