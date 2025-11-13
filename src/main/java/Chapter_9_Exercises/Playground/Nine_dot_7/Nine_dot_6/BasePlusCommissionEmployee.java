package Chapter_9_Exercises.Playground.Nine_dot_7.Nine_dot_6;

public class BasePlusCommissionEmployee  extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);


        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;

    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {return baseSalary;}

    @Override
    public double earnings() {
     return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
// not allowed: attempts to access private superclass members
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }
}
