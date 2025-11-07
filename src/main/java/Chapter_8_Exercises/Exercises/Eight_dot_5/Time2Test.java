package Chapter_8_Exercises.Exercises.Eight_dot_5;

public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2();               // 00:00:00
        Time2 t2 = new Time2(13, 27, 6);      // 13:27:06

        System.out.println("Universal: " + t2.toUniversalString());
        System.out.println("Standard:  " + t2.toString());

        t2.setHour(20);
        t2.setMinute(15);
        t2.setSecond(45);

        System.out.println("Updated time:");
        System.out.println("Universal: " + t2.toUniversalString());
        System.out.println("Standard:  " + t2.toString());
    }
}
