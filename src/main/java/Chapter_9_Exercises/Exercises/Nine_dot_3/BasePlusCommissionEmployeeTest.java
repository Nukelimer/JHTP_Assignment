package Chapter_9_Exercises.Exercises.Nine_dot_3;



public class BasePlusCommissionEmployeeTest {


/*(Recommended: Using Composition Rather Than Inheritance) Many programs written
with inheritance could be written with composition instead, and vice versa. Rewrite class BasePlus-
CommissionEmployee (Fig. 9.11) of the CommissionEmployee–BasePlusCommissionEmployee hierar-
chy so that it contains a reference to a CommissionEmployee object, rather than inheriting from class
CommissionEmployee. Retest BasePlusCommissionEmployee to demonstrate that it still provides the
same functionality.*/

    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis",
                "333-33-3333", 5000,
                0.4, 300);
        System.out.println(employee.toString());


        employee.setBaseSalary(300000);

        employee.setGrossSale(756333);



        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString",
                employee);



    }


}
