package Chapter_4_Exercises.four_dot_9;

public class Main {

    public static void main(String[] args) {
//        What is wrong with the following while statement?
        int z = 10;
        int sum = 1;
        while (z >= 0) {
            sum += z;
            z--;
//            z NEVER CHANGE OR REDUCES BELOW 0 SO THE LOOP CONTINUES TO RUN INDEFINITELY.

        }
//        int factorial = 1;
//
//        for (int i = 1; i <= 16; i++) {
//            factorial = factorial * i;
//
//        }
//
//        System.out.println(factorial);


        int age = 300;

        if (age >= 65)
        System.out.println("Age is greater than or equal to 65");
        else
        System.out.println("Age is less than 65");








    }
}
