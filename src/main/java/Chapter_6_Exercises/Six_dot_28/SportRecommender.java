package Chapter_6_Exercises.Six_dot_28;

import java.util.Scanner;

public class SportRecommender {
/*Write a method sportsRecommender that inputs a Celsius temperature and returns “It’s
lovely weather for sports today!” if it’s 20–30 °C, “It’s reasonable weather for sports today.” if it’s
10–40 °C, and “Please exercise with care today, watch out for the weather!” otherwise. Create an
application to test the method.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the celsius weather for today: ");
        int userWeatherInput = scanner.nextInt();
        System.out.println(sportRecommender(userWeatherInput));
    }

    private static String sportRecommender (int temperature){
        String state = "";
        if (temperature >= 20 && temperature <= 30 ){

            state = "It’s lovely weather for sports today";
        } else if (temperature >= 10 && temperature <= 40 ) {
            state = "It’s reasonable weather for sports today.";
        } else {

            state= "Please exercise with care today, watch out for the weather!";
        }

        return state;

    }

}
