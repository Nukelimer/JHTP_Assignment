package Chapter_6_Exercises.Six_dot_25;

public class PrimeNumbers {

        public static void main(String[] args) {
            for (int i = 1; i <= 1000; i++) {
                if (isPrime(i)) {
                    System.out.println(i + " is a prime number");
                }
            }
        }




    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
