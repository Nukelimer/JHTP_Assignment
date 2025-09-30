package Chapter_4_Exercises.four_dot_32;

public class Binary_Number {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a binary number (only 0s and 1s): ");
        int binary = input.nextInt();


        int decimal = 0;
        int base = 1; // 2^0

        while (binary > 0) {
            int digit = binary % 10;
            decimal += digit * base;
            base *= 2;
            binary /= 10;
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}
