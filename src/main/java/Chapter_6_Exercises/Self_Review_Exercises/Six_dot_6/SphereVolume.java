package Chapter_6_Exercises.Self_Review_Exercises.Six_dot_6;

import java.util.Scanner;

public class SphereVolume {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the radius of the sphere?: ");
        double radius = scanner.nextDouble();

        System.out.printf("Result: %f", sphereVolume(radius));

    }

    public static double sphereVolume (double radius){
        return   (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

    }
}
