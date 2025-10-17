package Chapter_6_Exercises.Six_dot_24;

public class PerfectNumber {


    public static void main(String[] args) {
                isPerfect();
    }
    private static void isPerfect(){


        for (int i = 1; i <= 100000; i++) {
            int sum = 0;
            String factors = "";
            for (int j = 1; j < i; j++) {
            if (i % j == 0){
                sum += j;
                factors += j + " ";
            }
            }
            if (sum == i ){
                System.out.println(i + " is a perfect number!");
                System.out.println("Factors: " + factors + "\n");
            }

        }



    }
}
