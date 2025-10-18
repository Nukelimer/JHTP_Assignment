package Chapter_6_Exercises.Six_dot_32;

import java.util.Scanner;

public class DistanceBetweenPoints {

/*(Distance Between Points) Write method distance to calculate the distance between two
points (x1, y1) and (x2, y2). All numbers and return values should be of type double. Incorporate
this method into an application that enables the user to enter the coordinates of the points.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter point x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("enter point y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("enter point x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("enter point y2: ");
        double y2 = scanner.nextDouble();

        System.out.printf( "%.2f",  distanceBetweenPoints(x1, y1, x2, y2));
    }


    private static double distanceBetweenPoints(double x1,  double y1, double x2, double y2){

        double diffInPointX = x1 - x2;
        double diffInPointY = y1 - y2;
        double distanceSquareX = (diffInPointX * diffInPointX);
        double distanceSquareY = (diffInPointY * diffInPointY);
        double distance = distanceSquareY + distanceSquareX;

        return Math.sqrt(distance);
    }
}
