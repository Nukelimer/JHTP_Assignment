package Chapter_6_Exercises.Six_dot_22;

import java.util.Scanner;

public class TemperatureConversions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature:");
        double userTemperature = scanner.nextDouble();


        System.out.println(Kelvin(userTemperature));
        System.out.println(Celsius(userTemperature));

    }

    public static double Kelvin(double Celsius){
        double temperature = Celsius + 273.15;


        return temperature;
    }

    public static double Celsius(double Kelvin){
        double temperature = Kelvin - 273.15;


        return temperature;
    }

}
