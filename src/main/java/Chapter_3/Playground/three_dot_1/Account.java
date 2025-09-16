package Chapter_3.Playground.three_dot_1;
// Fig. 3.1: Account.java
// Account class that contains a name instance variable
// and methods to set and get its value.
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
