package Chapter_6_Exercises.Six_dot_15;

import java.util.Scanner;

public class Hypotenuse {

/*(Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
a right triangle when the lengths of the other two sides are given. The method should take two arguments
of type double and return the hypotenuse as a double. Incorporate this method into an
application that reads values for side1 and side2 and performs the calculation with the hypotenuse
method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
triangles in Fig. 6.14. [Note: Class Math also provides method hypot to perform this calculation.]*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side one of a triangle: ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter side two of a triangle: ");
        double side2 = scanner.nextDouble();

        System.out.println(hypotenuse(side1, side2));
    }


    private static double hypotenuse(double num1, double num2){
        double hypotenuse = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
//        return Math.hypot(num1, num2);
        return hypotenuse;
    }

}
