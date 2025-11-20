package Chapter_9_Exercises.Exercises.Nine_dot_14;



public class BasePlusCommissionEmployeeTest {


/*(Employee Hierarchy) In this chapter, you studied an inheritance hierarchy in which class
BasePlusCommissionEmployee inherited from class CommissionEmployee. However, not all types of
employees are CommissionEmployees. In this exercise, you’ll create a more general Employee superclass
that factors out the attributes and behaviors in class CommissionEmployee that are common to all Em-
ployees. The common attributes and behaviors for all Employees are firstName, lastName,
socialSecurityNumber, getFirstName, getLastName, getSocialSecurityNumber and a portion of
method toString. Create a new superclass Employee that contains these instance variables and meth-
ods and a constructor. Next, rewrite class CommissionEmployee from Section 9.4.5 as a subclass of Em-
ployee. Class CommissionEmployee should contain only the instance variables and methods that are
not declared in superclass Employee. Class CommissionEmployee’s constructor should invoke class Em-
ployee’s constructor, and CommissionEmployee’s toString method should invoke Employee’s to-
String method. Once you’ve completed these modifications, run the CommissionEmployeeTest and
BasePlusCommissionEmployeeTest apps using these new classes to ensure that the apps still display the
same results for a CommissionEmployee object and BasePlusCommissionEmployee object, respectively.*/

    public static void main(String[] args) {
BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis",
                "333-33-3333", 5000,
                0.4, 300);
        System.out.println(employee);


        employee.setBaseSalary(300000);

        employee.setGrossSale(756333);



        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString",
                employee);



    }


}
