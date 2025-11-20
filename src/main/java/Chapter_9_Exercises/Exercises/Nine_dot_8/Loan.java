package Chapter_9_Exercises.Exercises.Nine_dot_8;

public class Loan {

    protected double principalAmount;
    protected int tenure;




    public Loan (double principalAmount, int tenure){

        this.principalAmount = principalAmount;
        this.tenure = tenure;


    }


    public double getPrincipalAmount() {
        return principalAmount;
    }

    public int getTenure() {
        return tenure;
    }


    public double calculateEMI( double annualRate) {

        double r = annualRate / 12 / 100;

        return (principalAmount * r * Math.pow(1 + r, tenure)) /
                (Math.pow(1 + r, tenure) - 1);
    }
}
