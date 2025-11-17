package Chapter_9_Exercises.Exercises.Nine_dot_3;

public class BasePlusCommissionEmployee  {
    private double baseSalary;
  private final CommissionEmployee commissionEmployee;

    public BasePlusCommissionEmployee(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {


        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;


        this.commissionEmployee  = new CommissionEmployee(firstName, lastName,
                socialSecurityNumber, grossSales, commissionRate);



    }

    public void setGrossSale(double grossSales) {
        // 1. You should always validate the input first
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        // 2. Delegate the actual work to the internal CommissionEmployee object
        this.commissionEmployee.setGrossSales(grossSales);

        // **NOTE:** This assumes your CommissionEmployee class has a public setGrossSales method.
    }





    public String getLastName() {
        return commissionEmployee.getLastName();
    }


    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }



    @Override
    public String toString() {
// not allowed: attempts to access private superclass members
        return String.format("%s%n%n%s: %.2f",
                commissionEmployee.toString(),

                "base salary", baseSalary);
    }
}
