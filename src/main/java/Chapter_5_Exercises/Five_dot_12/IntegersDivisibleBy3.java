package Chapter_5_Exercises.Five_dot_12;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {


        String question ="(Integers Divisible by 3) Write an application that calculates the sum of those integers between\n" +
                "1 and 30 that are divisible by 3.";


        int counter = 1;
        int total = 0;


        while (counter <= 30){

            System.out.println(counter);
            if (counter % 3 == 0){
            System.out.println(counter);
            total += counter;
            }
            counter++;

        }

        System.out.println(total);


    }
}
