package Chapter_8_Exercises.Exercises.Eight_dot_20;

/*(final Instance Variables) In Fig. 8.8, class Employee’s instance variables are never modi-
fied after they’re initialized. Any such instance variable should be declared final. Modify class Em-
ployee accordingly, then compile and run the program again to demonstrate that it produces the
same results.*/
public class Employee {
    private final String firstName;
    private final String lastName;
    private final Date birthDate;
    private final Date hireDate;
    // constructor to initialize name, birth date and hire date
    public Employee(String firstName, String lastName, Date birthDate,
                    Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }
    // convert Employee to String format
    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s",
                lastName, firstName, hireDate, birthDate);
    }
}