package Chapter_8_Exercises.Exercises.Eight_dot_19;

import java.math.BigDecimal;

public class AccountReWriteWithBigDecimal {
   
    private String name; // instance variable
//    private double balance; // instance variable
    private BigDecimal balance = new BigDecimal(0);
    // Account constructor that receives two parameters
    public AccountReWriteWithBigDecimal(String name, BigDecimal balance) {
        this.name = name; // assign name to instance variable name
// validate that the balance is greater than 0.0; if it's not,
// instance variable balance keeps its default initial value of 0.0
        if (balance.compareTo(BigDecimal.ZERO) > 0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }
    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance = balance.add(BigDecimal.valueOf(depositAmount)); // add it to the balance
        }
    }
    // method returns the account balance
    public BigDecimal getBalance() {
        return balance;
    }
    // method that sets the name
    public void setName(String name) {
        this.name = name;
    }
    // method that returns the name
    public String getName() {
        return name;
    }
}
