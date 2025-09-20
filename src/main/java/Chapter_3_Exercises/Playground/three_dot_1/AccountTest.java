package Chapter_3_Exercises.Playground.three_dot_1;

import java.util.Scanner;

public  class AccountTest{
    public  static  void main(String[] args) {






        Scanner scanner = new Scanner(System.in);

        Account user1 = new Account("Remi Egwuda", 299.99);
        Account user2 = new Account("Leah Egwuda", -9.09);
//        user1.setName();




        System.out.println("Initial State: ");
        System.out.printf("%s%s$%.2f%n", user1.getName(), " balance:", user1.getBalance() );
        System.out.printf("%s%s$%.2f%n", user2.getName(), " balance:", user2.getBalance() );



        System.out.print("Enter Deposit Amount for Account 1: ");
        double fundAccount1 = scanner.nextDouble();
        System.out.printf("%s%.2f%n","adding " , fundAccount1,  " to account1 balance");
        user1.deposit(fundAccount1);

        System.out.printf("%s%s$%.2f%n", user1.getName(), " balance:", user1.getBalance() );
        System.out.printf("%s%s$%.2f%n", user2.getName(), " balance:", user2.getBalance() );



        System.out.print("Enter Deposit Amount for Account 2: ");
        double fundAccount2 = scanner.nextDouble();


        System.out.printf("%s%.2f%n","adding " , fundAccount2,  " to account2 balance");
        user2.deposit(fundAccount2);

        System.out.printf("%s%s$%.2f%n", user1.getName(), " balance:", user1.getBalance() );
        System.out.printf("%s%s$%.2f%n", user2.getName(), " balance:", user2.getBalance() );



        scanner.close();
    }
    
}
