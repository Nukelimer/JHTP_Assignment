package Chapter_8_Exercises.Exercises.Eight_dot_11;

// ComplexTest.java
// Testing the Complex class

public class ComplexTest {
    public static void main(String[] args) {


        Complex cx = new Complex();
        Complex cx2 = new Complex();



        // Create two complex numbers
        Complex c1 = new Complex(3.0, 2.0);
        Complex c2 = new Complex(1.0, 7.0);

        // Add them
        Complex sum = c1.add(c2);
        // Subtract them
        Complex difference = c1.subtract(c2);



        // Print all results
        System.out.print("First complex number: ");
        c1.print();

        System.out.print("Second complex number: ");
        c2.print();

        System.out.print("Sum: ");
        sum.print();

        System.out.print("Difference: ");
        difference.print();
    }
}
