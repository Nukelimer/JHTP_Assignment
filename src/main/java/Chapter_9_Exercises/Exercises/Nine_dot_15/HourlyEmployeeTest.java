package Chapter_9_Exercises.Exercises.Nine_dot_15;

public class HourlyEmployeeTest {

    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee(40, 22,
                "Remi", "Egwuda", "22-33-222-2222");

        System.out.println(hourlyEmployee);

       hourlyEmployee.setFirstName("Bruno");
        hourlyEmployee.setLastName("Mars");
        hourlyEmployee.setHour(80);
        hourlyEmployee.setWage(62);


        System.out.println("___________________________");

        System.out.println(hourlyEmployee);


    }
}
