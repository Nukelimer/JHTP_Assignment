package Chapter_8_Exercises.Exercises.Eight_dot_13;

import java.security.SecureRandom;

public class IntegerSetTest {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        IntegerSet set = new IntegerSet();
        for (int i = 0; i < 101; i++) {
            int randomNumbs = random.nextInt(0, 102);
            set.insertItemFromSet(randomNumbs);
        }
        set.deleteItemFromSet(6);
        set.deleteItemFromSet(60);

        System.out.println(set.toString());

        set.showArrayContent();
    }

}
