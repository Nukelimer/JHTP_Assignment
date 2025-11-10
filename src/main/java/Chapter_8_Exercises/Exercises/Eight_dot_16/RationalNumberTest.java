package Chapter_8_Exercises.Exercises.Eight_dot_16;

public class RationalNumberTest {



    // --- 5. TEST PROGRAM (THE main METHOD) ---
    public static void main(String[] args) {
        // Test Cases:

        System.out.println("--- Testing Constructors and Reduction ---");

        // Should be stored as 1/2
        RationalNumber rA = new RationalNumber(9, 18);
        System.out.println("9/18 (rA) reduced to: " + rA); // Expected: 1/2

        // Should be stored as -3/4 (sign moved to numerator)
        RationalNumber rB = new RationalNumber(6, -8);
        System.out.println("6/-8 (rB) reduced to: " + rB); // Expected: -3/4

        // No-arg constructor
        RationalNumber rC = new   RationalNumber();
        System.out.println("No-arg (rC): " + rC); // Expected: 0/1

        // Division by zero test
        RationalNumber rD = new  RationalNumber(5, 0);
        System.out.println("5/0 (rD) error test: " + rD); // Expected: 0/1

        System.out.println("\n--- Testing Arithmetic (rA=1/2, rB=-3/4) ---");

        // Addition: 1/2 + (-3/4) = 2/4 - 3/4 = -1/4
        RationalNumber sum =  RationalNumber.add(rA, rB);
        System.out.println("Addition: 1/2 + (-3/4) = " + sum + ", Float: " + sum.toFloatingPointString(4));
        // Expected: -1/4, -0.2500

        // Subtraction: 1/2 - (-3/4) = 2/4 + 3/4 = 5/4
        RationalNumber difference =  RationalNumber.subtract(rA, rB);
        System.out.println("Subtraction: 1/2 - (-3/4) = " + difference + ", Float: " + difference.toFloatingPointString(2));
        // Expected: 5/4, 1.25

        // Multiplication: 1/2 * (-3/4) = -3/8
        RationalNumber product = RationalNumber.multiply(rA, rB);
        System.out.println("Multiplication: 1/2 * (-3/4) = " + product);
        // Expected: -3/8

        // Division: 1/2 / (-3/4) = 1/2 * -4/3 = -4/6, reduces to -2/3
        RationalNumber quotient =  RationalNumber.divide(rA, rB);
        System.out.println("Division: 1/2 / (-3/4) = " + quotient);
        // Expected: -2/3

        // Division by zero test for arithmetic
        RationalNumber divByZero =  RationalNumber.divide(rA, rC); // 1/2 divided by 0/1
        System.out.println("1/2 / 0/1 (Error test): " + divByZero); // Expected: 0/1

        System.out.println("\n--- Testing Precision ---");

        // Test precision
        RationalNumber piApprox = new  RationalNumber(22, 7);
        System.out.println("22/7 (pi approx) with 6 digits: " + piApprox.toFloatingPointString(6));

        // Test large unreduced fraction: 100/50 -> 2/1
        RationalNumber bigFraction = new  RationalNumber(100, 50);
        System.out.println("100/50 reduced to: " + bigFraction); // Expected: 2/1
    }

}
