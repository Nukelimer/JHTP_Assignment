package Chapter_8_Exercises.Playground.Eight_dot_7;

public class EmployeeTest {
    public static void main(String[] args) {

        Date birth = new Date(7, 11, 1997);
        Date hire = new Date(2, 12, 2026);
        Date birth1 = new Date(7, 11, 1997);
        Date hire1 = new Date(2, 12, 2026);
        Date birth11 = new Date(7, 11, 1997);
        Date hire11 = new Date(2, 12, 2026);

        System.out.println(hire1.count);
        System.out.println(Date.count);

        Employee  employee = new Employee("Remi", "Egwuda",  birth, hire);
        System.out.println(employee);
    }
}
