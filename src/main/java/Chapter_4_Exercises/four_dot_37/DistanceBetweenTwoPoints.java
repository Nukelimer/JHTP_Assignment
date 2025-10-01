package Chapter_4_Exercises.four_dot_37;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("first number in point y in double(2.18): ");
        double y1 = scanner.nextDouble();
        System.out.print("second number in point y in double(2.18): ");
        double y2 = scanner.nextDouble();
        System.out.print("first number in point x in double(2.18): ");
        double x1 = scanner.nextDouble();
        System.out.print("second number in point x in double(2.18): ");
        double x2 = scanner.nextDouble();


        if (x1 == x2){
            System.out.println("vertical");
        } else if (y2 == y1) {
            System.out.println("horizontal");
        }else {
            System.out.println("line is neither vertical or horizontal.");
        }

    }
}
