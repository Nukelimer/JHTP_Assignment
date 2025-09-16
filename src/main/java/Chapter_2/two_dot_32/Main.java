package Chapter_2.two_dot_32;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BMI_Calculator();
    }

    public static void BMI_Calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in Kg:   ");
        double userWeight = scanner.nextDouble();
        System.out.print("Enter your height in metres E.G(1.88m):  ");
        double userHeightInInches = scanner.nextDouble();


        double result = userWeight / (userHeightInInches * userHeightInInches);

        System.out.println(result);


        scanner.close();

    }
}
