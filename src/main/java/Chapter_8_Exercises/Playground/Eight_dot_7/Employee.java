package Chapter_8_Exercises.Playground.Eight_dot_7;

public class Employee {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;


    public Employee(String firstName, String lastName, Date birthDate, Date hireDate){
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String toString(){
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
}
