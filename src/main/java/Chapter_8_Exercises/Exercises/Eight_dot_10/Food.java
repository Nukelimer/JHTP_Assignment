package Chapter_8_Exercises.Exercises.Eight_dot_10;

public class Food {

    public static void main(String[] args) {

        System.out.printf("%-10s %-10s %-10s%n", "NAME", "TYPE", "CALORIES");

        for (FOOD food : FOOD.values()) {
            System.out.printf("%-10s %-10s %-10d%n",
                    food.name(),
                    food.getType(),
                    food.getCalories());
        }

    }
}
