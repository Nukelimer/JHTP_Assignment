package Chapter_9_Exercises.Exercises.Nine_dot_15;

public class Employee {

    protected String firstName, lastName,
    socialSecurityNumber;


    public Employee(String firstName, String lastName, String socialSecurityNumber){

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;


    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getLastName() {
        return lastName;
    }


    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber()
              );
    }
}
