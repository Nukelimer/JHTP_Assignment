package Chapter_3.three_dot_11;



    public class Account {
        private String name; // instance variable
        private double balance;


        static  String x = "Remi";
        public Account(String name,  double balance){

            this.name = name;

            if (balance > 0.0){

                this.balance = balance;
            }

        }

        public void deposit(double depositAmount){
            if (depositAmount > 0.0){

                balance = balance + depositAmount;
            }


        }


        public void withdraw(double withdrawalAmount) {

            System.out.printf("%s$%.2f%n", "Starting balance:", balance);

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();


            if (withdrawalAmount > balance) {
                System.out.printf("%s $%.2f %s $%.2f %s %n", "Unsuccessful withdrawal,", withdrawalAmount , "withdrawal amount is more than ", balance, "balance in your account.");
            } else {
                this.balance = balance - withdrawalAmount;
                System.out.println("Withdrawal of $" + withdrawalAmount+ " is successful.");
                System.out.println("Closing balance: $" + balance);
            }
        }


        public double getBalance() {
            return balance;
        }

        public void setName(String name) {
            this.name = name; // store the name
        }

        // method to retrieve the name from the object
        public String getName() {
            return name; // return value of name to caller
        }


    }
