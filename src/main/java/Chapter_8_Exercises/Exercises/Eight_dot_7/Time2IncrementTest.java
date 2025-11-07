package Chapter_8_Exercises.Exercises.Eight_dot_7;

import Chapter_8_Exercises.Exercises.Eight_dot_5.Time2;

public class Time2IncrementTest {
    public static void main(String[] args) {
        Time2Increment t1 = new Time2Increment();               // 00:00:00
        Time2Increment t2 = new Time2Increment(13, 27, 6);      // 13:27:06

        System.out.println("Universal: " + t2.toUniversalString());
        System.out.println("Standard:  " + t2.toString());

        t2.setHour(20);
        t2.setMinute(15);
        t2.setSecond(45);

        System.out.println("Updated time:");
        System.out.println("Universal: " + t2.toUniversalString());
        System.out.println("Standard:  " + t2.toString());
        System.out.println("_____________");
        t2.tick();
        t2.tick();
        t2.tick();

        t2.incrementMinute();

        t2.incrementHour();
        t2.incrementHour();
        t2.incrementHour();
        t2.incrementHour();
        t2.incrementHour();
        t2.incrementHour();
        t2.incrementHour();




        System.out.println("_____________");


        System.out.println("Universal: " + t2.toUniversalString());
        System.out.println("Standard:  " + t2.toString());

    }
}
