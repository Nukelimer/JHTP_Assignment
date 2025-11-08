package Chapter_8_Exercises.Exercises.Eight_dot_15;

public class FancyTimeTest {
    public static void main(String[] args) {
        FancyTime t1 = new FancyTime(8, 45, 10, "p.m."); // 12-hour format
        FancyTime t2 = new FancyTime(20, 45, 10);        // 24-hour format (with seconds)
        FancyTime t3 = new FancyTime(20, 45);            // 24-hour format (without seconds)

        System.out.println("Format 1 (12-hour with meridiem):");
        t1.displayTime(1);

        System.out.println("Format 2 (24-hour with seconds):");
        t2.displayTime(2);

        System.out.println("Format 3 (24-hour without seconds):");
        t3.displayTime(3);
    }
}