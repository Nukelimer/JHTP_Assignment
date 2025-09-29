package Chapter_4_Exercises.four_dot_30;

import java.util.Scanner;

public class Right_Angle_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int baselength = 0;
        System.out.println("Enter the base length of the triangle");
        baselength = scanner.nextInt();


        while (baselength < 1 || baselength > 10 ){
            System.out.println("Invalid:");
            baselength = scanner.nextInt();
        }

        int i = 1;

        while (i <= baselength){
            int j = 1;

            while (j <= i){
                System.out.print("*");
                j++;

            }
            System.out.println();

            i++;

        }
        scanner.close();
    }
}
