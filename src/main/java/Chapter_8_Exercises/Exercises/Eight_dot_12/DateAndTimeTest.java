package Chapter_8_Exercises.Exercises.Eight_dot_12;

public class DateAndTimeTest {

    public static void main(String[] args) {

        DateAndTime dateTime = new DateAndTime(12, 31, 2024, 23, 59, 59);

        System.out.println("Before tick: " + dateTime.toString());


        for (int i = 0; i < 200000L; i++) {
            dateTime.tick();
        System.out.println("After tick: " + dateTime.toString());

        }

    }
}
